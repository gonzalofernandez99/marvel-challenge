package com.example.marvel_challenge.persistence.integration.marvel;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class MarvelApiConfig {
    private final PasswordEncoder md5Encoder;
    private long timestamp = new Date(System.currentTimeMillis()).getTime();

    @Value("${integration.marvel.public-key}")
    private String publicKey;
    @Value("${integration.marvel.private-key}")
    private String privateKey;

    public MarvelApiConfig(@Qualifier("md5Encoder") PasswordEncoder md5Encoder) {
        this.md5Encoder = md5Encoder;
    }

    private String getHash() {
        String hashDecoded = Long.toString(timestamp).concat(privateKey).concat(publicKey);
        return md5Encoder.encode(hashDecoded);
    }

    public Map<String, String> getAuthParams() {
        Map<String, String> authParams = new HashMap<>();

        authParams.put("ts", Long.toString(timestamp));
        authParams.put("apikey", publicKey);
        authParams.put("hash", this.getHash());

        return authParams;
    }
}
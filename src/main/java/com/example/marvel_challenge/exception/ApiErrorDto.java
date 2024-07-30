package com.example.marvel_challenge.exception;

public record ApiErrorDto(
        String message,
        String backendMessage,
        String method,
        String url
) {
}

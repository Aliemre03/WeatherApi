package com.aed.weather.exception;

public record ErrorResponse (
        String success,
        Error error
) { }
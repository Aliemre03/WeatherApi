package com.aed.weather.exception;

public record Error (
        String code,
        String type,
        String info
) { }
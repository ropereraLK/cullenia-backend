package com.cullenia_backend.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ErrorResponse {
    private String code;
    private String message;
    private OffsetDateTime timestamp;

}

package com.antonio32a.privateapi.responses;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorResponse extends Response {
    private final String error;
}

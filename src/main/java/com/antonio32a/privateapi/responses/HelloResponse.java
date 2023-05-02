package com.antonio32a.privateapi.responses;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class HelloResponse extends Response {
    private final String name;
    private final String version;
    private final long buildTime;
}

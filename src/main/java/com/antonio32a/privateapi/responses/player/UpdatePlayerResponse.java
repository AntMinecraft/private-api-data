package com.antonio32a.privateapi.responses.player;

import com.antonio32a.privateapi.responses.Response;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UpdatePlayerResponse extends Response {
    private final boolean success;
}

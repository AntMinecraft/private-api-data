package com.antonio32a.privateapi.responses.player;

import com.antonio32a.privateapi.data.PlayerProfile;
import com.antonio32a.privateapi.responses.Response;
import lombok.Builder;
import lombok.Getter;
import org.jetbrains.annotations.Nullable;

@Getter
@Builder
public class GetPlayerResponse extends Response {
    @Nullable private final PlayerProfile player;
}

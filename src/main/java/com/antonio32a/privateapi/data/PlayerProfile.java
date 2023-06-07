package com.antonio32a.privateapi.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
public class PlayerProfile {
    private String id;
    private String name;
    private Long lastUpdated = System.currentTimeMillis();
    private Map<String, Integer> actionBarComponentPositions = new HashMap<>();
    private SoldiersProfile soldiersProfile = new SoldiersProfile();
    @Nullable private Integer test;

    /**
     * Create a default player profile with the only required fields.
     *
     * @param playerId The UUID of the player.
     * @param name     The name of the player.
     * @return The player profile.
     */
    @NotNull
    public static PlayerProfile createDefault(@NotNull UUID playerId, @NotNull String name) {
        PlayerProfile profile = new PlayerProfile();
        profile.setId(playerId.toString());
        profile.setName(name);
        return profile;
    }
}

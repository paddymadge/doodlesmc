package doodlesmc.utils;

import java.util.HashMap;
import java.util.UUID;

public class CooldownManager {
    private final HashMap<UUID, Long> cooldownRegistry;
    private final int cooldownLength;

    public CooldownManager(int cooldownLength) {
        this.cooldownRegistry = new HashMap<>();
        this.cooldownLength = cooldownLength;
    }

    public long getCooldownTime(UUID uuid) {
        if (!this.cooldownRegistry.containsKey(uuid)) return -1;

        Long cooldownExpireTime = this.cooldownRegistry.get(uuid);
        return cooldownExpireTime - System.currentTimeMillis();
    }

    public void start(UUID uuid) {
        this.cooldownRegistry.put(uuid, System.currentTimeMillis() + (cooldownLength * 1000L));
    }
}

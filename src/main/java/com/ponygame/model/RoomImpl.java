package com.ponygame.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Thread-safe Room implementation
 */
public class RoomImpl implements Room {
    private final List<User> participants = new ArrayList<>();
    private final UUID uuid = UUID.randomUUID();

    @Override
    public void join(User user) {
        synchronized (participants) {
            if (isReadyToJoin()) {
                participants.add(user);
            }
        }
    }

    @Override
    public boolean isReadyToJoin() {
        boolean result;
        synchronized (participants) {
            result = participants.size() < MAX_PARTICIPATNS_COUNT;
        }
        return result;
    }

    @Override
    public UUID getId() {
        return uuid;
    }

    @Override
    public List<User> getParticipants() {
        return participants;
    }
}

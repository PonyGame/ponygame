package com.ponygame.model;

import java.util.List;
import java.util.UUID;

public interface Room {
    static int MAX_PARTICIPATNS_COUNT = 4;

    void join(User user);

    boolean isReadyToJoin();

    UUID getId();

    List<User> getParticipants();
}

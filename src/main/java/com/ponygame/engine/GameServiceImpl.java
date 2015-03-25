package com.ponygame.engine;

import com.ponygame.model.Room;
import com.ponygame.model.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class GameServiceImpl implements GameService {
    private final Map<UUID, Room> rooms = new HashMap<>();

    @Autowired
    private RoomFactory roomFactory;

    @Override
    public Room createRoom(User user) {
        return roomFactory.createRoom(user);
    }

    @Override
    public Room searchPlayableRoom() {
        Room result = null;
        synchronized (rooms) {
            for (Map.Entry<UUID, Room> entry : rooms.entrySet()) {
                Room room = entry.getValue();
                if (room.isReadyToJoin()) {
                    result = room;
                }
            }
        }
        return result;
    }
}

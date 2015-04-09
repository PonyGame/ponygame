package com.ponygame.engine;

import com.ponygame.model.Room;
import com.ponygame.model.RoomImpl;
import com.ponygame.model.User;
import org.springframework.stereotype.Component;

@Component
public class RoomFactoryImpl implements RoomFactory {

    @Override
    public Room createRoom(User user) {
        Room room = new RoomImpl();
        room.join(user);
        return room;
    }
}

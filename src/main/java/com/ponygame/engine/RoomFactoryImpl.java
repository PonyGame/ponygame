package com.ponygame.engine;

import com.ponygame.model.Room;
import com.ponygame.model.RoomImpl;
import com.ponygame.model.User;
import org.springframework.stereotype.Component;

@Component
public class RoomFactoryImpl implements RoomFactory {

    @Override
    public Room createRoom(User... users) {
        Room room = new RoomImpl();
        for (int i = 0; i < users.length; i++) {
            if (room.isReadyToJoin()) {
                room.join(users[i]);
            } else {
                break;
            }
        }
        return room;
    }
}

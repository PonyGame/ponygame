package com.ponygame.engine;

import com.ponygame.model.Room;
import com.ponygame.model.User;

public interface RoomFactory {

    Room createRoom(User... users);

}

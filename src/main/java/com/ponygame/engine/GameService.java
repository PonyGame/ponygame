package com.ponygame.engine;

import com.ponygame.model.Room;
import com.ponygame.model.User;

public interface GameService {

    Room createRoom(User user);

    Room searchPlayableRoom();

}

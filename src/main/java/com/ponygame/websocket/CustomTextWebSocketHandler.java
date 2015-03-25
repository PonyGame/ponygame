package com.ponygame.websocket;

import org.apache.log4j.Logger;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class CustomTextWebSocketHandler extends TextWebSocketHandler {
    private static Logger LOGGER = Logger.getLogger(CustomTextWebSocketHandler.class);

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        super.handleTextMessage(session, message);
        session.sendMessage(new TextMessage("'" + message.getPayload() + "' received at server"));
    }


}
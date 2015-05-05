package com.ponygame.velocity;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.stereotype.Component;

@Component
public class JsVelocityHelper {

    public String generateInputVarForJs(String key, String value) {
        return "<input type=\"hidden\" id=\"" + key +"\" value=\"" + value + "\"></input>";
    }
}

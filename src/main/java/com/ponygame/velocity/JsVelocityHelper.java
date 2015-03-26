package com.ponygame.velocity;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.stereotype.Component;

@Component
public class JsVelocityHelper {

    private VelocityEngine velocityEngine;

    public void setVelocityEngine(VelocityEngine velocityEngine) {
        this.velocityEngine = velocityEngine;
    }

    public VelocityEngine getVelocityEngine() {
        return velocityEngine;
    }
}

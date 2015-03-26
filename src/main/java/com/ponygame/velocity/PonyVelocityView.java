package com.ponygame.velocity;

import org.springframework.web.servlet.view.velocity.VelocityView;

import java.util.HashMap;

public class PonyVelocityView extends VelocityView {
    public PonyVelocityView() {
        super();
        setToolAttributes(new HashMap<String, Class<?>>() {{
            put("jsHelper", JsVelocityHelper.class);
        }});
    }


}

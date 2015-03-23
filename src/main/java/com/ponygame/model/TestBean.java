package com.ponygame.model;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
    private String field;

    public TestBean(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}

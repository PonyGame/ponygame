package com.ponygame.model;

import org.apache.log4j.Logger;

public class TestBean {
    private String field;
    private static Logger LOGGER = Logger.getLogger(TestBean.class);

    public TestBean(String field) {
        LOGGER.debug("TestBean is created successfully");
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}

package com.spyeic.crawler4j.format.json;

public class JSONBoolean extends JSONValue<Boolean> {
    private final boolean value;

    protected JSONBoolean(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value ? "true" : "false";
    }

    @Override
    public Boolean getValue() {
        return value;
    }
}

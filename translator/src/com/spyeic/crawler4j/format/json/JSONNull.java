package com.spyeic.crawler4j.format.json;

public class JSONNull extends JSONValue<Object> {
    protected JSONNull(){}

    @Override
    public String toString() {
        return "null";
    }

    @Override
    public Object getValue() {
        return null;
    }
}

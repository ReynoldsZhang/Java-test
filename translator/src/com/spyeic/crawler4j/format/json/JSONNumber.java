package com.spyeic.crawler4j.format.json;

public class JSONNumber extends JSONValue<Number> {
    private final Number value;

    protected JSONNumber(Number num) {
        this.value = num;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public Number getValue() {
        return value;
    }
}

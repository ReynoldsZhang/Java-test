package com.spyeic.crawler4j.format.json;

import java.io.File;
import java.util.*;

/**
 * A packaging class for HashMap.
 */
public class JSONObject extends JSONContainer implements Map<String, JSONElement> {
    private final LinkedHashMap<String, JSONElement> map = new LinkedHashMap<>();

    /**
     * Create a new JSONObject.
     */
    public JSONObject() {
    }

    public static JSONObject from(String json) throws JSONConvertException {
        return JSONParser.parse(json);
    }

    public static JSONObject from(File jsonFile) throws JSONConvertException {
        return JSONParser.parse(jsonFile);
    }

    public JSONObject setEntry(String key, Number value) {
        return setEntry(key, new JSONNumber(value));
    }

    public JSONObject setEntry(String key, String value) {
        return setEntry(key, new JSONString(value));
    }

    public JSONObject setEntry(String key, boolean value) {
        return setEntry(key, new JSONBoolean(value));
    }

    public JSONObject setEntry(String key, List<JSONElement> value) {
        return setEntry(key, (JSONElement) new JSONArray(value));
    }

    public JSONObject setEntry(String key, String... values) {
        return setEntry(key, (JSONElement) JSONHelper.jsonArrayOf(values));
    }

    public JSONObject setEntry(String key, Number... values) {
        return setEntry(key, (JSONElement) JSONHelper.jsonArrayOf(values));
    }

    public JSONObject setEntry(String key, JSONObject value) {
        return setEntry(key, (JSONElement) value);
    }

    public JSONObject setNullEntry(String key) {
        return setEntry(key, new JSONNull());
    }

    public JSONObject setEntry(String key, JSONElement value) {
        this.put(key, value);
        return this;
    }

    public JSONObject newChildObject(String key) {
        JSONObject child = new JSONObject();
        child.setFather(this);
        this.setEntry(key, child);
        return child;
    }

    public String beautify() {
        return beautify(0);
    }

    @Override
    protected String beautify(int indentation) {
        int next = indentation + 1;
        List<Map.Entry<String, JSONElement>> list = map.entrySet().stream().toList();
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (map.size() > 0) {
            sb.append(System.lineSeparator()).append("\t".repeat(next));
            if (list.get(0).getValue() instanceof JSONContainer) {
                sb.append(JSONHelper.toKeyValueSet(list.get(0).getKey(), ((JSONContainer) list.get(0).getValue()).beautify(next)));
            } else {
                sb.append(JSONHelper.toKeyValueSet(list.get(0).getKey(), list.get(0).getValue()));
            }
            for (int i = 1; i < list.size(); i++) {
                sb.append(",")
                        .append(System.lineSeparator()).append("\t".repeat(next));
                if (list.get(i).getValue() instanceof JSONContainer) {
                    sb.append(JSONHelper.toKeyValueSet(list.get(i).getKey(), ((JSONContainer) list.get(i).getValue()).beautify(next)));
                } else {
                    sb.append(JSONHelper.toKeyValueSet(list.get(i).getKey(), list.get(i).getValue()));
                }
            }
            sb.append(System.lineSeparator()).append("\t".repeat(indentation));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        List<Map.Entry<String, JSONElement>> list = map.entrySet().stream().toList();
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (map.size() > 0) {
            sb.append(JSONHelper.toKeyValueSet(list.get(0).getKey(), list.get(0).getValue()));
        }
        for (int i = 1; i < list.size(); i++) {
            sb.append(", ").append(JSONHelper.toKeyValueSet(list.get(i).getKey(), list.get(i).getValue()));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public JSONElement get(Object key) {
        return map.get(key);
    }

    @Override
    public JSONElement put(String key, JSONElement value) {
        Objects.requireNonNull(key);
        Objects.requireNonNull(value);
        value.setFather(this);
        return map.put(key, value);
    }

    @Override
    public JSONElement remove(Object key) {
        JSONElement result = map.remove(key);
        result.setFather(null);
        return result;
    }

    @Override
    public void putAll(Map<? extends String, ? extends JSONElement> m) {
        m.forEach((key, value) -> value.setFather(this));
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<String> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<JSONElement> values() {
        return map.values();
    }

    @Override
    public Set<Entry<String, JSONElement>> entrySet() {
        return map.entrySet();
    }
}

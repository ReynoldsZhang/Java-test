package cn.zzhxccelerator.translator.translators;


import com.spyeic.crawler4j.format.json.JSONConvertException;
import com.spyeic.crawler4j.format.json.JSONObject;
import com.spyeic.crawler4j.format.json.JSONParser;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public abstract class Translator {
    private Setting setting;

    public Translator(Setting setting) {
        this.setting = setting;
    }

    protected void setSetting(Setting setting){
        this.setting = setting;
    }

    protected Setting getSetting(){
        return setting;
    }

    public abstract boolean changeSetting(Setting setting);

    public int requestTest(String errTag){
        JSONObject json;
        try {
            String s = requestJSON("test");
            json = JSONParser.parse(s);
            json.get(errTag).asString();
        }catch (JSONConvertException e){
            return 0;
        }
        return Integer.parseInt(json.get(errTag).toString());
    }

    public URL getRequestURL(String text) throws MalformedURLException {
        String sb = setting.getURL(text);
        return new URL(sb);
    }

    public String requestJSON(String text){
        StringBuilder sb = null;
        try {
            sb = new StringBuilder();
            URL url = getRequestURL(text);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            int temp;
            while ((temp = isr.read()) != -1){
                sb.append((char)temp);
            }
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public abstract String request(String text);


    public abstract static class Setting{
        public final String AND = "&";

        public abstract String getAPI_URL();

        public abstract String getREQUEST_URL(String text);

        public String getURL(String text) {
            return getAPI_URL() + "?" + getREQUEST_URL(text);
        }
    }
}

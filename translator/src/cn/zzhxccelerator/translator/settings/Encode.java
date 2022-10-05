package cn.zzhxccelerator.translator.settings;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encode {
    public static String MD5Encode(String text){
        MessageDigest md5;
        byte[] digest = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            digest = md5.digest(text.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return digest == null ? "null" : byte2hex(digest);
    }

    public static String byte2hex(byte[] b) {
        StringBuilder hs= new StringBuilder();
        String stmp="";
        for (byte value : b) {
            //为了保证二进制机器数不变，这里需要& 0XFF
            stmp = (Integer.toHexString(value & 0XFF));
            //如果只有一位，需要在前面补上0凑足两位
            if(stmp.length() == 1) {
                hs.append("0").append(stmp);
            }else {
                hs.append(stmp);
            }
        }
        return hs.toString();
    }

    public static String URL(String url){
        return URLEncoder.encode(url, StandardCharsets.UTF_8);
    }
}

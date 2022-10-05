package cn.zzhxccelerator.translator.settings;

import cn.zzhxccelerator.translator.translators.Translator;

public class BaiduSetting extends Translator.Setting {

    static final String API_URL = "https://fanyi-api.baidu.com/api/trans/vip/translate";
    static final long SALT = 1435660288L;
    long ID = 20211209001023922L;
    String KEY = "9BoKl7oHYGZERrjxPmFp";
    final String FROM;
    final String TO;

    public BaiduSetting(String FROM, String TO){
        this.FROM = FROM;
        this.TO = TO;
    }

    public BaiduSetting(String FROM, String TO, long ID, String KEY){
        this.FROM = FROM;
        this.TO = TO;
        this.ID = ID;
        this.KEY = KEY;
    }

    @Override
    public String getAPI_URL() {
        return API_URL;
    }

    @Override
    public String getREQUEST_URL(String text) {
        return AND +
                "from=" + FROM + AND +
                "to=" + TO + AND +
                "appid=" + ID + AND +
                "salt=" + SALT + AND +
                "sign=" + sign(text) + AND +
                "q=" + Encode.URL(text);
    }

    public String sign(String text){
        return Encode.MD5Encode(ID + text + SALT + KEY);
    }
}

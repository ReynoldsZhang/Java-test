package cn.zzhxccelerator.translator.translators;

import cn.zzhxccelerator.translator.settings.BaiduSetting;
import com.spyeic.crawler4j.format.json.JSONConvertException;
import com.spyeic.crawler4j.format.json.JSONObject;
import com.spyeic.crawler4j.format.json.JSONParser;


public class BaiduTranslator extends Translator {

    public BaiduTranslator(Setting setting){
        super(setting);
    }

    @Override
    public boolean changeSetting(Setting setting){
        if (setting instanceof BaiduSetting){
            Setting original = getSetting();
            setSetting(setting);
            if (requestTest("error_code") != 0){
                setSetting(original);
                return false;
            }else{
                return true;
            }
        }
        return false;
    }

    @Override
    public String request(String text){
        JSONObject json = null;
        try {
            json = JSONParser.parse(super.requestJSON(text));
            json = json.get("trans_result").asArray().get(0).asObject();
            return json.get("dst").asString();
        } catch (JSONConvertException e) {
            throw new RuntimeException(e);
        }
    }
}

package cn.zzhxccelerator.translator.settings;

import cn.zzhxccelerator.translator.translators.Translator;

public class Settings {
    public static final Translator.Setting BAIDU_EN2ZH_SETTING = new BaiduSetting("en", "zh");

    public static final Translator.Setting BAIDU_ZH2EN_SETTING = new BaiduSetting("zh","en");
}

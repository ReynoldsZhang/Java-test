package cn.zzhxccelerator.translator;

import cn.zzhxccelerator.translator.settings.Settings;
import cn.zzhxccelerator.translator.translators.BaiduTranslator;
import cn.zzhxccelerator.translator.translators.Translator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner a = new Scanner(System.in);
        String in = a.nextLine();
        translateEnglish(in);
        //translateChinese(in);
    }

    public static  void translateEnglish(String sentence){
        Translator enToZh = new BaiduTranslator(Settings.BAIDU_EN2ZH_SETTING);
        String res = enToZh.request(sentence);
        System.out.println(res);
    }

    public static void translateChinese(String sentence){
        Translator zhToEn = new BaiduTranslator(Settings.BAIDU_ZH2EN_SETTING);
        String res2 = zhToEn.request(sentence);
        System.out.println(res2);
    }
}

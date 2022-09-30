package T.A;

import java.io.*;
import java.util.*;

public class AAA {
    BufferedReader br = new BufferedReader(new FileReader("HSK Words.csv"));
    final private ArrayList<String> chineseWords = new ArrayList<>();
    final private ArrayList<ArrayList<String>> englishWords = new ArrayList<ArrayList<String>>();
    private String word;

    public AAA(String word) throws Exception {
        this.word = word;
        String line;

        while ((line = br.readLine()) != null){
            line.replace("\"", "");
            line.replace("/", "'");
            line.replace('(', '.');
            line.replace(')', '.');

            String[] array = line.split(",");

            this.chineseWords.add(array[1]);
            ArrayList<String> addList = new ArrayList<>();
            for (int i = 3; i < array.length; i++) {
                addList.add(array[i]);
            }
            this.englishWords.add(addList);
            //System.out.println(this.chineseWords.get(0).length);

        }
    }

    public String getTranslate(){
        String[] oneWords = word.split(" ");
        String returnWord = "";

        for (String oneWord : oneWords) {
            for (int j = 0; j < englishWords.size(); j++) {
                for (int k = 0; k < englishWords.get(j).size(); k++) {
                    if (oneWord.equals(englishWords.get(j).get(k))) {
                        returnWord += chineseWords.get(j);
                    }
                }
            }
        }
        return returnWord;
    }
}

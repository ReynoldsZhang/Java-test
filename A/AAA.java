package T.A;

import java.io.*;
import java.util.ArrayList;

public class AAA {
    BufferedReader br = new BufferedReader(new FileReader("HSK Words.csv"));
    final private ArrayList<Object> chineseWords = new ArrayList<>();
    final private ArrayList<Object> englishWords = new ArrayList<>();

    public AAA() throws Exception {
        String line;
        while ((line = br.readLine()) != null){
            line.replace("\"", "");
            line.replace("/", ".");
            line.replace("(", ".");
            line.replace(")", "");

            String[] array = line.split(",");

            chineseWords.add(array[1].split("\\."));
            englishWords.add(array[3].split("\\."));


        }
    }
}

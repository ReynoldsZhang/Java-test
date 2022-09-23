package T;

import java.io.*;
import java.util.*;


public class ImportCSV {
    //Read the file.
    BufferedReader br = new BufferedReader(new FileReader("English Chinese Translations.csv"));
        //Store the words in all files.
        private final ArrayList<Translations> name = new ArrayList<>();
        //Count the total number of words
        private int counter = 0;
        //The number of types of words stored with different initial letters
        private final ArrayList<Integer> searchIndex = new ArrayList<>();
        //Stores all initial letters that appear in the file
        private final ArrayList<String> locateList = new ArrayList<>();
        //Storing English words
        private final ArrayList<String> englishWords = new ArrayList<>();
        //Counting the index of each words
        private int indexCounter = 0;
        private String compareWord = "  ";


    public ImportCSV() throws Exception {
        /**
         * Initialize the word and get the index of the listNumber.
         */
        String line;
        while((line = br.readLine()) != null){
            String[] array = line.split(",");

            makeIndex(array, compareWord);

            ArrayList<String> chineseWords = new ArrayList<>(Arrays.asList(array).subList(1, array.length));

            englishWords.add(array[0].toLowerCase());
            name.add(new Translations(array[0], chineseWords, counter));
            counter++;
            compareWord = name.get(name.size()-1).getEnglish();
        }
        searchIndex.add(indexCounter);
    }

    public ArrayList<Integer> getSearchIndex() {
        return searchIndex;
    }

    public ArrayList<Translations> getName() {
        return name;
    }

    public ArrayList<String> getEnglishWords() {
        return englishWords;
    }

    public ArrayList<String> getLocateList() {
        return locateList;
    }



    /**
     * This method is used to distinguish all letters in a file by their first letter.
     */
    public void makeIndex(String[] array, String compareWord){
        if(isSpecial(array[0]) && isSpecial(compareWord)){
            if(array[0].substring(1,2).equals(compareWord.substring(1,2))){
                indexCounter++;
            } else{
                searchIndex.add(indexCounter);
                locateList.add(array[0].substring(1,2));
            }
        } else {
            if(array[0].length() > 3){
                indexCounter++;
            } else{
                searchIndex.add(indexCounter);
                locateList.add(array[0].substring(1,2));
            }
        }
    }

    /**
     * This determines whether the beginning of a String contains a special String.
     */
    public boolean isSpecial(String word){
        switch (word.substring(1,2)){
            case "'":
            case "-":
            case ".":
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case " ":
                return true;
            default:
                return false;
        }
    }


}

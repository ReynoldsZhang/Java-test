package T.WordTranslator;

import T.WordTranslator.ImportCSV;

import java.util.*;

import static T.WordTranslator.T.findSimilarity;


public class Search {
    private final String word;
    ImportCSV theWord = new ImportCSV();
    //Put words similar to those entered by the user into this list, if the user input the wrong word.
    private final ArrayList<Object> mayBeWords = new ArrayList<>();
    //Put possible words in this list.
    private final ArrayList<String> rangeOfWords = new ArrayList<>();
    //Put possible words' index in this list.
    private final ArrayList<Integer> rangeOfIndex = new ArrayList<>();

    public Search (String word) throws Exception {
        this.word = "\"" + word.toLowerCase() + "\"";
        checkLetter();
    }

    /**
     *This method is used to start retrieving the word the user wants.
     * @return toString
     */
    public Object getWord(){

        if(rangeOfWords.contains(this.word.toLowerCase())){
            for (int i = 0; i < rangeOfWords.size(); i++) {
                if(rangeOfWords.get(i).equalsIgnoreCase(this.word)) return theWord.getName().get(rangeOfIndex.get(i));
            }
        } else{
            for (int i = 0; i < rangeOfWords.size(); i++) {
                if(findSimilarity(this.word, rangeOfWords.get(i)) >= 0.8) mayBeWords.add(theWord.getName().get(rangeOfIndex.get(i)));
            }
        }

        return mayBeWords.size() != 0? "We cannot find out the word that your input, maybe you want to search these:" + "\n" + mayBeWords : "Not quite";
    }

    /**
     * This method is used to get the word entered by the user, what is the first letter of the word, and then the index corresponding to searchIndex.
     * @return index
     */
    public int getIndex() {
        if(theWord.isSpecial(this.word)){
            for (int i = 0; i < 13; i++) {
                if (this.word.substring(1,2).equals(theWord.getLocateList().get(i))) return i;
            }
        } else {
            int initial = ("a").charAt(0);
            int wordInitial = this.word.substring(1,2).charAt(0);
            return wordInitial - initial + 13;
        }
        return 0;
    }

    /**
     * Put all the words that are expected to be searched by the user into a list.
     */
    public void checkLetter(){
        int inde = getIndex();
        int i = theWord.getSearchIndex().get(inde);
        int shouldLoop = inde < 38? theWord.getSearchIndex().get(inde + 1) : theWord.getName().size();

        do{
            rangeOfWords.add(theWord.getName().get(i).getEnglish());
            rangeOfIndex.add(i);
            i++;
        } while (i < shouldLoop);
    }
}

package T.WordTranslator;

import java.util.Date;
import java.util.Scanner;

public class Main {
    static boolean wanna = true;

    public static void main(String[] args) throws Exception {
        beginSearch();
    }


    public static void beginSearch() throws Exception {
        do {
            System.out.println("Put a word that you want to search: ");
            Scanner firstWord = new Scanner(System.in);
            String word = firstWord.nextLine();

            // Ensure that the user does not enter extra spaces and cause the system to fail to read.
            word = mergeBlank(word);
            word =trim(word);

            // Call the class.
            Search newWord = new Search(word);

            // Make sure that the user input the word that he wants to search.
            System.out.println("Do you ready to check it? (please input true or false)");
            Scanner judge = new Scanner(System.in);

            if (judge.nextBoolean()) {
                // Start to search the word in the alpha. At the same time, start to timing.
                Date startDate = new Date();
                System.out.println(newWord.getWord());
                Date endDate = new Date();
                System.out.println("The amount of time we had used: " + (endDate.getTime() - startDate.getTime()) + " ms");
                System.out.println();

                // Ask the user that do he wants to do it again. if it not "yes" or "no", the system will ask over and over again.
                do {
                    System.out.println("Do you want to do it again? (yes, continue)");
                    Scanner in = new Scanner(System.in);
                    word = in.nextLine();
                    if (word.equals("yes")) {
                        wanna = true;
                        break;
                    } else if (word.equals("no")) {
                        wanna = false;
                        break;
                    }
                } while (wanna);
            } else {
                System.out.println("Maybe you want to change a word. Do it again");
            }
        } while (wanna);
    }


    /**
     * This function used to get the blank between the word.
     * @param str
     * @param index
     * @return
     */
    public static int getBlank(String str, int index) {
        if (index < str.length()) {
            if (str.charAt(index) == ' ') {
                return getBlank(str, index + 1) + 1;
            } else {
                return 0;
            }
        }
        return 0;
    }

    /**
     * This function used to cancel the blank that unnecessary.
     * @param str
     * @return
     */
    public static String mergeBlank(String str){
        int num;
        String a;
        String b;
        for(int i = 0; i < str.length(); i++){
            num = getBlank(str, i);
            if(num >= 2){
                a = str.substring(0,i);
                b = str.substring(i + num -1);
                str = a+b;
            }
        }
        return str;
    }

    /**
     * This function used to cancel the blank before and after the word.
     * @param str
     * @return
     */
    public static String trim(String str){
        if(str.charAt(0) == ' '){
            str = str.substring(1);
        }

        if (str.charAt(str.length() -1) == ' '){
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }
}

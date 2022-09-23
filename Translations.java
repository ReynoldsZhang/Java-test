package T;

import java.util.ArrayList;

public class Translations {
    private final String english;
    private final ArrayList chinese;
    private final int position;

    public Translations(String english,  ArrayList chinese, int position){
        this.chinese = chinese;
        this.english = english;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public ArrayList getChinese() {
        return chinese;
    }

    public String getEnglish() {
        return english;
    }


    @Override
    public String toString() {
        return "Translations: " + "\n" +
                "English = " + english + '\n' +
                "Chinese = " + chinese + '\n' +
                "Position = " + position + '\n';
    }


}

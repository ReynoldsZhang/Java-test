```java
package train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "TonyZ",   "Justin", "Edwin",  "TonyS");//����Ը�
        System.out.print("������������ ");
        System.out.println(randomSplit(arrayList, new Scanner(System.in).nextInt()));
    }

    public static ArrayList<ArrayList<String>> randomSplit(ArrayList<String> arrayList, int num){
        ArrayList<ArrayList<String>> arr;
        try {
            arr = split(arrayList, num);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return arr;
    }

    private static ArrayList<ArrayList<String>> split(ArrayList<String> original, int num) throws Exception{
        if (original.size() < num){
            throw new SplitException("Can't split: Too many groups. ��Ӧ���������� " + (original.size() + 1) + " ����.");
        }
        final int MEMBER = original.size()/num;
        final int MORE = original.size() % num;

        Collections.shuffle(original);
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        int times = 0;
        while (times < original.size() - MORE){
            ArrayList<String> temp = new ArrayList<>();
            for (int i = 0; i < MEMBER; i++) {
                temp.add(original.get(times));
                times++;
            }
            result.add(temp);
        }
        times = 0;
        for (int i = original.size() - MORE; i < original.size(); i++) {
            result.get(times).add(original.get(i));
            times++;
        }
        return result;
    }

    static class SplitException extends Exception{
        public SplitException() {
            super();
        }

        public SplitException(String message) {
            super(message);
        }
    }
}
```
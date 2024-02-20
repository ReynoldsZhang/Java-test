package cn.zzh.xccelerator.Debug;
import java.util.Arrays;

public class Debuger {
    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 0; i < 10; i++) {
//            count += i;
//            System.out.println("count = " + count);
//            System.out.println("i = " + i);
//        }

        int arr[] = {1, 4, 3, 2, 0, 5};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("1");
        System.out.println("a");

    }
}

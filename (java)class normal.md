package test;

import java.util.ArrayList;

public class normal {
    public static void main(String[] args){

        /*
        ArrayList<String>list = new ArrayList<String>();
        list.add(0, "I");
        list.add(1, "am");
        list.add(2, "your");
        list.add(3, "father");
        list.set(1, "are");
        list.remove(3);
        for(int qoq = 0; qoq<list.size(); qoq++){
            //System.out.print(list.get(qoq)+ " ");
        }
        System.out.println(list.get(2));
         */

        /*
        int[] ar = {4, 9, 10, 11, 121, 125};
        for(int lj = 0; lj < ar.length; lj++){
            int as = ar[lj];
            for(int nh = 2; nh < as; nh++) {
                if (as % nh == 0) {
                    System.out.println(as + "�Ǻ���");
                    break;
                }
            }
        }
         */

        int hell = (int)(Math.random()*7+112);
        //System.out.println(hell);
        //double sxe = Math.random()*119 ;
        //System.out.println(sxe);

        int[] arr = {5, 2, 1, 3, 7};
        for(int nb = 0; nb < arr.length -1; nb++){
            for(int bn = nb+1; bn < arr.length; bn++){
                if(arr[nb] < arr[bn]){
                    int sb = arr[bn];
                    arr[bn] = arr[nb];
                    arr[nb] = sb;
                }
            }
        }
        for(int nb : arr){
            //System.out.print(nb + " ");
        }

        /*
        double opo = 3;
        double pop = Math.sqrt(3);//һ����ȫƽ��������ƽ������ȫƽ���͵���ԭ��������
        System.out.println(Math.pow(pop, 2));//����һ������ȫƽ��������ƽ������ȫƽ����ֻ�����޽ӽ�����
        */

        /*
        String akk = new String("������ʯ���ó�����֮�������ǻ𣬵�ȼϨ��ĵƣ������ǵƣ�����ҹ�е�·��������·����������������");
        String m="����";
        int b = 0;
        for(int o = 0; o < akk.length()-1; o++){
            if(akk.substring(o, o+2).equals(m)){
                b++;
            }
        }
        System.out.println("��������"+b+"������");
         */
    }
}

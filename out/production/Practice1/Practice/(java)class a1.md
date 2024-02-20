```java
package test;

public class a1 {

    String name;
    int money = 100000;//��Ա����
    static int abcd = 12345;//��̬��������static���Σ��ܱ���a1.���ԣ����ã�Ҳ�ܣ���.���ԣ�����
    static int yx ;
    private int xx;
    private int size;
    private int price;
    int a,b;

    /*
    public a1(int b, int a){
        this.a=a;
        this.b=b;
        //System.out.println(a+b);
    }
     */

    public void setS(int size){
        this.size = size;
    }
    public int getS(){
        return size;
    }

    public void setP(int price){
        this.price = price;
    }
    public int getP(){
        return price;
    }



    public void setQ(int xx){//private����֮���������������һ�������¸�ֵ
        this.xx = xx;
    }

    public int  getQ(){//Ҳ����������ֱ�ӵ���
        return xx;
    }

    public static void qaz(){//��̬����   ��ֱ�ӵ���������ľ�̬���������ǲ��ܵ��÷Ǿ�̬����
        System.out.println(abcd);
    }

    public void setMoney() {
        int a=0;
        System.out.println(a);
        System.out.println(abcd);//�ڷǾ�̬�����У���̬�ͷǾ�̬�Կɵ���

    }

    public double num(double a, double b){
        double cc = a+b;
        return cc;

    }
}
```

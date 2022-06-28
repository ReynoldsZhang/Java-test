package test;

public class a1 {

    String name;
    int money = 100000;//成员变量
    static int abcd = 12345;//静态变量（被static修饰）能被（a1.属性）调用，也能（类.属性）调用
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



    public void setQ(int xx){//private修饰之后可以这样，在另一边在重新赋值
        this.xx = xx;
    }

    public int  getQ(){//也可以这样，直接调用
        return xx;
    }

    public static void qaz(){//静态方法   能直接调用类里面的静态变量，但是不能调用非静态变量
        System.out.println(abcd);
    }

    public void setMoney() {
        int a=0;
        System.out.println(a);
        System.out.println(abcd);//在非静态方法中，静态和非静态皆可调用

    }

    public double num(double a, double b){
        double cc = a+b;
        return cc;

    }
}


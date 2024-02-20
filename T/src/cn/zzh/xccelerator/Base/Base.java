package cn.zzh.xccelerator.Base;

public class Base {

    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private  int n4 = 400;

    public Base(){
        System.out.println("Base() is...");
    }
    
    public void test100(){
        System.out.println("test100");
    }

    protected void test200(){
        System.out.println("test200");
    }


}


package test;


public class son extends father{

    int he = 131;



    public void mHe(){
        int he = 134;
        System.out.println(he);
    }

    public void hH(){
        double high = 12.65;
        System.out.println(high);
    }

    public void mmm(){//想调用父类的属性和方法，需要在子类中创建一个新的方法且用super.ababab。
        System.out.println(super.he);
    }

    public void mme(){
        super.mHe();
    }


}


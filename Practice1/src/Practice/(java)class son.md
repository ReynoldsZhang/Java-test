```java
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

    public void mmm(){//����ø�������Ժͷ�������Ҫ�������д���һ���µķ�������super.ababab��
        System.out.println(super.he);
    }

    public void mme(){
        super.mHe();
    }


}
```

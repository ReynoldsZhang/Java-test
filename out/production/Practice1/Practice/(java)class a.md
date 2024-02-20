```java
package test;

public class a{

    public static void main(String[] args) {

        a1 n = new a1();
        a1 car = new a1();
        String pp = new String("hjh");//��Ϊa1����String name�����Կ���ֱ��������Ū����ʱ����.equalsֻ�жϱ���ֵ�Ƿ���ͬ
        String pg = new String("hjh");

        boolean iji = pp.equals(pg);
        /*
        double num1 = 2.2;
        double num2 = 11.1;
         */
        //car.setP(234322);
        //car.setS(121314);

        //System.out.println(n.num(10.1, 2.2));
        //System.out.println(car.getP());
        //System.out.println(car.getS());
        //System.out.println(iji);


        int a = 3;
        int b = 9;
        boolean m = a == b;//˫�Ⱥ����ж����ݻ�������ʱ�����ж��������ݴ�С�Ƿ���ͬ(˫�ȺŲ���������int��double���ͣ�Ҳ������string����
        //System.out.println(m);

        String c = "jjj", d = "ooo";
        boolean wo = c.equals(d);//.equalsֻ���ж�string����
        //System.out.println(n);

    }
}
```
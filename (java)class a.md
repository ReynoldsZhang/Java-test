package test;

public class a{

    public static void main(String[] args) {

        a1 n = new a1();
        a1 car = new a1();
        String pp = new String("hjh");//因为a1中有String name，所以可以直接这样子弄。这时候用.equals只判断表面值是否相同
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
        boolean m = a == b;//双等号在判断数据基本类型时，是判断两个数据大小是否相同(双等号不仅适用于int，double类型，也适用于string类型
        //System.out.println(m);

        String c = "jjj", d = "ooo";
        boolean wo = c.equals(d);//.equals只能判断string类型
        //System.out.println(n);

    }
}
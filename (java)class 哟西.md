package test;

public class 哟西{

    public static void main(String[] args) {
        a1 m = new a1();
        //m.setMoney();
        //System.out.println(a1.abcd);

        a1 mn = new a1();
        a1 nm = new a1();
        a1 wow = new a1();
        //System.out.println(mn.a);


        mn.yx = 4321;
        nm.yx = 12346;
        m.yx = 1;//被static修饰的对象，最新的赋值，接下来就用最新的
        m.setQ(234);
        //wow.a1();
        //System.out.println(mn.yx);
        //System.out.println(nm.yx);
        //System.out.println(m.xx);没法调用a1中的private变量
        //System.out.println(m.getQ());

        //最大公约数和最小公倍数
        /*
        int min = 21;
        int max = 12;
        int up;
        int tui;
        if(min < max){
            up = min;
            for(int nt = up; nt >= 1; nt--){
                if(min%nt == 0 && max%nt == 0){
                    System.out.println("最大公约数就是:" + nt);
                    tui = min * max;
                    System.out.println("最小公倍数是："+ tui/nt);
                    break;
                }
            }
        }
        else{
            up = max;
            for(int nt = up; nt >= 1; nt--){
                if(min%nt == 0 && max%nt == 0){
                    System.out.println("最大公约数就是:" + nt);
                    tui = min * max;
                    System.out.println("最小公倍数是："+ tui/nt);
                    break;
                }
            }
        }
         */

        /*
        //判断一个数是质数还是和数
        int hd = 12121;
        for(int nh = 2; nh < hd; nh++) {
            if (hd % nh == 0) {
                System.out.println(hd + "是和数");
                System.out.println("这个能够将这个数整除的数是："+nh);
                break;
            }
            if(hd - 1 == nh){
                System.out.println(hd + "为质数");
            }
        }
        */

        String[] arr = {"!!!", "*$￥%$#!", "we", "are", "the"};
        for (String lolo : arr) {
            // System.out.println(lolo);
        }

        int[][] AI = {{12, 51, 23, 11, 62},
                {99, 22, 53, 64, 43},
                {13, 24, 42, 22, 65}};
        for (int kill = 0; kill < AI.length; kill++) {
            for (int ip = 0; ip < AI[kill].length; ip++) {
                for (int bn = ip + 1; bn < AI[kill].length; bn++) {
                    if (AI[kill][ip] < AI[kill][bn]) {
                        int ei = AI[kill][bn];
                        AI[kill][bn] = AI[kill][ip];
                        AI[kill][ip] = ei;
                    }
                }
            }
            for(int wa = 0; wa < AI[kill].length; wa++){
                System.out.print(AI[kill][wa] + "\t");
            }
            System.out.println();//这个语句的功能就是换行
        }
    }
}



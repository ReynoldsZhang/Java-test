public static void main(String[] args){
        System.out.println("开始");

        //这是一段输入语句
        //Scanner sc = new Scanner(System.in);
        Scanner csp = new Scanner(System.in);

        //将输入所得的值保存
        //int week = sc.nextInt();
        int month = csp.nextInt();

        /*
        //switch比较像if语句，week即所要进行比较判断的值或者说 条件
        switch (week) {
            //case后面跟的是要和表达是比较的值
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周七");
                break;
            //default类似于else当前面所有不匹配的时候执行这一段话，其中break可写可不写
            default:
                System.out.println("非周中数字");
        }
        */


        //case穿透(减少运行时间)
        switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("超过12月了");
        }
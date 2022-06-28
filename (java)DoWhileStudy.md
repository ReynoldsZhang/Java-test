//do while循环和while循环区别在于前者先执行后判断，后者先判断再执行
public static void main(String[] args) {
        //输出五次hello world
        //for语句实现
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
        System.out.println("_________");

        //do while语句实现
        int j = 1;
        do {
            System.out.println("hello world");
            j++;
        }while (j <= 5);
    }
```java
public class SwitchStudy{
public static void main(String[] args){
        System.out.println("��ʼ");

        //����һ���������
        //Scanner sc = new Scanner(System.in);
        Scanner csp = new Scanner(System.in);

        //���������õ�ֵ����
        //int week = sc.nextInt();
        int month = csp.nextInt();

        /*
        //switch�Ƚ���if��䣬week����Ҫ���бȽ��жϵ�ֵ����˵ ����
        switch (week) {
            //case���������Ҫ�ͱ����ǱȽϵ�ֵ
            case 1:
                System.out.println("��һ");
                break;
            case 2:
                System.out.println("�ܶ�");
                break;
            case 3:
                System.out.println("����");
                break;
            case 4:
                System.out.println("����");
                break;
            case 5:
                System.out.println("����");
                break;
            case 6:
                System.out.println("����");
                break;
            case 7:
                System.out.println("����");
                break;
            //default������else��ǰ�����в�ƥ���ʱ��ִ����һ�λ�������break��д�ɲ�д
            default:
                System.out.println("����������");
        }
        */


        //case��͸(��������ʱ��)
        switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("����");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("�ļ�");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�＾");
                break;
            default:
                System.out.println("����12����");
        }
}
```
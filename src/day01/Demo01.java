package day01;

public class Demo01 {
    public static void main(String[] args) {
        char name='权';
        char c=97;  //自动转义
        int a=10;
        int b=(a=8)*(-a+10);
        int d=128;  //128已超出byte的表示范围
        byte e=(byte)d;  //强制类型转换
        System.out.println(name);
        System.out.println(c); //a
        System.out.println(b); //16
        System.out.println(e); //-128
        char x='B';
        switch (x){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("不合格");
                break;
            default:
                System.out.println("无评分");
        }
    }

}

package day01;

public class Demo03 {
    public static void main(String[] args) {
        //打印九九乘法表
        int i=0,j=0;
        for (i=1;i<=9;i++){
            for (j=1;j<=9;j++){
                if (j>i) break;
                System.out.println(j+"×"+i+"="+(i*j)+"  ");
            }
            System.out.println();
        }
    }
}

package day01;

public class Demo02 {
    public static void main(String[] args) {
        int i=100;
        while (i>0){
            System.out.println("hello");
            i=i/2;
        }

        int j=10;
        do{
            System.out.println(j);
            j--;
        }while (j>0);  //dowhile:不论条件满不满足都会先执行一次循环内容

        int k=10;
        System.out.println(++k);//11

        System.out.println(k++);//11
        System.out.println(k);//12
    }
}

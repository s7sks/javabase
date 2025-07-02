package day02;

public class Demo02 {
    public static void main(String[] args) {
        Worker w1=new Worker("李四",28,"男");
        //创建子类对象可以用父类名(类似于强制类型转换(向上转型)),但对象功能停留在父类
        People peop=new Worker("张三",30,"男");
        //可以强制转换回来
        Worker gr=(Worker)peop;
        gr.introduce();

        //判断对象是什么类的:instanceof关键字,真则返回true,假即返回false
        if((peop instanceof People) && (peop instanceof Worker)){
            System.out.println("peop是即People类型的,也是Worker类型的");  //
        }

        //判断两个对象是否相同:equals
        System.out.println(gr.equals(peop));

        System.out.println(w1);
    }
}

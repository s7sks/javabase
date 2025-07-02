package day02;

public class Worker extends People implements Study {
    public Worker(String name, int age, String sex) {  //父类构造方法手写覆盖了,子类跟着创建一样的构造方法
        super(name, age, sex);  //传参给父类构造方法进行初始化
        //构造方法内super前面不能有代码,需写在其后面
    }

    void introduce(){
        System.out.println("我是工人");
    }

    public void study(){
        System.out.println("shi");
        Study.test01();
    }
}

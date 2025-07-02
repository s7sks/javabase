package day02;

interface Study {
    String name="";
    void study();
    //接口可以有默认实现功能
    default void test(){
        System.out.println("我是默认实现");
    }

    static void test01(){
        System.out.println("我是接口里的静态函数");
    }
}

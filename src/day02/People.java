package day02;

public class People {
    String name;
    int age;
    String sex;

    public People(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    //重写toString方法(可以通过向导生成)
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

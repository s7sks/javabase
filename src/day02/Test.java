package day02;

public class Test {

    public static void main(String[] args) {
        Student student1 = new Student(18,"小李","女");
        Student student2 = new Student(18,"小鸿","男");

        if(student1.equals(student2)){
            System.out.println("对象相同");
        }else {
            System.out.println("对象不相同");
        }

        System.out.println(student1);
        System.out.println(student2);
    }
}

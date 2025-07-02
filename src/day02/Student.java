package day02;

//子类
public class Student extends Person implements Study2 {
    private String sex="未知";

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student(int age, String name, String sex) {
        super(age, name);
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age='" + getAge() + '\'' +
                "name='" + getName() + '\'' +
                "sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return this.getAge()==((Student)obj).getAge();
    }

    @Override
    public void study2(){
        System.out.println("我在学习");
    }
}

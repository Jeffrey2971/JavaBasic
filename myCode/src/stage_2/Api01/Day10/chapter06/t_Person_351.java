package stage_2.Api01.Day10.chapter06;

import java.io.Serializable;

public class t_Person_351 implements Serializable {
    private String name;
    private int age;

    public t_Person_351(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public t_Person_351() {
    }

    @Override
    public String toString() {
        return "t_Person_351{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

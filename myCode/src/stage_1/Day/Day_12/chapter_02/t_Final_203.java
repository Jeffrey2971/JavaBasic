package stage_1.Day.Day_12.chapter_02;

/*
final关键字代表最终、不可改变的。
常见的四种用法：
1、可以用来修饰一个类
2、也可以用来修饰一个方法
3、还可以用来修饰一个局部变量
4、还可以用来修饰一个成员变量
 */

public class t_Final_203 {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1); // 10
        num1 = 20;
        System.out.println(num1); // 20

        // 一旦使用final用来修饰局部变量，那么这个变量就不能进行更改。
        // ’一次赋值，终生不变‘
        final int num2 = 200;
        System.out.println(num2);
//        num2 = 250; 错误写法，不能改变

        // 正确写法，只要保证有唯一一次赋值即可
        final int num3;
        num3 = 30;

        // 对于基本类型来说，不可变说的是变量当中的数据不可改变
        // 对于引用类型来说，不可变说的是变量当中的地址值不可改变

        t_Student_208 stu1 = new t_Student_208("张雯蔚");
        System.out.println(stu1);
        System.out.println(stu1.getName()); // 张雯蔚
        stu1 = new t_Student_208("玮海琼");
        System.out.println(stu1);
        System.out.println(stu1.getName()); // 玮海琼
        System.out.println("------------------------------------");

        final t_Student_208 stu2 = new t_Student_208("陈禧");
//        stu2 = new t_Student_208("蔡蔡"); 错误写法，final的引用类型变量，其中的地址不可改变
        System.out.println(stu2.getName()); // 陈禧
        stu2.setName("蔡蔡");
        System.out.println(stu2.getName()); // 蔡蔡
    }
}

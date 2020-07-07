package stage_2.Api01.Day12.chapter03;

/*
    java.util.function.Predicate<T> 接口。
    作用：对某种数据类型的数据进行判断，结果返回一个布尔值

    Predicate 接口中包含一个抽象方法: boolean test(T t) 。用于条件判断的场景
        结果：
            符合条件：返回true
            不符合条件：返回false
 */

import java.util.function.Predicate;

public class t_Predicate_375 {
    /*
        定义一个方法，
        参数传递一个String类型的字符串
        参数传递一个Predicate接口，泛型使用String
        使用Predicate中的方法test对字符串进行判断，并把判断结果返回
     */
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        // 定义一个字符串
        String s = "jeffrey";

        // 调动checkString方法对字符串进行校验，参数传递字符串和lambda表达式
        boolean b = checkString(s,(str)->{
            // 对参数传递的字符串进行判断，判断字符串的长度是否大于5，并把判断的结果返回
            return str.length() > 5;

        });
        System.out.println(b);

    }
}

package stage_2.Api01.test;

/*
    要求：模拟用户注册操作，如果用户已存在，则抛出异常并提示：该用户已被注册

    分析：
        1、使用数组保存已经注册过的用户名（数据库）
        2、使用Scanner获取用户输入的注册的用户名（前端，页面）
        3、定义一个方法，对用户输入的注册的用户名进行判断
            1、遍历数组已经存在注册过的用户名
            2、使用获取到的用户名和用户输入的用户名比较
                true：用户名已存在则抛出RegisterException该用户已被注册
                false：继续循环
        如果循环结束了还没有找到重复的用户名，提示用户注册成功
 */

import java.util.Scanner;

public class t_RegisterException_281 {
    // 1、使用数组保存已经注册过的用户名（数据库）
    static String[] usernames = {"张雯蔚", "玮海琼", "陈禧"};

    public static void main(String[] args) /*throws t_RegisterException_280*/ {
        // 2、使用Scanner获取用户输入的注册的用户名（前端，页面）
        Scanner sc = new Scanner(System.in);
        System.out.println("输入您要注册的用户名：");
        String username = sc.next();
        checkUsername(username);

        // 3、定义一个方法，对用户输入的注册的用户名进行判断

    }

    public static void checkUsername(String username) /*throws t_RegisterException_280*/ {
        // 遍历数组已经存在注册过的用户名
        for (String name : usernames) {
            // 使用获取到的用户名和用户输入的用户名比较
            if (name.equals(username)) {
                // true：用户名已存在则抛出RegisterException该用户已被注册
                throw new RuntimeException("该用户已被注册"); // 抛出运行期异常无需处理，交给JVM，中断处理
            }
        }
        // 如果循环结束了还没有找到重复的用户名，提示用户注册成功
        System.out.println("用户注册成功");

    }
}

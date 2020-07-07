package stage_2.Api01.Day13.chapter02.test;

/*
    1. 第一个队伍只要名字为3个字的成员姓名;存储到一个新集合中。
    2. 第一个队伍筛选之后只要前3个人;存储到一个新集合中。
    3. 第二个队伍只要姓张的成员姓名;存储到一个新集合中。
    4. 第二个队伍筛选之后不要前2个人;存储到一个新集合中。
    5. 将两个队伍合并为一个队伍;存储到一个新集合中。
    6. 根据姓名创建 Person 对象;存储到一个新集合中。
    7. 打印整个队伍的Person对象信息。
 */

import java.util.ArrayList;
import java.util.stream.Stream;

public class t_StreamTest_397 {
    public static void main(String[] args) {
//第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        Stream<String> oneStream = one.stream().filter(name -> name.length() == 3).limit(3);

//第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        Stream<String> twoStream = two.stream().filter(name -> name.startsWith("张")).skip(2);
        Stream.concat(oneStream, twoStream).map(name->new t_Person_395(name)).forEach(p-> System.out.println(p));
    }

}

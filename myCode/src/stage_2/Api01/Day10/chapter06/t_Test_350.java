package stage_2.Api01.Day10.chapter06;

/*
    练习：
        序列化集合，当想要在文件中保存多个对象的时候
        可以把多个对象存储到一个集合中，对集合进行序列化和反序列化

    分析：
        1、定义一个存储Person对象的集合ArrayList集合
        2、往ArrayList集合中存储Person对象
        3、创建一个序列化流ObjectOutputStream对象
        4、使用ObjectOutputStream对象中的方法writeObject对象对集合进行序列化
        5、创建一个反序列化ObjectInputStream对象
        6、使用ObjectInputStream对象的方法readObject读取文件中保存的集合
        7、把Object类型的集合转换为ArrayList类型
        8、遍历ArrayList集合
        9、释放资源
 */

import java.util.ArrayList;

public class t_Test_350 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1、定义一个存储Person对象的集合ArrayList集合
        ArrayList<t_Person_351> list = new ArrayList<>();

        // 2、往ArrayList集合中存储Person对象
        list.add(new t_Person_351("张雯蔚", 20));
        list.add(new t_Person_351("玮海琼", 21));
        list.add(new t_Person_351("陈禧", 22));

        // 3、创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter06/list.txt"));

        // 4、使用ObjectOutputStream对象中的方法writeObject对象对集合进行序列化
        oos.writeObject(list);

        // 5、创建一个反序列化ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter06/list.txt"));

        // 6、使用ObjectInputStream对象的方法readObject读取文件中保存的集合
        Object o = ois.readObject();

        // 7、把Object类型的集合转换为ArrayList类型
        ArrayList<t_Person_351> list2 = (ArrayList<t_Person_351>)o;

        // 8、遍历ArrayList集合
        for (t_Person_351 p : list2) {
            System.out.println(p);
        }
        // 9、释放资源
        ois.close();
        oos.close();
    }
}

package stage_2.Api01.Day10.chapter03;

/*
    java.io.BufferedWriter extends Writer
    BufferedWriter：字符缓冲输出流
    继承自父类的共性成员方法：
        void write(int c) 写入单个字符。
        void write(char[] cbuf) 写入字符数组。
        abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        void write(String str) 写入字符串。
        void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
        void flush() 刷新该流的缓冲。
        void close() 关闭此流,但要先刷新它。
    构造方法：
        1、BufferedWriter(writer out)创建一个使用默认大小输出缓冲区的缓冲字符输出流、
        2、BufferedWriter(Writer out, int sz)创建有一个指定缓冲区大小的输出流
        参数：
            Writer out：字符输出流，可以传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，提高FileWriter的写入效率
            int sz：指定缓冲区的大小，不写默认大小
     特有的成员方法：
        vod newLine()：写入一个行分隔符，会根据不同的操作系统，获取不同的行分隔符
     使用步骤：
        1、创建字符缓冲输出流对象，构造方法中传递字符输出流
        2、调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
        3、调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据刷新到文件中
        4、释放资源
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class t_BufferedWriter_338 {
    public static void main(String[] args) throws IOException {
        // 1、创建字符缓冲输出流对象，构造方法中传递字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day10/chapter03/test1.txt"));
        // 2、调用字符缓冲输出流中的方法write，把数据写入到内存缓冲区中
        for (int i = 0; i < 10; i++) {
            bw.write("老八秘制小汉堡");
            bw.newLine();


        }
        // 3、调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据刷新到文件中
        bw.flush();

        // 4、释放资源
        bw.close();
    }
}

package stage_2.Api01.Day11.chapter02;

/*
    文件上传案例服务器端：读取客户端上传的文件保存到服务器的硬盘中，给客户端回写‘上传成功’

    明确：
        数据源：客户端上传的文件
        目的地：服务器的硬盘位置 /upload

    实现步骤：
        1、创建一个服务器ServiceSocket对象，和系统要指定的端口号
        2、使用ServiceSocket对象中的方法accept获取到请求的客户端Socket对象
        3、使用Socket对象中的方法getInputStream获取网络字节输入流InputStream对象
        4、判断服务器 /upload 文件夹是否存在没有则创建
        5、创建一个本地字节输出流对象FIleOutputStream对象，构造方法中绑定要输出的目的地
        6、使用网路字节输入流InputStream对象中的方法read，读取客户端上传的文件
        7、使用本地字节输出流对象FIleOutputStream对象中的方法write把读取到的数据保存到服务器的硬盘上
        8、使用Socket对象中的方法getOutputStream获取网络字节输出流OutputStream对象
        9、使用网络字节输出流OutputStream对象中的write给客户端回写数据上传成功
        10、释放资源（FileOutputStream，Socket，ServiceSocket）
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class t_TCPServer_357 {
    public static void main(String[] args) throws IOException {
        // 1、创建一个服务器ServiceSocket对象，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        // 2、使用ServiceSocket对象中的方法accept获取到请求的客户端Socket对象
        Socket socket = server.accept();
        // 3、使用Socket对象中的方法getInputStream获取网络字节输入流InputStream对象
        InputStream inputStream = socket.getInputStream();
        // 4、判断服务器 /upload 文件夹是否存在没有则创建
        File file = new File("/home/jeffrey/IdeaProjects/JavaLearn/src/stage_2/Api01/Day11/chapter02/upload");

        if (!file.exists()) {
            file.mkdir();
        }
        // 5、创建一个本地字节输出流对象FIleOutputStream对象，构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream(file+  "//" + "README.md");
        // 6、使用网路字节输入流InputStream对象中的方法read，读取客户端上传的文件
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes))!=-1) {
            // 7、使用本地字节输出流对象FIleOutputStream对象中的方法write把读取到的数据保存到服务器的硬盘上
            fos.write(bytes, 0,len);
        }
        // 8、使用Socket对象中的方法getOutputStream获取网络字节输出流OutputStream对象
        // 9、使用网络字节输出流OutputStream对象中的write给客户端回写数据上传成功
        socket.getOutputStream().write("上传成功".getBytes());
        // 10、释放资源（FileOutputStream，Socket，ServiceSocket）
        fos.close();
        socket.close();
        server.close();
    }
}

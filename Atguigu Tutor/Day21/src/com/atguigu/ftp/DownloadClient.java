package com.atguigu.ftp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;

public class DownloadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        SocketAddress server = new InetSocketAddress(InetAddress.getByName("192.168.20.66"), 7788);
        socket.connect(server);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您要下载的文件路径:");
        String path = scanner.next();
        scanner.close();

        // 客户端发送要下载的文件路径
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(path.getBytes());
        socket.shutdownOutput();


        // 读取从服务器获取到的数据
        InputStream inputStream = socket.getInputStream();

        byte[] header = new byte[15];
        int read = inputStream.read(header);
        String s = new String(header, 0, read);
        if (!s.trim().equals("ok")) {
            System.out.println("要下载的文件不存在");
            socket.shutdownInput();
            socket.close();
            return;
        }
        FileOutputStream fos = new FileOutputStream(path);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = inputStream.read(bytes)) != -1) {
            fos.write(bytes, 0, length);
        }
        fos.close();
        socket.shutdownInput();
        socket.close();
    }
}
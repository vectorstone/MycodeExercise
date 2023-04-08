package com.atguigu.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
IP地址+端口+协议  192.168.20.66
InetAddress类表示一个 IP地址对应的主机
*/
public class IPDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getByName("192.168.20.125");
        System.out.println(host.getHostName());
        System.out.println(host.getHostAddress());
    }
}

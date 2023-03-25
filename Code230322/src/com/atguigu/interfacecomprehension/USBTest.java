package com.atguigu.interfacecomprehension;

/**
 * @Description: usb测试, 理解接口的作用
 * @Author: Gavin
 * @Date: 3/22/2023 8:54 PM
 */
public class USBTest {
    public static void main(String[] args) {
        //电脑需要链接打印机了
        Computer computer = new Computer();
        Printer printer = new Printer();

        computer.transferData(printer);
    }

}

class Computer{
    public void transferData(USB usb){//多态: USB usb = new Printer();
        System.out.println("设备链接成功");
        usb.start();
        System.out.println("数据传输的具体操作...");

        usb.stop();
    }
}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}

interface USB{
    //声明一些常量
    //USB的传输协议等等,全世界都一样

    //方法
    public abstract void start();

    public abstract void stop();
}

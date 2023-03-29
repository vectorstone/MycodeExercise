import java.util.Scanner;

/*
设计一套权限管理系统，有   读取r 1  写入w2   执行x 4  删除d 8

用户的权限可以是  0 / r / w / x /d /rw /rx/rd/ wx/wd/xd/ rwx/rwd/wxd / rxd/rwxd
使用数字表示用户的权限  Linux操作系统的文件权限
*/
public class Exercise2 {
    public static void main(String[] args) {
        int readPermission    = 0b00001;  // 读取权限  1
        int writePermission   = 0b00010;  // 写入权限  2
        int executePermission = 0b00100;  // 执行权限  4
        int deletePermission  = 0b01000;  // 删除权限  8
        int modifyPermission  = 0b10000;  // 修改权限  16

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入0~31的整数:");
        int userPermission = scanner.nextInt();
        scanner.close();

        if ((userPermission & readPermission) != 0) {
            System.out.println("读取权限");
        }
        if ((userPermission & writePermission) != 0) {
            System.out.println("写入权限");
        }
        if ((userPermission & executePermission) != 0) {
            System.out.println("执行权限");
        }
        if ((userPermission & deletePermission) != 0) {
            System.out.println("删除权限");
        }
        if ((userPermission & modifyPermission) != 0) {
            System.out.println("修改权限");
        }
    }
}

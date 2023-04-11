package tiku.exercise.readproperties16;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/11/2023 8:52 PM
 */
public class readproperties {
    public static void main(String[] args) throws IOException {
        //创建properties对象
        Properties pro = new Properties();
        //创建字符读取流对象
        FileReader fiw = new FileReader("info.properties");
        //使用load方法读取文件
        pro.load(fiw);
        String user = pro.getProperty("user");
        System.out.println(user);
    }
}

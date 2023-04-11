package tiku.exercise.readfile17;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/11/2023 9:27 PM
 */
public class exercise2 {
    @Test
    public void test() throws FileNotFoundException {
        //创建文件流
        FileInputStream fis = new FileInputStream("GBK.txt");

    }
}

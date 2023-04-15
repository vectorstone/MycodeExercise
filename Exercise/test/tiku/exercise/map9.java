package tiku.exercise;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description:
 * @Author: Gavin
 * @Date: 4/12/2023 6:29 PM
 */
public class map9 {
    @Test
    public void test(){
        String content = "中中国 55kkfff";
        //统计每个字符出现的次数
        //去掉字符串中的空格
        String s = content.replaceAll(" ", "");
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        //统计字符出现的次数,并放到map中
        int x = 1;
        for (int i = 0; i < chars.length; i++) {
            if(map.get(chars[i]) == null){
                map.put(chars[i],x);
            }else{
                map.put(chars[i],map.get(chars[i])+1);
            }
        }
        //遍历输出
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Character, Integer> n : entrySet) {
            System.out.println(n.getKey()+":"+n.getValue());
        }
    }
}

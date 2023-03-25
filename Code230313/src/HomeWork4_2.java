/*
世界上海拔最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如有一张足够大的纸，它的厚度是0.1毫米。
请问，这张纸需要折叠（对折）多少次，才可以折成珠穆朗玛峰的高度?
 */
public class HomeWork4_2 {
    public static void main(String[] args) {
        int thickness = 1;
        int FoldCount = 0;
        int i = 1;
        while(true){
            thickness *= 2;
            if(thickness >= 88488600) break;
            i++;
        }
        System.out.printf("这张纸需要对折%d次才可以达到珠穆朗玛峰的高度",i);
    }
}

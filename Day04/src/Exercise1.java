/*
1. 打印 [2,200]的所有质数
2. 有100担货物，还有100匹马，一匹大马能驼3担货物，一匹中马能驼2担货物
两匹小马能驼1担货物。要求: x+y+z=100  3x+2y+0.5z=100

3x+2y+0.5(100-x-y)=100  x,y是正整数
*/
public class Exercise1 {
    public static void main(String[] args) {
        for (int num = 2; num <= 200; num++) {

            boolean prime = true;  // 假设 num是一个质数
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.println(num);
        }
        System.out.println("-----------------------------");
        // 假设大马x匹(x∈[0,34])，中马y匹(y∈[0,50])，小马100-x-y
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 30; y++) {
                if (3 * x + 2 * y + 0.5 * (100 - x - y) == 100) {
                    System.out.println("x = " + x + ",y = " + y + ",z = " + (100 - x - y));
                }
            }
        }

    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {49,38,65,97,76,13,27,49};
//比较轮数N-1
        for (int j = 0; j <arr.length-1 ; j++) {
            int min=j;//假如当前位置是最小的元素
            //每轮比较次数N-j
            for (int i = j; i <arr.length-1; i++) {
                if(arr[min]>arr[i+1]){
                    //记录找到的最小元素下标
                    min=i+1;
                }
            }
            if(min!=j) {
                int temp = arr[j];
                arr[j] = arr[min];
                arr[min] = temp;
            }
        }

//显示结果
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + "," );

        }

        }
    }

import java.util.Arrays;
import java.util.Random;

public class Chapter5 {
    public static int[] homework4(int[] arrays,int num){
        /** 顺序表插入
         * @param array,insert num
         * @return new array
         */
        int[] result = new int[arrays.length+1];
        for(int i = 1;i<=arrays.length;i++){
            result[i] = arrays[i-1];
        }
        result[0] = num;
        for(int j = 1;j<=arrays.length;j++){
            int temp;
            if (result[j] < result[j-1]){
                temp = result[j];
                result[j] = result[j-1];
                result[j-1] = temp;
            }
        }
        return result;
    }
    public static void homework5(){
        /** 1-100随机生成10个整数，倒序打印，求平均值，最大值最小值下标，查找里面是否有8
         * @param array,insert num
         * @return No return
         */
        Random a = new Random();
        int[] arr = new int[10];
        for(int i=0 ; i<10 ;  i++){
            int ran = a.nextInt(99)+1;
            arr[i]  = ran;
        }
        System.out.println("随机数数组为 "+ Arrays.toString(arr));
        maxAndMin(arr);
        int[] arrSortrd = homework7(arr);
        System.out.println("倒序打印结果：" + Arrays.toString(arrSortrd));
        int sum = 0;
        double ava;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        ava = sum / arr.length;
        System.out.println("平均值为" + ava);
        boolean have8 = false;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == 8){
                have8  = true;
            }
        }
        System.out.println("有8: "+have8);

    }
    public static int[] homework7(int[] arr){
        /** 冒泡排序(倒序)
         * @param array
         * @return arraySorted
         */
        int temp;
        for(int i = arr.length-1;i>0;i--){
            for(int j = 1;j<=i;j++){
                if(arr[j]>arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
    private static void maxAndMin(int[] arr) {
        /** 找最大最小值下标
         * @param array
         * @return No return
         */
        int maxIndex = 0;
        int minIndex = 0;
        for(int i=1;i<arr.length;i++){
            if (arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
            if (arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        System.out.println("最大下标为 " + maxIndex);
        System.out.println("最小下标为 " + minIndex);
    }
}

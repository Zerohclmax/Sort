package Choice;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Choice_sort {
    public static void main(String[] args) {
//        int[] arr = new int[]{101, 34, 119, 1, 34, 2, 5, 3, 3};
//        Choice(arr);
//        System.out.println(Arrays.toString(arr));
        ///////////////////////////测试时间//////////////////////////////////////////////
        Random random = new Random();
        int[] arr=new int[80000];
        for (int i=0;i<80000;i++){
            arr[i]=(int)(Math.random()*80000);
        }
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(data1);
        System.out.println("fist time:"+date1Str);

        Choice(arr);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("last time:"+date2Str);

    }

    public static void Choice(int[] arr) {
        int min_index;
        int min_num;
        for (int i = 0; i < arr.length - 1; i++) {
            min_index = i;
            min_num = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min_num > arr[j]) {
                    min_index = j;
                    min_num = arr[j];
                }
            }
            if (i != min_index) {
                arr[min_index] = arr[i];
                arr[i] = min_num;
            }
        }
    }
}

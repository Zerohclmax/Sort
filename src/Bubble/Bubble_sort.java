package Bubble;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.SimpleTimeZone;

public class Bubble_sort {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,12,6,78,32,9};
//        bubble(arr);
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

        bubble(arr);

        Date data2 = new Date();
        String date2Str = simpleDateFormat.format(data2);
        System.out.println("last time:"+date2Str);
    }

    public static void bubble(int[] arr) {
        boolean is_sort = true;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    is_sort = false;
                }
            }
//            System.out.println("@@@@@"+Arrays.toString(arr));//测试is_sort
            if (is_sort) {
                break;
            } else {
                is_sort = true;
            }
        }
    }
}

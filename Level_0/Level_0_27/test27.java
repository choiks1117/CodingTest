package level0;

import java.util.Arrays;
import java.util.Collections;

public class test27 {

    public static void main(String[] args) {

        int[] sides={1,2,3};
        Integer[] arr = Arrays.stream(sides).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int sum = 0;

        for(int i=1; i<arr.length;i++){
            sum += arr[i];
        }
        sum = sum<=arr[0]? 2 : 1;
        System.out.println(sum);
    }
}

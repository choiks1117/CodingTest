package level0;

import java.util.ArrayList;
import java.util.List;

public class test52 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        String direction = "right2";
        int[] numbers = {1,2,3,4,5,6,7};

        if (direction.equals("right")) {
            list.add(numbers[numbers.length-1]);

            for (int i = 0; i < numbers.length-1; i++) {
                list.add(numbers[i]);
            }

        } else{
            for (int i = 1; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(numbers[0]);
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        for(int i =0; i<answer.length;i++){
            System.out.print(answer[i] + ", ");

        }
    }

}


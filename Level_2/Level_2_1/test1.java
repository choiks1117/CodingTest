package Level2;

import java.util.Arrays;

public class test1 {

    public static void main(String[] args) {
        String s = "1 2 3 4";
        String answer = "";
        String[] str = s.split(" ");
        int[] num = new int[str.length];

        for(int i=0; i<str.length; i++){
            num[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(num);
        answer += num[0]+" ";
        answer += num[num.length-1]+"";

        System.out.println(answer);

    }
}

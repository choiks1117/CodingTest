package level0;

import java.util.ArrayList;

public class test35 {

    public static void main(String[] args) {

        String answer = "";
        String my_string ="hello";
        int n=3;

        char[] ch = my_string.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for(int i=0;i<ch.length;i++){
            for(int j=0;j<n;j++){
                answer+=ch[i];
            }
        }
        System.out.println(answer);


    }
}

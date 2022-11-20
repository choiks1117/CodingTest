package Level2;

import java.util.Arrays;

public class test2 {

    public static void main(String[] args) {

        String s = "3people unFollowed me";
        String answer = "";
        String[] sp = s.split(" ");

        for(int i = 0; i < sp.length; i++){
            if(sp[i].length() == 0) answer += " ";
            else{
                answer += sp[i].substring(0, 1).toUpperCase();
                answer += sp[i].substring(1, sp[i].length()).toLowerCase();
                answer += " ";
            }
        }

        if(s.substring(s.length() -1, s.length()).equals(" ")){
            System.out.println(answer);
        }
        System.out.println(answer.substring(0, answer.length() - 1));

    }
}

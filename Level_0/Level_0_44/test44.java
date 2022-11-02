package level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test44 {

    public static void main(String[] args) {

        String my_string="hi12392";

        List<Integer> answer = new ArrayList<Integer>();
        char[] ch = new char[my_string.length()];
        ch = my_string.toCharArray();

        for(int i=0; i<ch.length;i++){
            if(ch[i]>=48 && ch[i]<=58){
                answer.add(Integer.valueOf(ch[i])-48);
            }
        }
        Collections.sort(answer);

        System.out.println(answer);

    }
}

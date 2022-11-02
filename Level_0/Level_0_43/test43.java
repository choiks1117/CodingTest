package level0;

import java.util.ArrayList;
import java.util.List;

public class test43 {

    public static void main(String[] args) {

        String answer = "";
        String my_string="bus";
        String[] arr = new String[my_string.length()];

        for(int i =0 ; i < my_string.length(); i++){
            arr[i] = my_string.substring(i,i+1);
            if(arr[i].equals("u")){
                arr[i] = "";
            }else if(arr[i].equals("a")){
                arr[i]="";
            }else if(arr[i].equals("i")){
                arr[i]="";
            }else if(arr[i].equals("e")){
                arr[i]="";
            }else if(arr[i].equals("o")){
                arr[i]="";
            }

            answer+=arr[i];
        }
        System.out.println(answer);

    }
}

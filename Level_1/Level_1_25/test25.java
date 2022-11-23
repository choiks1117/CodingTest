package level1;


import java.util.Arrays;

public class test25 {
    public static void main(String[] args) {

        boolean answer = false;
        String s = "a234";

        if(s.length()==4||s.length()==6){

            try{
                Integer.parseInt(s);
                answer = true;
            }catch(NumberFormatException e){

            }
        }

        System.out.println(answer);
    }
}

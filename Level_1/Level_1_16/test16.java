package level1;


public class test16 {
    public static void main(String[] args) {

        String phone_number="01012341234";

        String answer = "";
        char[] ch = phone_number.toCharArray();

        for(int i=0; i<ch.length-4; i++){
            ch[i]= '*';
        }
        System.out.println(String.valueOf(ch));

    }
}

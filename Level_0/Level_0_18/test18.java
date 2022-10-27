package level0;

public class test18 {
    public static void main(String[] args) {

        String my_string = "jaron";

        String answer = "";

        char[] ch = my_string.toCharArray();
        char[] ch2 = new char[my_string.length()];

        for(int i =0; i < ch.length; i++){
            ch2[i] = ch[ch.length-i-1];
        }

        answer = String.valueOf(ch2);

        System.out.println(answer);
    }
}

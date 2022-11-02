package level0;

public class test56 {

    public static void main(String[] args) {

        String answer = "";
        String my_string = "hello";
        int num1=1;
        int num2=2;
        char[] ch = my_string.toCharArray();
        char temp1 = ch[num1];
        char temp2 = ch[num2];

        ch[num1] = temp2;
        ch[num2] = temp1;

        answer = String.valueOf(ch);

        System.out.println(answer);
    }

}


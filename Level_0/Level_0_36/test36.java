package level0;

public class test36 {

    public static void main(String[] args) {

        String my_string ="aAb1B2cC34oOp";
        int answer = 0;
        char[] ch= my_string.toCharArray();

        for(int i =0; i < my_string.length(); i ++){
            if(ch[i]>48 && ch[i]<=57){
                answer += ch[i]-48;
            }
        }
        System.out.println(answer);


    }
}

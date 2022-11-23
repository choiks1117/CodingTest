package level1;


public class test21 {
    public static void main(String[] args) {

        String answer = "";
        String s = "abcde";
        char[] ch = s.toCharArray();
        char[] ch2 = new char[2];
        char[] ch3 = new char[1];
        int l = ch.length;

        if(ch.length%2==1){
            ch3[0]= ch[l/2];
            answer=String.valueOf(ch3);
        }else{
            ch2[1] = ch[l/2];
            ch2[0] = ch[l/2-1];
            answer=String.valueOf(ch2);
        }

        System.out.println(answer);
    }
}

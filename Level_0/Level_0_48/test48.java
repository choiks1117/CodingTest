package level0;

public class test48 {

    public static void main(String[] args) {

        String answer = "";

        String rsp="205";
        char[] ch = rsp.toCharArray();
        for(int i =0; i<ch.length;i++){
            if(ch[i]=='0'){
                ch[i]='5';
            }else if(ch[i]=='2'){
                ch[i]='0';
            }else {
                ch[i]='2';
            }
        }
        answer =  String.valueOf(ch);
        System.out.println(answer);
    }
}

package level0;

public class test30 {

    public static void main(String[] args) {

        int n =1234;
        int answer = 0;
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        for(int i = 0; i<ch.length;i++){
            answer+= ch[i]-48;
        }
        System.out.println(answer);

    }
}

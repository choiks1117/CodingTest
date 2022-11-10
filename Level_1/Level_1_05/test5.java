package level1;

public class test5 {
    public static void main(String[] args) {

        long n =12345;

        String str = n+"";

        char[] ch = str.toCharArray();

        int[] answer = new int[ch.length];

        for(int i = 0; i < ch.length ;i++){
            answer[i] = ch[ch.length-i-1]-48;
        }

        for (int i =0 ; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}

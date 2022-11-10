package level1;

public class test9 {
    public static void main(String[] args) {
        int x = 10;
        boolean answer = true;

        String str = x+"";

        char[] ch = new char[str.length()];
        int[] num = new int[str.length()];
        int sum = 0;

        ch = str.toCharArray();

        for(int i =0;i<ch.length; i++){
            num[i] = ch[i]-48;
            sum += num[i];
        }

        if(x%sum != 0){
            answer = false;
        }

        System.out.println(answer);
    }
}

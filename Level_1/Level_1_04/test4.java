package level1;

public class test4 {
    public static void main(String[] args) {

        int n =123;
        int answer = 0;

        String s = Integer.toString(n);

        for(int i =0; i<s.length() ; i++){
            answer += Integer.parseInt(s.substring(i,i+1));
        }


        System.out.println(answer);
    }
}

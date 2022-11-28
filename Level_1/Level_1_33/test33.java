package level1;


public class test33 {
    public static void main(String[] args) {

        int answer = 0;
        int n = 45;

        String s = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(s);
        String s2 = String.valueOf(sb.reverse());
        answer = Integer.parseInt(s2,3);

        System.out.println(answer);
    }
}

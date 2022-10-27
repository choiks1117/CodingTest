package level0;

public class test16 {
    public static void main(String[] args) {

        int slice = 7;
        int n =10;
        
        int answer =0;
        double b = (double)n/(double)slice;
        if (b != Math.floor(b)) {
            b ++;
        }

        answer = (int)b;
        System.out.println(answer);
    }
}

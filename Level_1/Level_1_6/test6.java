package level1;

public class test6 {
    public static void main(String[] args) {

        long n =121;
        long answer = 0;
        double x = (double)Math.sqrt(n);
        if(x%1==0){
            answer = (long)Math.pow(x+1,2);
        }else{
            answer = -1;
        }
        System.out.println(answer);
    }
}

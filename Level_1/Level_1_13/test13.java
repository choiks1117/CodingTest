package level1;


public class test13 {
    public static void main(String[] args) {


        int a=3, b=5;
        long answer = 0;
        int num =0;

        if(a>=b){
            for(num=b; num <=a; num++){
                answer+=num;
            }
        }else if(a<=b){
            for(num=a; num <=b; num++){
                answer+=num;
            }
        }
        System.out.println(answer);

    }
}

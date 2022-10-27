package level0;

public class test13 {
    public static void main(String[] args) {

        int n =10;
        int k =3;
        int answer = 0;
        int sum = 0;

        for(int i =1 ; i<=n;i++){
            if(i%10==0){
                sum+=2000;
            }
        }
        answer = n*12000 + k*2000 - sum;
        System.out.println(answer);
    }
}

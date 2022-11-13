package test01;

public class main {

    public static void main(String[] args) {
        //1~97 더하기
        int n =97;

        //for문 안쓰고 누적합 구하기
        n = n%2==0?(n+1)*(n/2) : (n+1)*(n/2)+(n+1)/2;
        System.out.println(n);

        System.out.println("--------------");

        //for문으로 누적합 구하기
        int sum =0;
        for(int i =1 ; i<=97; i++){
            sum +=i;
        }
        System.out.println(sum);



    }
}
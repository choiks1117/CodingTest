package level0;

public class test60 {

    public static void main(String[] args) {

        int answer = 0;
        int count=0;

        int n=10;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count>2){
                answer++;

            } count = 0;
        }
        System.out.println(answer);
    }

}


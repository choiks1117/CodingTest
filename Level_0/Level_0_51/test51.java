package level0;

public class test51 {

    public static void main(String[] args) {

        int answer = 0;
        int pizza =6;
        int n=6;
        for(int i = 1; i<=n; i++){
            if(pizza%n==0){
                answer = i;
                break;
            }else{
                pizza+=6;
            }
        }
        System.out.println(answer);
    }
}

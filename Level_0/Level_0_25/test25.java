package level0;

public class test25 {

    public static void main(String[] args) {


        int n = 10;
        int x=0;
        if(n%2==0){
            x = n/2;
        }else{
            x = n/2+1;
        }
        int[] answer = new int[x];
        int count=0;

        for(int i=1; i <= n; i++){
            if(i%2==1){
                answer[count++] = i;
            }
        }

        for(int i=0;i<answer.length ;i++) {
            System.out.println(answer[i]);
        }
    }
}

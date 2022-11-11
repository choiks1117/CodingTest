package level1;


public class test14 {
    public static void main(String[] args) {

        int num =6;
        int answer = 0;
        int i = 1;

        if(num==1){
            i = 0;

        }else if(num!=1){

            while(true){

                if(num%2==0){
                    num/=2;
                }else if(num%2==1){
                    num = num*3+1;
                }

                if(num==1){
                    answer = i;
                    break;
                }else if(i==500){
                    answer = -1;
                    break;
                }
                i++;
            }

        }
        System.out.println(answer);

    }
}

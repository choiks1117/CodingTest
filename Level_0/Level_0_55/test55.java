package level0;

public class test55 {

    public static void main(String[] args) {

        int answer=0;
        int[] numbers={1,2,-3,4,-5};
        for(int i =0; i<numbers.length; i++){
            for(int j =i+1; j<numbers.length;j++){
                if(answer>=numbers[i]*numbers[j]){
                    answer = numbers[i]*numbers[j];
                }
            }
        }
        for(int i =0; i<numbers.length; i++){
            for(int j =i+1; j<numbers.length;j++){
                if(answer<=numbers[i]*numbers[j]){
                    answer = numbers[i]*numbers[j];
                }
            }
        }

        System.out.println(answer);
    }

}


package level0;

public class test24 {

    public static void main(String[] args) {


        int numbers[]={1,2,3,4,5};
        int num1 =1;
        int num2 =3;

        int[] answer = new int[num2-num1+1];


        for(int i = num1; i<=num2; i++) {

            answer[i - num1] = numbers[i];
        }

        for(int i=0;i<answer.length ;i++) {
            System.out.println(answer[i]);
        }
    }
}

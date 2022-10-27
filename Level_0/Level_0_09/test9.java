package level0;

public class test9 {
    public static void main(String[] args) {

        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        double answer = 0;
        double sum = 0;
        double avg = numbers.length;

        for(int i = 0; i < avg; i++){
            sum += numbers[i];
        }

        answer = sum/avg;

        System.out.println(answer);
    }
}

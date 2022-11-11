package level1;


public class test12 {
    public static void main(String[] args) {

        int n = 10;
        int answer = 0;
        while(true) {
            answer++;
            if (n % answer == 1) {
                System.out.println(answer);
                break;
            }
        }

    }
}

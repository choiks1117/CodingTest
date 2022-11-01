package level0;

public class test37 {

    public static void main(String[] args) {

        int hp=23;
        int answer = 0;
        answer +=hp/5;
        answer +=(hp%5)/3;
        answer +=(hp%5)%3/1;
        System.out.println(answer);
    }
}

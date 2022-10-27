package level0;

public class test14 {
    public static void main(String[] args) {

        String message="happy birthday!";

        int answer = 0;

        char[] ch = new char[message.length()];

        for(int i =0;i<message.length(); i++){
            answer += 2;
        }
        System.out.println(answer);
    }
}

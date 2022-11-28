package level1;


public class test32 {
    public static void main(String[] args) {

        String s="try hello world";
        String[] answer = s.split("");
        int index = 0;

        for (int i = 0; i < answer.length; i++){
            // 공백일 경우
            if (answer[i].equals(" ")){
                index = 0;
                answer[i] = " ";
            }
            else{
                if (index % 2 == 0){
                    answer[i] = answer[i].toUpperCase();
                }else{
                    answer[i] = answer[i].toLowerCase();
                }
                index++;
            }
        }
        System.out.println(String.join("", answer));
    }
}

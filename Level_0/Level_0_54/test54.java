package level0;

public class test54 {

    public static void main(String[] args) {

        int age=23;
        String answer = "";
        String str = age +"";
        char[] ch = str.toCharArray();
        for(int i =0; i<ch.length; i++){
            ch[i] += 49;
        }
        answer = String.valueOf(ch);

        System.out.println(answer);
    }

}


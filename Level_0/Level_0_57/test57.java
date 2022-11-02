package level0;

public class test57 {

    public static void main(String[] args) {

        String answer = "";
        String cipher="dfjardstddetckdaccccdegk";
        int code =4;
        char[] ch = cipher.toCharArray();

        for(int i=code-1; i <ch.length; i+=code){
            answer += ch[i]+"";
        }


        System.out.println(answer);
    }

}


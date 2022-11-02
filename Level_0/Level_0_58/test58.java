package level0;

public class test58 {

    public static void main(String[] args) {

        int order =29423;
        int answer = 0;
        String str= order+"";
        char[] ch = str.toCharArray();

        for(int i =0; i<ch.length; i++){
            if(ch[i]==51||ch[i]==54||ch[i]==57){
                answer++;
            }
        }

        System.out.println(answer);
    }

}


package level1;

public class test7 {
    public static void main(String[] args) {

        String s ="pPoooyY";
        boolean answer = true;

        char[] ch = new char[s.length()];

        ch = s.toCharArray();
        int countP=0;
        int countY=0;


        for(int i =0; i<ch.length;i++){
            if(ch[i]=='p'||ch[i]=='P'){
                countP++;
            }else if(ch[i]=='y'||ch[i]=='Y'){
                countY++;
            }
        }
        if(countP == countY){
            answer=true;
        }else{
            answer=false;
        }

        System.out.println("Hello Java");

        System.out.println(answer);
    }
}

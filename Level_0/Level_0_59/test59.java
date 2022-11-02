package level0;

public class test59 {

    public static void main(String[] args) {

        int answer = 0;
        String str = "";
        int[] array={7,77,17};
        for(int i = 0; i<array.length; i++){
            str += array[i]+"";
        }
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]==55){
                answer++;
            }
        }

        System.out.println(answer);
    }

}


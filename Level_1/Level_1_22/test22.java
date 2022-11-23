package level1;


import java.util.ArrayList;
import java.util.List;

public class test22 {
    public static void main(String[] args) {

        String answer = "";

        int n = 3;
        List<String> list = new ArrayList<>();

        for(int i =0; i<n; i++){
            if(i%2==0){
                list.add("수");
            }else{
                list.add("박");
            }
        }
        for(int i =0 ; i<list.size(); i++){
            answer += list.get(i);
        }

        System.out.println(answer);
    }
}

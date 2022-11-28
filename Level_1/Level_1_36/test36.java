package level1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test36 {
    public static void main(String[] args) {

        String[] strings={"sun", "bed", "car"};
        int n =1;

        List<String> list = new ArrayList<>();

        for(int i=0; i<strings.length; i++){
            list.add(strings[i].charAt(n) + strings[i]);
        }

        List<String> collect = list.stream().sorted().collect(Collectors.toList());

        List<String> answer = new ArrayList<>();

        for(int i=0; i<collect.size(); i++){
            answer.add(collect.get(i).substring(1, collect.get(i).length()));
        }

        for (int i =0; i<answer.size();i++){
            System.out.println(answer.get(i));
        }
    }
}

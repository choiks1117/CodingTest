package level0;

public class test22 {

    public static void main(String[] args) {

        int[] num_list = {1,2,3,4,5};

        int[] answer = num_list.clone();

        for(int i =0; i<num_list.length; i++){
            answer[i] = num_list[num_list.length-i-1];
        }
        for(int i=0;i<answer.length ;i++) {
            System.out.println(answer[i]);
        }
    }

}

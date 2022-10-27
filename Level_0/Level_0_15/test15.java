package level0;

public class test15 {
    public static void main(String[] args) {

        int[] num_list ={1, 2, 3, 4, 5};
        int[] answer= new int[2];
        int count1=0;
        int count2=0;

        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                count1++;
            }else{
                count2++;
            }

        }
        answer[0]=count1;
        answer[1]=count2;

        System.out.println(answer);
    }
}

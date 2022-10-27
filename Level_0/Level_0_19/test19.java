package level0;

public class test19 {
    public static void main(String[] args) {

        int money =5500;
        int[] answer = new int[2];
        int count=0;

        for(int i=0; money>0;i++){
            money -= 5500;
            count++;
        }
        if(money<0){
            money+=5500;
            count--;
        }
        answer[1] = money; answer[0]=count;

        System.out.println(answer);
    }
}

package level0;

public class test26 {

    public static void main(String[] args) {

        int[] dot ={2,4};
        int answer = dot[0]>0&&dot[1]>0?1:dot[0]>0&&dot[1]<0?4:dot[0]<0&&dot[1]>0?2:3;
        System.out.println(answer);
    }
}

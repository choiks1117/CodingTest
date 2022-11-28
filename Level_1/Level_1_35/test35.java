package level1;


import java.util.Arrays;

public class test35 {
    public static void main(String[] args) {

        int n = 5;
        int[] arr1 ={9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        String[] first = new String[n];
        String[] second = new String[n];
        String[] sum = new String[n];
        String sp = "0";
        long[] a =new long[n];

        for(int i =0; i<arr1.length; i++){
            first[i] = Long.toString(arr1[i],2);
            second[i] = Long.toString(arr2[i],2);
            a[i] = Long.parseLong(first[i])+Long.parseLong(second[i]);
            sum[i] = a[i]+"";
            int b = n - sum[i].length();
            sum[i] = sp.repeat(b) + sum[i];
            char[] ch = sum[i].toCharArray();
            for(int j =0; j<ch.length;j++){
                if(ch[j]=='0'){
                    ch[j] = ' ';
                }else{
                    ch[j] = '#';
                }
            }
            sum[i] = String.valueOf(ch);
        }

        for (int i =0; i<sum.length;i++){
            System.out.println(sum[i]);
        }
    }
}

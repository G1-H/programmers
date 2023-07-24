package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MakeArray5 {
    public int[] solution(String[] intStrs, int k, int s, int l){
        ArrayList<Integer> list = new ArrayList<>();
        for(String str : intStrs){
            int tempInt = Integer.parseInt(str.substring(s,s+l));
            if(tempInt>k){
                list.add(tempInt);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0 ; i <list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        MakeArray5 ma5 = new MakeArray5();
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        int k = 50000;
        int s= 5;
        int l = 5;
        int[] answer =  ma5.solution(intStrs, k, s,l);
        System.out.println(Arrays.toString(answer));
    }

}

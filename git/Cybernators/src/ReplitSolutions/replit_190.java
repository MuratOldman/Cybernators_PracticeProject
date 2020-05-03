package ReplitSolutions;

import java.util.ArrayList;
import java.util.Arrays;

public class replit_190 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        System.out.println(appendPosSum(list));
    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        int sum=0;
        ArrayList<Integer> result=new ArrayList<>();
        for(Integer each: list){
            if(each>0){
                result.add(each);
                sum+=each;
            }
        }
        result.add(sum);

        return result;



    }
}

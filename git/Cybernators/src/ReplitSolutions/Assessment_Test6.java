package ReplitSolutions;
import java.util.Scanner;

public class Assessment_Test6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String altCase="";
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                altCase+=s.substring(i,i+1).toLowerCase();
            }
            if(i%2!=0){
                altCase+=s.substring(i,i+1).toUpperCase();
            }
        }


        System.out.println(altCase);
    }

}

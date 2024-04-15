import java.util.*;
import java.util.regex.Pattern;


/**
 * pattern
 */
public class pattern {
    public void pattern1(int n){
        for(int i=0;i<n;i++){
            //space 
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        
    }
    public void pattern2(int n){
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){                               //Calculating the spaces in the pattern-> n-i-1
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            } 
            //Space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }  
            System.out.print("\n");                                //Calculating the stars in the pattern-> 2*i+1
        }
    }
    public void pattern3(int n){
        for(int i=0;i<n;i++){
            int num= 1;
            for(int j=0;j<n-i;j++){
                System.out.print(num);
                num++;
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        pattern inp = new pattern();
        inp.pattern1(5);
        System.out.println("\n");
        inp.pattern2(6);
        System.out.println("\n");
        inp.pattern3(4);

    }
}
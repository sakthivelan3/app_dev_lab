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
    public static void main(String[] args) {
        pattern inp = new pattern();
        inp.pattern1(5);

    }
}
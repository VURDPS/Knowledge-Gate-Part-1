import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");    
            }
            System.out.println();
        }
        System.out.println();
        int x = n;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j>=x){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            
            
        }
        System.out.println();
        x--;
    }
        System.out.println();
      for(int i = n; i >= 1; i--){
        for(int j = i; j >= 1; j--){
            System.out.print("* ");
        }
        n--;
        System.out.println();
            
        }

        System.out.println();

        

     }
 }

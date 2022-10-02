import java.util.*;
public class pattern {
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        pattern1(n1);
        int n2= sc.nextInt();
        pattern2(n2);
        int n3= sc.nextInt();
        pattern3(n3);
        int n4= sc.nextInt();
        pattern4(n4);
    }
    static void pattern1(int n){
      for(int i=0;i<n;i++){
        System.out.print("*");
        for(int j=0;j<i;j++){
        if(j<i-1 && i<n-1)
           System.out.print("  ");
       else
           System.out.print(" *");
        }
       System.out.println();
       }
    }
     static void pattern2(int n){
        for(int i=0;i<n;i++){
          for(int j=n-1-i;j>0;j--){
              System.out.print(" ");
          }
           System.out.print("* ");
          for(int j=0;j<i;j++){
            if(j<i-1 && i<n-1)
           System.out.print("  ");
       else
           System.out.print("* ");
          }
          System.out.println();
      }
           
    }
     static void pattern3(int n){

    }
     static void pattern4(int n){

    }
}
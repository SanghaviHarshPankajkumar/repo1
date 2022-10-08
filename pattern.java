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
        int size = sc.nextInt();
        ArrayList<Character> l = new ArrayList<>();
        for(int i=0;i<size;i++){
            char temp = sc.next().charAt(0);
            l.add(temp);
        }
        sortChar(l,size);
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

     int mid  = n/2;
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(j==0 && i<mid) System.out.print("*");
            else if(i==mid) System.out.print("*");
            else if(j==mid) System.out.print("*");
            else if(i==n-1 && j<mid) System.out.print("*");
            else if(i==0 && j>mid) System.out.print("*");
            else if(j==n-1 && i>mid) System.out.print("*");
            else System.out.print(" ");
        }
        System.out.println();
     }
    }
     static void pattern4(int n){
    for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i)System.out.print("*");
                else if(n-j-1==i) System.out.print("*");
                else if(j==0)System.out.print("*");
                else if(j==n-1)System.out.print("*");
                else{System.out.print(" ");}
            }System.out.println();
        }
    }
    static void sortChar(ArrayList<Character> l , int n){
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(l.get(j)>l.get(i)){
                    char temp = l.get(i);
                    l.set(i,l.get(j));
                    l.set(j,temp);
                }
            }
        }
         for(int i=0;i<n;i++){
           System.out.print(l.get(i)+" ");
        }
    }
}
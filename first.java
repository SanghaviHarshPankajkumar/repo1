import java.util.*;
public class first {
   public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        C c = new C();
        System.out.println(c.out());
        System.out.println(c.out2());
        String s1 = sc.nextLine();
        int n = sc.nextInt();
        int[] l =new int[n] ;
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            l[i]=temp;
        }
        System.out.println(isOdd(l,n));
        
        System.out.println(removeSpace(s1));

        
    }
    static String removeSpace(String s1){
        String ans="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' ') {
             ans+=s1.charAt(i);
            }
        }
        return ans;
    }
    static boolean isOdd(int[] l , int n){
         for(int i=0;i<n;i++){
           if(l[i]%2==0) return false; 
        }
        return true;
    }
}
 class A{
    String out(){
        return "it is a class A";
    }
}
 class B extends A{
    String out2(){
        return "it is a class B";
    }
}
 class C extends B{

}
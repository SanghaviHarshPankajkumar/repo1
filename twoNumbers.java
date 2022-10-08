import java.util.*;
public class twoNumbers{
	public static void main(String s[]){
       Scanner sc= new Scanner(System.in);
       int n1 = sc.nextInt();
       int n2= sc.nextInt();
       double permutation = fact(n1)/fact(n1-n2);
       double combination = permutation/fact(n2);
       System.out.printf("The permutation of %d and %d is :  %f",n1,n2,permutation);
       System.out.println();
       System.out.printf("The combination of %d and %d is :  %f",n1,n2,combination);
	}
	public static int fact(int n){
	    if(n==1||n==0) return 1;
	    return n*fact(n-1);
	}
}
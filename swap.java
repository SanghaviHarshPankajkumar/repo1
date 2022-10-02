import java.util.*;
public class swap{
    public static void main(String s[]){
    Scanner sc = new Scanner(System.in);
    int first = sc.nextInt(),second=sc.nextInt();
    System.out.println("the first number is : "+first);
    System.out.println("the second number is : "+second);
    first = first+second;
    second = first-second;
    first = first-second;
    System.out.println("the first number is : "+first);
    System.out.println("the second number is : "+second);
 }
    
}
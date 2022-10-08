import java.util.*;
public class armstrong{
	public static void main(String s[]){
     Scanner sc= new Scanner(System.in);
     int n = sc.nextInt();
      int temp = n;
      int count=0;
      while(temp>0){
          temp/=10;
          count++;
      }
      temp = n;
      int sum =0;
      while(temp>0){
          int digit = temp%10;
          sum+=Math.pow(digit,count);
          temp/=10;
      }
      if(sum==n) System.out.println("The given number is Armstrong number.");
      else System.out.println("The given number is not Armstrong number.");
	}
}
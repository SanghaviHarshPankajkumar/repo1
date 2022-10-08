import java.util.*;
public class exceptionH{
	public static void main(String s[]){
       String str = null;
	   //here string points null object.
      try{
      	if(str.equals("")) System.out.println("The string is same");
      	else System.out.println("The string is not same");
      }
      catch(NullPointerException e){
          System.out.println(e);
      }
	}
}

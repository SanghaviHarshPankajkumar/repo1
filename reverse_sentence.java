import java.util.*;
public class reverse_sentence{
	public static void main(String s[]){
     Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String[] strlist = str.split(" ");
       String ans = "";
       for(int i =strlist.length-1;i>=0;i--){
       ans += strlist[i]+" ";
       }
       System.out.println(ans);
	}
}
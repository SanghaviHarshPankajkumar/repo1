import java.util.*;
public class second{
	public static void main(String s[]){
     Scanner sc =  new Scanner(System.in);
     int n = sc.nextInt();
     List<Integer> l = new ArrayList<>();
     int max1=0,max2=0;
     for(int i=0;i<n;i++){
      int temp = sc.nextInt();
          l.add(temp);
          if(temp>max1){
            if(max1>max2)
               max2= max1;
             max1=temp;
          }
          else if(temp>max2){
            max2= temp;
          }
     }
    System.out.println(max2);
	}
}
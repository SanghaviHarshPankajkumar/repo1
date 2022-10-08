import java.util.*;
public class pattern3{
	public static void main(String s[]){
      
       Scanner sc = new Scanner(System.in);
       int m = sc.nextInt();
       int n= m/2;
       // upper part design
       for(int i=0;i<n;i++){
          
       	for(int j=n-i-1;j>0;j--){
       		System.out.print("  ");
       	}
       	for(int j=0;j<(2*(i+1)-1);j++){
       	    if(j%2==0){
       	        System.out.print("* ");
       	    }
       	    else{
       	        System.out.print(i+" ");
       	    }
       	}
       	System.out.println();
       }
       //lower part design
       for(int i=n-2;i>=0;i--){
           for(int j=n-i-1;j>0;j--){
       		System.out.print("  ");
       	}
           	for(int j=0;j<(2*(i+1)-1);j++){
       	    if(j%2==0){
       	        System.out.print("* ");
       	    }
       	    else{
       	        System.out.print(i+" ");
       	    }
       	}
       	System.out.println();
       }
	}

}
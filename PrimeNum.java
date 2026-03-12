import java.util.*;
public class Main
{
    static boolean isPrime(int n){
       for(int i=2;i<=Math.sqrt(n);i++){
           if(n%i==0){
               return false;
           }
       }
       return true;
    }
	public static void main(String[] args) {
	    System.out.println("Enter the value of n : ");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		System.out.println(isPrime(n));
	}
}

Output :
Enter the value of n : 
25
false

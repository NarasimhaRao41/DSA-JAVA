import java.util.*;
public class Main
{
     static boolean checkPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i = 5 ; i*i <= n; i= i+6){
            if(n%i==0 || n%(i+2)==0){                   // checking for alternate values
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
	    System.out.println("Enter the value of n : ");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		System.out.println(checkPrime(n));
	}
}

Output :
Enter the value of n : 
7
true

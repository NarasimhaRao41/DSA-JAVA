import java.util.*;
public class Main
{
    static void PrimeFactors(int n){
        int i=2;
        while(i*i<=n){
        while(n%i==0){
            System.out.println(i+" - "+n);
            n = n/i;
        }
        i++;
    }
    if(n>1){
        System.out.println(n + " - 1");
    }
}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of n : ");
	    int n = sc.nextInt();
		PrimeFactors(n);
	}
}

Output :
Enter the value of n : 
13
13 - 1

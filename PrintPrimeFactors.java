import java.util.*;
public class Main
{
    static void PrimeFactors(int n){
        int i=2;
        while(n>1){
        while(n%i==0){
            System.out.println(i+" - "+n);
            n = n/i;
        }
        i++;
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
900
2 - 900
2 - 450
3 - 225
3 - 75
5 - 25
5 - 5

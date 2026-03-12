import java.util.*;
public class Main
{
    static void PrintDivisors(int n){
        for(int i =1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                System.out.println(n/i);
            }
        }
    
}
	public static void main(String[] args) {
	    System.out.println("Enter the value of n : ");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		PrintDivisors(n);
	}
}

Output :

Enter the value of n : 
40
1
40
2
20
4
10
5
8

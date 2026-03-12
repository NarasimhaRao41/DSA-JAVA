import java.util.*;
public class Main
{
    static void PrintDivisors(int n){
        int i=0;
        for(i =1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for(;i>=1;i--){
            if(n%i==0 && i!=n/i){
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
2
4
5
8
10
20
40

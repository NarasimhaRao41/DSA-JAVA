import java.util.*;
public class Main
{
    static void SievePrime(int n){
        boolean[] isPrime = new boolean[n+1];
        for(int i = 2 ; i*i<=n ; i++){
            
            if(isPrime[i] == false){
                for(int j=i*i ; j<=n; j=j+i){
                   isPrime[j] = true;
            }
        }
     }
     for(int i=2;i<=n;i++){
         if(isPrime[i] == false){
             System.out.println(i);
         }
     }
}
	public static void main(String[] args) {
	    System.out.println("Enter the value of n : ");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		SievePrime(n);
	}
}


Output :

Enter the value of n : 
55
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53

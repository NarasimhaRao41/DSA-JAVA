import java.util.*;
public class Main
{
    static int Gcd(int a , int b){
        int min =0;
        if(a<b){
            min = a;
        }else{
            min = b;
        }
        for(int i=min-1;i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
		System.out.println(Gcd(a,b));
	}
}
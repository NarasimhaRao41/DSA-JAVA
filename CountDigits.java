import java.util.*;
public class Main
{
    static int CountDigits(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
	public static void main(String[] args) {
	    System.out.println("Enter the value of n : ");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		System.out.println(CountDigits(n));
	}
}


Output : 
Enter the value of n : 
123456789
9

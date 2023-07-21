package printusingrecursion;
import java.util.*;
public class print
{
    static int numberrecursion(int number){
        if (number==0){
            return 0;
        }
            numberrecursion(number-1);
            System.out.println(number);
        return 1;
    }
    public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner A= new Scanner (System.in);
		int number = A.nextInt();
		numberrecursion(number);
	}
}
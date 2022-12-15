
import java.util.Scanner;

public class pin{
	public static void main(String[] args){
		
	    int pin=100,
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=3; i++){
			System.out.println("enter your  pin: ");
			pin = sc.nextInt();
			
			if (p==pin){
				System.out.println("Correct, welcome back.");
				break;
			}
			else{
				count++;
				if(count >= 3){
					System.out.println("Sorry but you have been locked out.");
					break;
				}				
			
				System.out.println("Incorrect, try again.");
				
				
			}
			
		}
    }
		
		
}	
		
	
	
	
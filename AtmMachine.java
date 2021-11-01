package mauleenndlovu.tutorials;
import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		int deposit;
		int withdraw;
		int pin;
		int amount = 3000;
		String name;
		int choice;
		
		Scanner nameInput = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = nameInput.next();
		System.out.println("Welcome to the Bank of America ATM, " + name + ".");
		
		System.out.println("\n");
		
		Scanner pinInput = new Scanner(System.in);
		
		System.out.println("Please enter your 6 digit pin: ");
		pin = pinInput.nextInt();
		
		Scanner x = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Cancel");
			
			System.out.println("\n");
			
			System.out.println("PLEASE SELECT AN OPTION: ");
			
			choice = x.nextInt();
			
			switch(choice) {
			
			case 1: System.out.println("Your current balance is " + amount);
			break;
			
			case 2: System.out.println("How much money would you like to withdraw?");
			withdraw = x.nextInt();
			
			if (amount >= withdraw) {
				amount = amount - withdraw;
				System.out.println("Your current balance is " + amount + ". Please collect your money! ");
			}
			else {
					System.out.println("You have insufficient funds.");
			}
			break;
			
			case 3: System.out.println("Please enter the amount you want to deposit: ");
			deposit = x.nextInt();
			amount = amount + deposit;
			System.out.println("Your current balance is " + amount);
			break;
			
			case 4:
				System.exit(0);
			}
			}
			
		}

}

import java.util.Scanner;

public class OrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		MasterOrder cookies = new MasterOrder();
		
		cookies.addOrder(new CookieOrder("Tagalongs", 1));
		cookies.addOrder(new CookieOrder("Thin mints", 5));
		cookies.addOrder(new CookieOrder("Samoas", 2));
		cookies.addOrder(new CookieOrder("Tagalongs", 3));
		
		System.out.println("Current Order:");
		cookies.showOrder();
		System.out.println("You have ordered " + cookies.getTotalBoxes() + " boxes.");;
		System.out.println("What variety or none would you like to remove?");
		String variety = input.nextLine();
		System.out.println("You are removing " + variety);
		System.out.println("\nUpdated Order: ");
		cookies.showOrder();
		
		
	}

}

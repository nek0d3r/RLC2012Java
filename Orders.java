/******************************************************
* Contestant #: 04-0207-0001
******************************************************/

import java.util.Scanner;

public class Orders
{
	public static void main(String[] args)
	{
		OrderProcessor orders = new OrderProcessor("Orders.txt");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Start processing orders.\n");
		
		orders.processOrders();
		
		System.out.println("Finished processing orders.\n");
		
		System.out.println("Press enter to exit.");
		keyboard.nextLine();
	}
}
import java.io.*;
import java.util.Scanner;

public class OrderProcessor
{
	private String order_id;
	private String part_num;
	private String price;
	private String qty;
	
	private String order;
	private String filename;
	
	public OrderProcessor(String file)
	{
		filename = file;
	}
	
	/*********************************************************
	* Processes the orders
	*********************************************************/
	public void processOrders()
	{
		File orders = new File(filename);
		
		try
		{
			Scanner inputfile = new Scanner(orders);
			inputfile.nextLine();
			do
			{
				order = inputfile.nextLine();
				
				int i = 0;
				do
				{
					i++;
				}
				while(order.charAt(i) != '|');
				
				order_id = order.substring(0, i);
				
				int j = i + 1;
				
				do
				{
					i++;
				}
				while(order.charAt(i) != '|');
				
				part_num = order.substring(j, i);
				
				j = i + 1;
				
				do
				{
					i++;
				}
				while(order.charAt(i) != '|');
				
				price = order.substring(j, i);
				
				j = i + 1;
				
				qty = order.substring(j);
				
				System.out.println("Order ID: " + order_id);
				System.out.println("Part Number: " + part_num);
				System.out.println("Price: " + price);
				System.out.println("Quantity: " + qty);
				
				double tax = Double.parseDouble(price) * .02;
				System.out.println("Tax: " + tax);
				
				double shipping = Double.parseDouble(price) * .05;
				System.out.println("Shipping: " + shipping);
				
				double total = Double.parseDouble(price) + tax + shipping;
				System.out.println("Total: " + total);
				System.out.println();
			}
			while(!(order == ""));
		}
		catch(Exception ex)
		{
		}
	}
}
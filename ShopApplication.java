import java.util.Scanner;// To get user input
import java.util.HashMap; //import HashMaps to easily loop key value pairs and search results
import java.util.Arrays;// import Arrays to get access to sum() average

public class ShopApplication
{
	// creating a method to get IndexOf since array does not have built in function
	public static int getIndexOf(String[] productList, String item) {
	    for (int i = 0; i < productList.length; i++) {
	        if (item.equalsIgnoreCase(productList[i])) return i;// i for item
	    }
	    return -1;
	}
	// startof the main method
	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		// creating an array as per program requirements
		String [] productList = {"Bread", "Milk", "Butter", "Chips", "Honey", "Soap", "Towel", "Carrots", "Beans", "Samp", "Dress", "Pants", "Shoes", "Socks"};
		double [] priceList = {15.50, 12.00, 56.00,20.00, 45.00, 7.00, 75.00, 8.00, 5.00, 12.00, 200.00, 150.00, 400.00, 25.00};
        double averagePrice = Arrays.stream(priceList).sum()/(productList.length);	//getting the sum of an array
        String close = "exit", x;
        // header / navbar
		System.out.println("\n\nItems in stock with prices\n"+"-----------------------------------------------------------");	
		// using HashMaps to easily loop through the product and corresponding price
		HashMap<String, Double> hm = new HashMap<String, Double>();
		for (int i = 0; i < priceList.length; i++) 
		{
			hm.put(productList[i], priceList[i]);
			System.out.println(productList[i] + ": "+priceList[i]);
		} 
		// output the average price
		System.out.println("\nThe average price of items is "+"R" +Math.ceil(averagePrice) + "\n\nFind the price of a specific item – sample input and output.\n+++++++++++++++++++++++ Item Look up +++++++++++++++++++++++");
		
		do {
		System.out.println("\nWhat item are you looking for?: ");
			 x = sc.nextLine();
		// search bar using getIndexOf class
	        int result = getIndexOf(productList, x); 	
	        if (result == -1) 
	            System.out.println("The Item "+x+" is not in the shopping list.Sorry!"); 
	        else
	            System.out.println("The price of "+productList[result]+ " is "+"R" +priceList[result]); 
		}while(close != x);
	}

}
/** Student info:
 * 
 * 21w49247378156
 *Group 1A
*/

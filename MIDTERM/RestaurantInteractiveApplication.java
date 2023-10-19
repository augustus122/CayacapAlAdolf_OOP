import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class RestaurantInteractiveApplication {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Product> products = new ArrayList<>();
		ArrayList<Product> productAddOns = new ArrayList<>();
		ArrayList<Integer> quantity = new ArrayList<>();
		ArrayList<Integer> quantityAddOns = new ArrayList<>();
			
		Product c1 = new Product("C1", 100.00);
		Product c2 = new Product("C2", 150.00);
		Product c3 = new Product("C3", 200.00);
		
		Product r1 = new Product("R1", 35.00);
		Product r2 = new Product("R2", 50.00);
			
		System.out.println("Menu:");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3 + "\n");
		
		System.out.println("Add Ons:");
		System.out.println(r1);
		System.out.println(r2 + "\n");
		
		int order;
		int orderQty = 0;
		int addOns = 0;
		int addOnsQty = 0;
		int yesNo;
		int toOrderAgain;
		double totalPrice = 0;
		
		do {
	       System.out.println("Hello Customer, what would you like to order?\n");
		
		   System.out.println("Options:");
		   System.out.println("1 - C1");
		   System.out.println("2 - C2");
		   System.out.println("3 - C3");
		
		
		System.out.print("\nPlease enter here: ");
		order = scan.nextInt();
		
		  switch(order) {
			
			case 1:
				System.out.println("\nYour Order: " + c1);
				
				products.add(c1);
				   
				System.out.println("\nHow many will you order? ");
				orderQty = scan.nextInt();
				
				quantity.add(orderQty);
			
				System.out.println("\nYou ordered " + orderQty + " " + c1.productID);
				totalPrice += c1.price * orderQty;
				
				do {
				   System.out.println("\nWould you like some Add Ons? 1 - YES | 2 - NO ");
				   yesNo = scan.nextInt();
				   
				   if(yesNo == 1) {
				    do{
				      System.out.println("\nWhat Add Ons would you like? 1 - R1 | 2 - R2");
				      addOns = scan.nextInt();
				      
				      if(addOns == 1) {
				    	  System.out.println("\nYour Add Ons: " + r1); 
				    	  productAddOns.add(r1);
				      }
				      else if(addOns == 2) {
				    	  System.out.println("\nYour Add Ons: " + r2);
				    	  productAddOns.add(r2);
				      }
				      
				      if(addOns == 1 || addOns == 2) {
				    	  System.out.println("\nHow many Add Ons would you like? ");
				    	  addOnsQty = scan.nextInt();
				    	  
				    	  quantityAddOns.add(addOnsQty);
				    	  
				    	  if(addOns == 1) {
				    	     System.out.print("\nYou added " + addOnsQty + " " + r1.productID + " Add Ons");
				    	     totalPrice += r1.price * addOnsQty;
				    	  }
				    	  else if(addOns == 2) {
					         System.out.print("\nYou added " + addOnsQty + " " + r2.productID + " Add Ons");
					         totalPrice += r2.price * addOnsQty;
					      }
				      }
				      
				      if(addOns != 1 && addOns != 2) {
						   System.out.print("\nINVALID INPUT!");
					   }
				      
				   }while(addOns != 1 && addOns != 2);
				  }
				   if(yesNo != 1 && yesNo != 2) {
					   System.out.print("\nINVALID INPUT!");
				   }
				   
				}while(yesNo != 1 && yesNo != 2);
				
				break;
			case 2:
				System.out.println("\nYour Order: " + c2);
				
				products.add(c2);

				System.out.println("\nHow many will you order? ");
				orderQty = scan.nextInt();
							
				quantity.add(orderQty);
				
				System.out.println("\nYou ordered " + orderQty + " " + c2.productID);
				totalPrice += c2.price * orderQty;
				
				do {
				   System.out.println("\nWould you like some Add Ons? 1 - YES | 2 - NO ");
				   yesNo = scan.nextInt();
				   
				   if(yesNo == 1) {
				    do{
				      System.out.println("\nWhat Add Ons would you like? 1 - R1 | 2 - R2");
				      addOns = scan.nextInt();
				      
				      if(addOns == 1) {
				    	  System.out.println("\nYour Add Ons: " + r1);
				    	  productAddOns.add(r1);
				      }
				      else if(addOns == 2) {
				    	  System.out.println("\nYour Add Ons: " + r2);
				    	  productAddOns.add(r2);
				      }
				      
				      if(addOns == 1 || addOns == 2) {
				    	  System.out.println("\nHow many Add Ons would you like? ");
				    	  addOnsQty = scan.nextInt();
				    	  
				    	  quantityAddOns.add(addOnsQty);
				    	  
				    	  if(addOns == 1) {
				    	     System.out.print("\nYou added " + addOnsQty + " " + r1.productID + " Add Ons");
				    	     totalPrice += r1.price * addOnsQty;
				    	  }
				    	  else if(addOns == 2) {
					         System.out.print("\nYou added " + addOnsQty + " " + r2.productID + " Add Ons");
					         totalPrice += r2.price * addOnsQty;
					      }
				      }
				      
				      if(addOns != 1 && addOns != 2) {
						   System.out.print("\nINVALID INPUT!");
					   }
				      
				   }while(addOns != 1 && addOns != 2);
				  } 
				   if(yesNo != 1 && yesNo != 2) {
					   System.out.print("\nINVALID INPUT!");
				   }
				   
				}while(yesNo != 1 && yesNo != 2);
				
				break;
			case 3:
				System.out.println("\nYour Order: " + c3);
				
				products.add(c3);
				
				System.out.println("\nHow many will you order? ");
				orderQty = scan.nextInt();
								
				quantity.add(orderQty);
				
				System.out.println("\nYou ordered " + orderQty + " " + c3.productID);
				totalPrice += c3.price * orderQty;
				
				do {
				   System.out.println("\nWould you like some Add Ons? 1 - YES | 2 - NO ");
				   yesNo = scan.nextInt();
				   
				  if(yesNo == 1) {
				   do{
				      System.out.println("\nWhat Add Ons would you like? 1 - R1 | 2 - R2");
				      addOns = scan.nextInt();
				      
				      if(addOns == 1) {
				    	  System.out.println("\nYour Add Ons: " + r1);
				    	  productAddOns.add(r1);
				      }
				      else if(addOns == 2) {
				    	  System.out.println("\nYour Add Ons: " + r2);
				    	  productAddOns.add(r2);
				      }
				      
				      if(addOns == 1 || addOns == 2) {
				    	  System.out.println("\nHow many Add Ons would you like? ");
				    	  addOnsQty = scan.nextInt();
				    	  
				    	  quantityAddOns.add(addOnsQty);
				    	  
				    	  if(addOns == 1) {
				    	     System.out.print("\nYou added " + addOnsQty + " " + r1.productID + " Add Ons");
				    	     totalPrice += r1.price * addOnsQty;
				    	  }
				    	  else if(addOns == 2) {
					         System.out.print("\nYou added " + addOnsQty + " " + r2.productID + " Add Ons");
					         totalPrice += r2.price * addOnsQty;
					      }
				      }
				      
				      if(addOns != 1 && addOns != 2) {
						   System.out.print("\nINVALID INPUT!");
					   }
				      
				   }while(addOns != 1 && addOns != 2);
				  }
				   if(yesNo != 1 && yesNo != 2) {
					   System.out.print("\nINVALID INPUT!");
				   }
				   
				}while(yesNo != 1 && yesNo != 2);
				
				break;
				
			default:
				System.out.println("\nINVALID OPTION!");
		  }		  
		  
		  do {
		    System.out.println("\n\nWould you like to order again? 1 - YES | 2 - NO");
		    toOrderAgain = scan.nextInt();
		    if(toOrderAgain != 1 && toOrderAgain != 2) {
		    	System.out.println("\nINVALID INPUT");
		    }
		    
		  }while(toOrderAgain != 1 && toOrderAgain != 2);
		  
		}while(toOrderAgain == 1);
				
		System.out.println("\nYour Orders:");
		
		int i = 0;
		for(Product product: products) {
			System.out.println(product + " | Quantity: " + quantity.get(i));
			i++;
		}

		System.out.println("\nYour Add Ons:");
		
		int j = 0;
		for(Product productAddOn: productAddOns) {
			System.out.println(productAddOn + " | Quantity: " + quantityAddOns.get(j));
			j++;
		}
		
		DecimalFormat formatter = new DecimalFormat("#.##");
		System.out.println("\nTotal Price: Php " + totalPrice);
		double dollars = totalPrice/56.85;
		System.out.println("\nTotal Price in Dollars: $" + formatter.format(dollars));
	} 
}

class Product {
	String productID;
	double price, totalPrice = 0;
	int qty;
	
	Product(String productID, double price) {
		this.productID = productID;
		this.price = price;
	}
	
	Product(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		return productID + " - Php " + price;
	}
}
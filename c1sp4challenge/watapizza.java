import java.util.Scanner;
class watapizza {
	public static void main(String[] input){
		int srno;
		int n;
		String name;
		String Email;
		long phoneNo;
		String address;
		
		int noofpizza;
		float pizzaprice=12.99f;
		char pizzasize;
		int noofgarlicbread;
		float garlicbreadprice=5.99f;
		int noofbeverage;
		float beverageprice=1.99f;
		float pizzabill=0;
		float garlicbill=0;
		float beveragebill=0;
		float totalamount;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		name = sc.next();
		System.out.println("enter Email");
		Email = sc.next();
		System.out.println("enter phone number");
		phoneNo = sc.nextLong();
		System.out.println("enter address");
		address = sc.next();
		
		System.out.println("-------------------------------");
		System.out.println("sr No        item name");
		System.out.println("-------------------------------");
		System.out.println("1   pizza");
		System.out.println("2   Garlic Bread ");
		System.out.println("3    Beverage");
		
		do{
		System.out.println("enter 1 for pizza ,2 for garlicbread, 3 for beverage");
		srno = sc.nextInt();
		switch(srno){
			case 1: 
			System.out.println("enter no.of pizza you want to order");
			noofpizza=sc.nextInt();
			 pizzabill=(pizzaprice*noofpizza);
			System.out.println("tour total pizza bill : "+pizzabill);
			break;
			case 2: 
			System.out.println("enter no.of Garlic Bread you want to order");
			noofgarlicbread=sc.nextInt();
			 garlicbill=(garlicbreadprice*noofgarlicbread);
			System.out.println("tour total Garlic Bread bill : "+garlicbill);
			break;
			case 3: 
			System.out.println("enter no.of Beverages you want to order");
			noofbeverage=sc.nextInt();
			 beveragebill=(beverageprice*noofbeverage);
			System.out.println("tour total Beverage bill : "+beveragebill);
			break;
			default: System.out.println("wrong choose enter");
			
		}
		  totalamount = (pizzabill+garlicbill+beveragebill);
		  System.out.println("Do you want to place another item in order enter 1 to continueor 0 to exit");
		     n = sc.nextInt();
		} while(n==1);
		System.out.println("total anount : $" +totalamount);
		if(totalamount>50){
			double discount=(totalamount*0.1);
			double discountedamount=(totalamount-discount);
			System.out.println("the total discounted bill amount: $"+discountedamount);
		}
		else{
			
			System.out.println("No discount provided since bill is lessthan $50" );

		}
	}
}
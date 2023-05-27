import java.util.Scanner;
class watapizza {
	public static void main(String[] input){
		int srno;
		String name;
		String Email;
		long phoneNo;
		String address;
		String discount;
		int noofpizza;
		float pizzaprice=12.99f;
		char pizzasize;
		int noofgarlicbread;
		float garlicbreadprice=5.99f;
		int noofbeverage;
		float beverageprice=1.99f;
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
		System.out.println("enter item sr.No");
		srno = sc.nextInt();
		switch(srno){
			case 1: 
			System.out.println("enter no.of pizza you want to order");
			noofpizza=sc.nextInt();
			float pizzabill=(pizzaprice*noofpizza);
			System.out.println("tour total pizza bill : "+pizzabill);
			break;
			case 2: 
			System.out.println("enter no.of Garlic Bread you want to order");
			noofgarlicbread=sc.nextInt();
			float garlicbill=(garlicbreadprice*noofgarlicbread);
			System.out.println("tour total Garlic Bread bill : "+garlicbill);
			break;
			case 3: 
			System.out.println("enter no.of Beverages you want to order");
			noofbeverage=sc.nextInt();
			float beveragebill=(beverageprice*noofbeverage);
			System.out.println("tour total Beverage bill : "+beveragebill);
			break;
			default: System.out.println("wrong choose enter");
        
	    }
	}
}
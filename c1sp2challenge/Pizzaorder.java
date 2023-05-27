class Pizzaorder {
	public static void main(String[] args) {
		String customerName = "Gary";
		String customerEmail = "gary@gmail.com";
		long phoneNo = 412312345l;
		String address = "20,Marble Drive, Eville";
		String discount = "10%";
		int noofpizzasordered = 5;
		float pizzaprice = 12.5f;
		char pizzasize = 'M';
		int noofgarlicbreadsordered = 3;
		float garlicbreadprice = 5.99f;
		int noofbeveragesordered = 3;
		float beverageprice = 1.99f;
		float totalpizzaprice = noofpizzasordered*pizzaprice;
		float totalgarlicbreadprice = noofgarlicbreadsordered*garlicbreadprice;
		float totalbeverageprice = noofbeveragesordered*beverageprice;
		float totalbill = totalpizzaprice+totalgarlicbreadprice+totalbeverageprice;
		boolean isgreater = totalbill>100;
		float discountgot = (totalbill*10)/100;
		float amountpaid = totalbill-discountgot;
		System.out.println("---------------------------------------------------------");
		System.out.println("		CUSTOMER DETAILS				");
		System.out.println("---------------------------------------------------------");
		System.out.println("customer name is "+customerName);
		System.out.println("customer Email is "+customerEmail);
		System.out.println("customer phone number is "+phoneNo);
		System.out.println("customer address is "+address);
		System.out.println("---------------------------------------------------------");
		System.out.println("          ORDER SUMMERY                    ");
		System.out.println("---------------------------------------------------------");
		System.out.println("sr no.   item name       item Quality     $price/unit     $totalprice");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("1        Pizza             "+noofpizzasordered+"                  "+pizzaprice+"             "+totalpizzaprice);
		System.out.println("2        Garlic Bread      "+noofgarlicbreadsordered+"                  "+garlicbreadprice+"             "+totalgarlicbreadprice);
		System.out.println("3        Beverages        "+noofbeveragesordered+"                  "+beverageprice+"            "+totalbeverageprice);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Total bill amount : $"+totalbill);
		System.out.println("Disscount offered : "+discount);
		System.out.println("Amount to be paid: $"+amountpaid);

    }
}
import java.util.*;
class pizzaorder {
	public static void main(String[] args)
	{
		pizzaorder obj = new pizzaorder();
        Scanner sc = new Scanner(System.in);
		System.out.println("enter customer Name");
			String name=sc.next();
			System.out.println("enter customer Email");
			String Email=sc.next();
			System.out.println("enter customer Phone No");
			long phoneNo=sc.nextLong();
			System.out.println("enter customer address");
			String address=sc.next();
			
			int n;
			int noofpizza=0;
			int noofgarlicbread=0;
			int noofbeverages=0;
			float totalpizzaprice=0;
			float totalgralicbreadprice=0;
			float totalbeverageprice=0;
			float totalbillamount=0;
			
			do
			{
				obj.dispalyMenu();
		     System.out.println("enter 1 for pizza ,2 for garlicbread, 3 for beverage");
		      int srno = sc.nextInt();
		      switch(srno)
			  {
			case 1: 
			System.out.println("enter 1 for regular,2 for medium, 3 for large");
			 int  size=sc.nextInt();
			 float priceofpizza=obj.getpriceofpizzabasedonsize(size);
			 if(priceofpizza==0)
			 {
				 size=sc.nextInt();
				 priceofpizza=obj.getpriceofpizzabasedonsize(size);
			 }

			System.out.println("enter no.of pizza you want to order");
			 noofpizza=sc.nextInt();
			  
			  totalpizzaprice = totalpizzaprice+obj.calculatepriceofpizza(noofpizza,priceofpizza);
               
			break;
			case 2: 
			System.out.println("enter no.of Garlic Bread you want to order");
			 noofgarlicbread=sc.nextInt();
			float priceofgralicbread=obj.getpriceofgralicbread();
			totalgralicbreadprice=totalgralicbreadprice+obj.calculatepriceofgarlicbread(noofgarlicbread,priceofgralicbread);
			 
			break;
			case 3: 
			System.out.println("enter no.of Beverages you want to order");
			 noofbeverages=sc.nextInt();
			float priceofbeverage=obj.getpriceofbeverage();
			totalbeverageprice =totalbeverageprice+obj.calculatepriceofbeverages(noofbeverages,priceofbeverage);
			break;
			default: System.out.println("wrong choose enter");
			
		  }
		  
		  System.out.println("Do you want to place another item in order enter 1 to continueor 0 to exit");
		     n = sc.nextInt();
		} while(n==1);
		//System.out.println("enter no.of pizza you want to order"+noofpizza);
		totalbillamount = obj.calculatetotalbill(totalpizzaprice,totalgralicbreadprice,totalbeverageprice);
		float totalbillafterdiscount=0;
			 totalbillafterdiscount=obj.calculateDiscountAndReturnBillamount(totalbillamount);
			 
			 obj.displaycustomerdetails(name,Email,phoneNo,address);
			 obj.displayorderdetails(noofpizza,noofgarlicbread,noofbeverages,totalbillamount,totalbillafterdiscount);
			


	}
		
		void displaycustomerdetails(String name, String Email,long phoneNo,String address)
		{
			System.out.println("customer details");
			System.out.println("---------------------");
			System.out.println("Name of customer is  :"+name);
			System.out.println("Email of customer is  :"+Email);
			System.out.println("Contact No of customer is :"+phoneNo);
			System.out.println("Address of customer is  :"+address);
			System.out.println("---------------------");
			
        }
		void  dispalyMenu()
		{
			System.out.println("Slect the items to order");
			System.out.println("sl.No      item category");
			System.out.println("-----------------------------");
			System.out.println("1)  Pizza");
			System.out.println("    Price of one Regular Pizza : $9.99");
			System.out.println("    Price of one Medium Pizza  : $11.99");
			System.out.println("    Price of one Large Pizza   : $13.99");
			System.out.println("2)  Garlic Bread");
			System.out.println("    Price of one Garlic Bread : $5.99");
			System.out.println("3)  Beverages");
			System.out.println("    Price of one Beverage : $1.99");
			

            
		}
		public float getpriceofpizzabasedonsize(int size)
		{
			float priceofpizza;
			if(size==1){
				priceofpizza=9.99f;
			}
			else if(size==2){
				priceofpizza=11.99f;
			}
			else if(size==3){
				priceofpizza=13.99f;
			}
			else{
				System.out.println("Invalid size, enter 1,2,or3");
				  priceofpizza=0;
			}
			return priceofpizza;
		}
		public float getpriceofgralicbread()
		{
			return 5.99f;
		}
		public float getpriceofbeverage()
		{
			return 1.99f;
		}
		public float calculatepriceofpizza(int noofpizza, float priceofpizza)
		{
			
			 float pizzabill=(priceofpizza*noofpizza);
			 return pizzabill;
			 
		}
		public float calculatepriceofgarlicbread(int noofgarlicbread, float priceofgrallicbread)
		{
			
			 float garlicbill=(priceofgrallicbread*noofgarlicbread);
			 return garlicbill;
			
		}
		public float calculatepriceofbeverages(int noofbeverages, float priceofbegerage)
		{
			
			 float beveragebill=(priceofbegerage*noofbeverages);
			 return beveragebill;
			
		}
		public float calculatetotalbill(float totalpizzaprice, float totalgralicbreadprice, float totalbeverageprice)
        { 
          float totalamount = (totalpizzaprice+totalgralicbreadprice+totalbeverageprice);
		  return totalamount;
		}
		public float calculateDiscountAndReturnBillamount(float totalbillamount)
		{
			if(totalbillamount>50)
			{
				float discount=(totalbillamount*10)/100;
			   float discountedamount=(totalbillamount-discount);
			   return discountedamount;
			}
			else
			{
				return  totalbillamount;
			}
		}
		void displayorderdetails(int noofpizza,int noofgarlicbread,int noofbeverages,float totalbillamount, float totalbillafterdiscount)
		{
			System.out.println("Order Details");
			System.out.println("--------------------");
			
			System.out.println("The number of pizza ordered  : "+noofpizza);
			System.out.println("The number of Garlic Bread ordered  : "+noofgarlicbread);
			System.out.println("The number of Beverage ordered  : "+noofbeverages);
			System.out.println("------------------------------------------------------------");
			System.out.println("The total bill amount is : "+totalbillamount);
			System.out.println("The discounted amount is  : "+totalbillafterdiscount);
        }
}
		
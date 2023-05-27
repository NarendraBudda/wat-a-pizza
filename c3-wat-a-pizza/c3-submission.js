//Declaring variables 
let customerName = "Gary";
let customerEmail = "gary@gmail.com";
let phoneNo = 412312345;
let address = "20,Marble Drive, Eville";
let noOfPizza = 5;
let pizzaPrice;
let pizzaSize=2;
let noOfGarlicBread = 3;
let garlicBreadPrice;
let noOfBeverages=5;
let beveragePrice;
let totalPizzaPrice=0;
let totalGarlicBreadPrice=0;
let totalBeveragePrice=0;
let choice=2;

// define function displayCustomerDetails() to display the details of customer passed as parameters.
 function displayCustomerDetails(customerName, customerEmail, phoneNo, address){
    console.log(`---------------------------------------------------------`);
    console.log(`		CUSTOMER DETAILS				`);
    console.log(`---------------------------------------------------------`);
    console.log(`customer name is ${customerName}`);
    console.log(`customer Email is ${customerEmail}`);
    console.log(`customer phone number is ${phoneNo}`);
    console.log(`customer address is ${address}`);

 }

// define funciton displayMenu() to raise an alert that displays the menu with 
// category, item names and price
function dispalyMenu()
{
    console.log(`Slect the items to order`);
    console.log(`sl.No      item category`);
    console.log(`-----------------------------`);
    console.log(`1)  Pizza`);
    console.log(`    Price of one Medium Pizza  : $11.99`);
    console.log(`    Price of one Large Pizza   : $13.99`);
    console.log("2)  Garlic Bread");
    console.log(`    Price of one Garlic Bread : $5.99`);
    console.log(`3)  Beverages`);
    console.log(`    Price of one Beverage : $1.99`);
    console.log(`enter 1 for pizza, 2 for gralic bread, 3 for beverages`);
}

 

// define function getPriceOfPizzaBasedOnSize() to return price of pizza for the 
// size passed as parameter.
function getPriceOfPizzaBasedOnSize(pizzaSize)
{
    
    pizzaPrice=0;
switch(pizzaSize){
    case 1:
        pizzaPrice = 9.99
        break;
    case 2:
        pizzaPrice = 11.99;
        break;
    case 3:
        pizzaPrice = 13.99;
        break;
    default:    
        console.log(`Invalid size, Enter 1,2 or 3`);
        pizzaPrice = 0;
        break;
   }
   return pizzaPrice;
}


// define function getPriceOfGarlicBread() to return price of garlic bread as 5.99.
function getPriceOfGarlicBread(){
    return 5.99;
}

// define function getPriceOfBeverage() to return price of beverage as 1.99.
 function getPriceOfBeverage(){
    return 1.99;
 }

// define function calculatePrice() to return cost of items ordered for the 
// no of items and price passed as parameters.
function calculatePriceOfPizza(noOfPizza,pizzaPrice){
   
    return   pizzaPrice*noOfPizza;

} 
function calculatePriceOfGarlicBread(noOfGarlicBread,garlicBreadPrice)
{
    
    return garlicBreadPrice*noOfGarlicBread;
     
    
}
function calculatePriceOfBeverages(noOfBeverages,beveragePrice)
{
    
    return  beveragePrice*noOfBeverages;
    
    
}


// define function calculateTotalBill() to return total bill amount from the 
// total price of pizza, garlic bread and beverages ordered 
function calculateTotalBill(totalPizzaPrice, totalGarlicBreadPrice, totalBeveragePrice){
    return totalPizzaPrice+totalGarlicBreadPrice+totalBeveragePrice;
}


// define function calculateDiscountAndReturnBillAmount() to return discounted amount 
// which will be calculated only if total bill is more than 50  
function calculateDiscountAndReturnBillAmount(totalBillAmount){
    if(totalBillAmount>50)
	{
	  return (totalBillAmount-(totalBillAmount*10)/100);
	}
	else
	{
	  return  totalBillAmount;
	}

} 


// define function displayOrderDetails() to print the order details
function displayOrderDetails(noOfPizza,noOfGarlicBread, noOfBeverages,totalBillAmount,totalBillAmountAfterDiscount)
{
    console.log(`Order Details`);
    console.log(`--------------------`);
    
    console.log(`The number of pizza ordered  : ${noOfPizza}`);
    console.log(`The number of Garlic Bread ordered  : ${noOfGarlicBread}`);
    console.log(`The number of Beverage ordered  : ${noOfBeverages}`);
    console.log(`------------------------------------------------------------`);
    console.log(`The total bill amount is : ${totalBillAmount}`);
    console.log(`The discounted amount is  : ${totalBillAmountAfterDiscount}`);
}




//Main Program
dispalyMenu();
do{
    
    switch(choice){
        case 1:{
            pizzaPrice=getPriceOfPizzaBasedOnSize(pizzaSize);
            totalPizzaPrice=calculatePriceOfPizza(noOfPizza,pizzaPrice);
            break;
        }
        case 2:{
            garlicBreadPrice=getPriceOfGarlicBread();
            totalGarlicBreadPrice=calculatePriceOfGarlicBread(noOfGarlicBread,garlicBreadPrice);
            break;
        }
        case 3:{
            beveragePrice=getPriceOfBeverage();
            totalBeveragePrice=calculatePriceOfBeverages(noOfBeverages,beveragePrice);
            break;
        }
        default: console.log(`wrong choice`);
        break;
    }
choice--;
}while(choice>0)




 


let totalBillAmount=calculateTotalBill(totalPizzaPrice,totalGarlicBreadPrice,totalBeveragePrice);

let totalBillAmountAfterDiscount=calculateDiscountAndReturnBillAmount(totalBillAmount);
displayCustomerDetails(customerName, customerEmail, phoneNo, address);
displayOrderDetails(noOfPizza,noOfGarlicBread, noOfBeverages,totalBillAmount,totalBillAmountAfterDiscount);

// call the functions to compute order amount and display order details


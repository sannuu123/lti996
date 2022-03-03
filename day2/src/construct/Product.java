package construct;

public class Product 
{
	int price,qty,total;
	Product()
	{
		price=100;
		qty=3;
	}
	void findTotal()
	{
		total=price*qty;
	}
	void displayBill()
	{
		System.out.println("bill amount is :"+ total);
	}

	public static void main(String[] args) 
	{
		Product soap=new Product();
		soap.findTotal();
		soap.displayBill();
		}

}

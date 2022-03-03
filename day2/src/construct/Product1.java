package construct;

public class Product1 {

	int price,qty,total;
	Product1()
	{
		price=100;
		qty=3;
	}
	Product1(int price,int qty)
	{
		this.price=price;
		this.qty=qty;
	}
	void findBill()
	{
		total=price*qty;
		System.out.println("bill amount is "+total);
	}
	public static void main(String[] args) 
	{
		Product1 soap=new Product1();
		soap.findBill();
		Product1 pen=new Product1(20,5);
		pen.findBill();
		}

}

		

	

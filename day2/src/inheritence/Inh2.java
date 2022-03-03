package inheritence;
class customer
{
	String name;
    String email;
void getCustomerData()
{
	name="hari";email="hari@hooha.com";
	System.out.println(name+" :"+email);
}
}
class CreditCustomer extends customer
{
	String cardName;
	void getCustomerData() //overriding
	{
		super.getCustomerData(); //calling base class method
		cardName="AMEX Platinum";
		System.out.println("card :"+cardName);
	}
}
public class Inh2 {

	public static void main(String[] args) {
		CreditCustomer cs=new CreditCustomer();
		cs.getCustomerData();

	}

}

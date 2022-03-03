package inheritence;
class Bank
{
	void deposite()
	{
		System.out.println("deposite");
	}
	void Withdraw()
	{
		System.out.println("Withdraw Money");
	}
}
	class ICICI extends Bank
{
	void setInterest()
	{
		System.out.println("Interest rate is 9.87");
	}
}

public class InhDemo 
{

	public static void main(String[] args) 
	{
		ICICI chn1=new ICICI();
		chn1.deposite();
		chn1.Withdraw();
		chn1.setInterest();
	}

}

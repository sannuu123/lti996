package array;
import java.util.Scanner;
public class arrysd {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String []fruits=new String[5];
		
		System.out.println("enter fruits");
		for(int i=0;i<fruits.length;i++)
		{
			fruits[i]=sc.next();
		}
		System.out.println("fruits are:");
		for(String f: fruits)
			System.out.println(f);
			}
	}

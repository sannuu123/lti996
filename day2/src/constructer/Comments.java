package constructer;

public class Comments {
	Comments()
	{
		this("java");
		System.out.println("no comments");
	}
	Comments(String message)
	{
		this("c#","MS");
		System.out.println("comment :"+ message);
	}
	Comments(String message,String author)
	{
		System.out.println("comment from "+author+" : "+message);
	}

	public static void main(String[] args) {
		Comments c1= new Comments();
		}
}
// this is in revers way // 
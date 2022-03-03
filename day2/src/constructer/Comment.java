package constructer;

public class Comment 
{
	Comment()
	{
		System.out.println("no comments");
	}
	Comment(String message)
	{
		System.out.println("comment :"+ message);
	}
	Comment(String message,String author)
	{
		System.out.println("comment from "+author+" : "+message);
	}

	public static void main(String[] args) {
		Comment c1= new Comment();
		Comment c2= new Comment("java is good");
		Comment c3= new Comment("says so","ram");

	}

}

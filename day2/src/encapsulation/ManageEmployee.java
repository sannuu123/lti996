package encapsulation;

public class ManageEmployee {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setPsNo("PS001");
		e.setFirstName("rajiv");
		e.setJobTitle("PAT");
		
		System.out.println(e.getPsNo());
		System.out.println(e.getFirstName());
		System.out.println(e.getJobTitle());

	}

}

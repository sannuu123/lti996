package encapsulation;

public class Employee //VO(Value obj)  , TO(Transfer obj)  , Bean , POJA(Plain old java obj) , Entity
{
	private String psNo;
	private String firstName;
	private String jobTitle;
	
    public String getPsNo() {
		return psNo;
	}


	public void setPsNo(String psNo) {
		this.psNo = psNo;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public static void main(String[] args) {
		

	}

}

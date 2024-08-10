package Hospital.model;

public class ReceptionistModel {

	
	private String  RecptName;
	private String Recptpassword;
	
	public ReceptionistModel() {
	
	}

	public ReceptionistModel(String recptName, String recptpassword) {
		super();
		RecptName = recptName;
		Recptpassword = recptpassword;
	}

	public String getRecptName() {
		return RecptName;
	}

	public void setRecptName(String recptName) {
		RecptName = recptName;
	}

	public String getRecptpassword() {
		return Recptpassword;
	}

	public void setRecptpassword(String recptpassword) {
		Recptpassword = recptpassword;
	}
	
	

	
	
	
	
	
	
	
}

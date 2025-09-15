package hasA;

public class PersonalDetails {
	
	private String fatherName;
	
	private String motherName;

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	@Override
	public String toString() {
		return "PersonalDetails [fatherName=" + fatherName + ", motherName=" + motherName + "]";
	}
	
	

}

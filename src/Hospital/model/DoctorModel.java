package Hospital.model;

public class DoctorModel {
   private int did;
   private String dname;
   private String contact;
   private int fees;
   private String specialization;
   public DoctorModel()
   {
	   
   }
public DoctorModel(String dname, String specialization,String contact,int fees) {
	
	this.dname = dname;
	this.contact = contact;
	this.fees = fees;
	this.specialization = specialization;
}

public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
}

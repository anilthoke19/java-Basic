package Hospital.service;

import java.util.List;
import java.util.Scanner;

import Hospital.model.DoctorModel;
import Hospital.model.PatientModel;
import Hospital.repository.DoctorRepository;
import Hospital.repository.PatientRepository;

public class PatientService {

	PatientRepository pr=new PatientRepository();
	DoctorRepository dr=new DoctorRepository();
	Scanner sc=new Scanner(System.in);
	public int addPatient(PatientModel p)
	{
		
		return pr.isAddPatient(p)?1:-1;
		
		
	}
	
	

	public List<PatientModel> viewAllPatient()
	{
		List<PatientModel> list=pr.viewAllPatient();
	    return list!=null?list:null;
	}
	

	
	
	// -----------Give presciption 
	
	public int givePresciption(int pid )

	{
		
		pr.isGivePresciption( pid );
		
		return 1;
		
		
	}
	

}

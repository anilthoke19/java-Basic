package Hospital.service;
import java.util.*;
import Hospital.model.DoctorModel;
import Hospital.repository.DoctorRepository;

public class DoctorServices {
	
	DoctorRepository dr=new DoctorRepository();
	public int addDoctor(DoctorModel d)
	{
			
	return dr.isAddDoctor(d)?1:-1;
	
	
		
		
	}
	
	public List<DoctorModel> viewAllDoctor()
	{
		List<DoctorModel> list=dr.viewAllDoctor();
	    return list!=null?list:null;
	}
	
	
	// add patient categiry and allocate room to patient
	public int  AddPatientCategory (int Pid)
	{
	Scanner sc=new Scanner(System.in);
		//get doctor id by patient id 
		
		int did=dr.getDoctorIdByPid(Pid);
		System.out.println("doctor id is "+did);
		
		System.out.println("Patient is serious ?");
		String msg=sc.nextLine();
		if(msg.equalsIgnoreCase("yes"))
		{
		System.out.println("Patient added in IPD");	
		System.out.println("Please Enter room id for Patient");
		int RoomNo=sc.nextInt();
		
			
			return dr.isAddPatientCategory(Pid,"IPD",RoomNo)?1:-1;
		}
		else
			return 0;
			
		
	}
	
	
	
	
	

}

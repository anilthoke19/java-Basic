package Hospital.client;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.exceptions.RSAException;

import Hospital.model.AdminLogin;
import Hospital.model.DoctorModel;
import Hospital.model.MedicineModel;
import Hospital.model.PatientModel;
import Hospital.model.RoomModel;
import Hospital.service.AdminService;
import Hospital.service.BillService;
import Hospital.service.DoctorServices;
import Hospital.service.PatientService;
import Hospital.service.RoomService;

public class HospitalManagement {

	public static void main(String[] args) {
		String name,pass,dieases,contact,speciality;
		int fees;
		Date d;
		
		AdminService as=new AdminService();
		PatientModel ps=new PatientModel();
		PatientService pr=new PatientService();
		DoctorServices ds=new DoctorServices();
		RoomService rs=new RoomService();
		BillService bs=new BillService(); 
	
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Register admin username login and password ");
//
		name=sc.nextLine();
		pass=sc.nextLine();
//		AdminLogin al=new AdminLogin();
//		al.setAdminName(name);
//		al.setPassword(pass);
	int value;	
//	int value=as.AddAdmin(name, pass);
//	if(value==1)
//	{
//		System.out.println("Admin data stored");
//	}else
//	{
//		System.out.println("Some problem is here");
//	}
		
		int choice;
		
		
		value=as.Adminverified(name, pass);
			
		if(value==1){
			
	do
	{
		
		System.out.println("1: Add doctor");
		System.out.println("2:Delete doctoe");
		System.out.println("3: view doctor");
		System.out.println("4:Update  doctor");
		System.out.println("5: Receptionist login");
		System.out.println("6:Enter Medicine details ");
		System.out.println("7:Enter patient catogery ");
		System.out.println("8:Add room in hospital");
		System.out.println("9: Preciption by doctor ad allocate room to pateint ");// here room allocate to patient
        System.out.println("10: Generate bill ");
		
         System.out.println("Enter your choice");
		
		 choice=sc.nextInt();
		 
		 
		 switch(choice)
		 {
		 case 1:
			 sc.nextLine();
			 System.out.println("Enter  doctort name ,specility contact  and fees ");
			 name=sc.nextLine();
			 speciality=sc.nextLine();
			 contact=sc.nextLine();
			 fees=sc.nextInt();
			 
			 DoctorModel d3=new DoctorModel(name,speciality,contact,fees);
			 
			value=ds.addDoctor(d3);
			 
			 
			 
			 
			 
			 
			 break;
		 case 2:
			 break;
		 case 3:
			 List<DoctorModel> dList=new ArrayList<DoctorModel>();
			 dList=ds.viewAllDoctor();
			 
			 if(dList!=null)
			 {
				 for(DoctorModel dd:dList)
				 {
					 System.out.println(dd.getDid()+" "+dd.getDname()+" "+dd.getSpecialization()+" "+dd.getFees()+" "+dd.getContact());
				 }
				 
			 }else
			 {
				 System.out.println("Doctor not found");
			 }
			 
			 
			 break;
		 case 4:
			 break;
		 case 5:
			 do {
				 System.out.println("1:Add petient");
				 System.out.println("2:delete petiont record");
				 System.out.println("3: view all pationts list");
				 System.out.println("4: Update specific petiont data");
				 System.out.println("Ente your choice ");
				 choice=sc.nextInt();
				 
				 switch(choice) {
			
				 case 1:
						Scanner sc2=new Scanner(System.in);

					sc2.nextLine();	 
						 System.out.println("Enter patient name ,dieases,contact,registration date  ");
						
						 
						 name=sc2.nextLine();
						 dieases=sc2.nextLine();
						 contact=sc2.nextLine();
						 System.out.println("Enter year ,month and day");
						 int year=sc2.nextInt();
						 int month=sc2.nextInt();
						 int day=sc2.nextInt();
						 Date d2=new Date(year,month,day);
						 
							PatientModel ps2=new PatientModel(name,contact,dieases,d2);
							value=pr.addPatient(ps2);
							if(value==1)
							{
								System.out.println("Patient added");
							}else
								System.out.println("Patient not added");
							
						 
						 
						 break;
				 case 2: 
					 
					 
					 
		
					 break; 
				 case 3:
					 
					 List<PatientModel> d2List=new ArrayList<PatientModel>();
					 d2List=pr.viewAllPatient();
					 
					 if(d2List!=null)
					 {
						 for(PatientModel dd:d2List)
						 {
							 System.out.println(dd.getPid()+" "+dd.getPname()+" "+dd.getDiesease()+" "+dd.getContact());
						 }
						 
					 }else
					 {
						 System.out.println("Patient not found");
					 }
					 
					 
					 break;
				 case 4:
					 break;	 
				 } 
			 }while(choice<=4);
			 break;
			 
			 
			 //------- Medicine add under admin
			 
		 case 6:
			 MedicineModel mm=new MedicineModel();
			 
			 System.out.println("Enter midicine name  ");
			 System.out.println("Enter midicine Id   ");
			 System.out.println("Enter midicine price  ");
  
			 break;
			 
			 // add catogery and patient id by doctor
		 case 7:
			 System.out.println("Enter patient id ");
			 int id=sc.nextInt();
			 value=ds.AddPatientCategory(id);
			 if(value==1)
			 {
				 System.out.println("Patient catogery added in IPD");
				
			 }else
			 {
				 System.out.println("Patient added in OPD");
			 }
			 
			 
			 
			 break;
			
			 
			 
		 case 8:
			 System.out.println("Add room id ,Roomtype,cost ,bedno");
			 id=sc.nextInt();
			 sc.nextLine();
			 String roomType=sc.nextLine();
			 int cost=sc.nextInt();
			 int bedNO=sc.nextInt();
			 RoomModel m=new RoomModel(id,roomType,cost,bedNO);
			 value=rs.addRoom(m);
			 if(value==1)
			 {
				 System.out.println("Room added");
			 }else
			 {
				 System.out.println("Room not added");
			 }
			 
			
			 break;
	 
		 case 9:
		System.out.println("Give presciption for patient ");
		System.out.println("Enter patient Id");
		int pid=sc.nextInt();
		pr. givePresciption(pid);
		
		 break;
		
		 case 10:
			 System.out.println("Enter Patient id for Bill ");
			 id=sc.nextInt();
			 
			 bs.getBill(id);
			 
			 
			 break;
			 
		 
		 
		 
		 
		 
		default:
			System.out.println("wrong choice");
		 }
		 
		
	}while(true);
	
	
		
		}else
		{
			System.out.println("Admin not found");
		}
		
		
	}

}

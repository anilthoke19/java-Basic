package Hospital.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Hospital.model.DoctorModel;
import Hospital.model.PatientModel;

public class PatientRepository extends DBConfig
{
	DoctorRepository dr=new DoctorRepository();
	public int getPatientid(String name)
	{
		int value=0;
		try
		{
			ps=c.prepareStatement("select pid from patient where pname=?");
			ps.setString(1, name);
			rs=ps.executeQuery();
			if(rs.next())
			{
				value=rs.getInt(1);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return value++;
	}
	public boolean isAddPatient(PatientModel p)
	{
		
		try {
			ps=c.prepareStatement("insert into patient values('0',?,?,?,?,'OPD')");
			ps.setString(1, p.getPname());
			ps.setString(2, p.getContact());
			ps.setString(3, p.getDiesease());
			ps.setDate(4, p.getRegistrationDate());
			
			int value=ps.executeUpdate();
			
		   if(value!=-1)
		   {
			   int pid=this.getPatientid(p.getPname());
			   System.out.println(p.getDiesease()+"desiese ");
			   int did=dr.getDidbyDiesese(p.getDiesease());
			   System.out.println("pid id "+pid+"did is "+did);
			  ps=c.prepareStatement("insert into  doctorpatientjoin values(?,?)");
			  ps.setInt(1, did);
			  ps.setInt(2, pid);
			  int r=ps.executeUpdate();
			 
			  return true;
		   }
			
			
		} catch (SQLException e) {
			
			System.out.println(e);
			return false;
		}
		return false;
		
	}
	
	
	// view patient list
	public List<PatientModel> viewAllPatient() 
	  {
		 
		List <PatientModel> list=new ArrayList<PatientModel>();
	  try {
		ps=c.prepareStatement("select *from patient"); 
	  rs=ps.executeQuery();
	  while(rs.next())
	  {
		 PatientModel d=new PatientModel();

		  d.setPid(rs.getInt(1));
		  d.setPname(rs.getString(2));
		  d.setDiesease(rs.getString(3));
		  d.setContact(rs.getString(4));
		  list.add(d);
	  }
	  return list.size()>0?list:null;
	  }
	  catch (Exception e) {
			System.out.println("Error is "+e);
			return null;
		}
		  
		  
		  
	  }
	  
	
	
	
	

	
	
	public boolean isGivePresciption(int pid )
	{
		// data add into presciption table on given patient id 
		
		return true;
	}
	
	
	
	
	
}

package Hospital.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Hospital.model.DoctorModel;

public class DoctorRepository extends DBConfig{
	List<DoctorModel> list=new ArrayList<DoctorModel>();
	
	
	public int getDoctorIdByPid(int pid)
	{
		int did=0;
		try {
			ps=c.prepareStatement("select did from doctorpatientjoin where pid=?");
			ps.setInt(1, pid);
			rs=ps.executeQuery();
			if(rs.next())
			{
			   did=rs.getInt("did");
			}
			return did;
			
		} catch (Exception e) {
			System.out.println("Error is "+e);
			return 0;
		}
		
		
		
		
	}
	
	
	
	
	
   public int getDidbyDiesese(String diesease)
   {
	   System.out.println(diesease);
	   int did=0;
	   try
	   {
		  ps=c.prepareStatement("select *from doctor");
		  rs=ps.executeQuery();
		  while(rs.next())
		  {
			  String specialist=rs.getString("specialization");
			  System.out.println(specialist+"doctorr");
			  int index=specialist.indexOf(diesease);
			  System.out.println(index+"index is ");
			  if(index!=-1)
			  {
				  did=rs.getInt("did");
				  System.out.println("doctor id is doctor repository "+did);
				  break;
			  }		  
		  }
		  
	   }
	   catch(Exception ex)
	   {
		   System.out.println("Error is "+ex);
	   }
	   return did;
   }
   
  public boolean isAddDoctor(DoctorModel d)
  {
	  
	  try {
		ps=c.prepareStatement("insert into doctor values('0',?,?,?,?)");
		ps.setString(1, d.getDname());
		ps.setString(2,d.getSpecialization());
		ps.setInt(3,d.getFees());
		ps.setString(4, d.getContact());
		
		int value=ps.executeUpdate();
		return value>0?true:false;
		
		
	} catch (SQLException e) {
		System.out.println(e);
		return false;
		
	}
	  
	  
  }	  
	  public List<DoctorModel> viewAllDoctor() 
	  {
		  
	  try {
		ps=c.prepareStatement("select *from doctor"); 
	  rs=ps.executeQuery();
	  while(rs.next())
	  {
		  DoctorModel d=new DoctorModel();

		  d.setDid(rs.getInt(1));
		  d.setDname(rs.getString(2));
		  d.setSpecialization(rs.getString(3));
		  d.setFees(rs.getInt(4));
		  d.setContact(rs.getString(5));
		  list.add(d);
	  }
	  return list.size()>0?list:null;
	  }
	  catch (Exception e) {
			System.out.println("Error is "+e);
			return null;
		}
		  
		  
		  
	  }
	  
	
	  
	  
	  
	  // catogery and allocate room in one method 
	  public boolean isAddPatientCategory(int Pid,String type,int roomNo)
		{
			try
			{
				ps=c.prepareStatement("update patient set category=? where pid=?");
				ps.setString(1, type);
				ps.setInt(2, Pid);
				int value=ps.executeUpdate();
				if(value!=0) {
					
					ps=c.prepareStatement("insert into  PatientRoomJoin values(?,?)");
					ps.setInt(1, Pid);
					ps.setInt(2, roomNo);
					
					value=ps.executeUpdate();
					if(value>0)
					{
						System.out.println("Patient id"+Pid+" added in Room no"+roomNo);
						return true;
					}else
					{
						return false;
					}
					
					
				}
				else {
					return false;
				}
			}
			catch(Exception ex)
			{
				System.out.println("Error is "+ex);
				return false;
			}
			
			
		}
	  
	  
//	  public int getDoctorFees(int did)
//	  {
//		  try
//		  {
//			  ps=c.prepareStatement("select fees from doctor where ");
//		  }
//		  catch(Exception ex)
//		  {
//			  System.out.println("Exception is "+ex);
//			  return 1;
//		  }
//		return did;
//	  }
//	  
	  
   
   
   
   
   
}

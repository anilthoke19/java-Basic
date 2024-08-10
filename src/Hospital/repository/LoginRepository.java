package Hospital.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Hospital.model.AdminLogin;

public class LoginRepository extends DBConfig {

	
	public boolean isAddAdminRegister(String name ,String pass)
	{
		List <String> ar=new ArrayList<String>();
		try {
			ps=c.prepareStatement("insert into admin values(?,?)");
			ps.setString(1, name);
			ps.setString(2, pass);
			return ps.executeUpdate()>0?true:false ;
		} catch (SQLException e) {
			System.out.println(e );
			return false;
		}
		
	}
		public boolean isAdminverified(String username,String password)
		{	
			try
			{
			ps=c.prepareStatement("select*from admin");
			rs=ps.executeQuery();
			
			if(rs.next())
			{
				       if(username.equalsIgnoreCase(rs.getString(1))&& password.equalsIgnoreCase(rs.getString(2)))
						{
					      return true;
						}
				        else
						{
							return false;
						}
			}	
			}catch(Exception e)
			{
				System.out.println(e);
				return false;
			}
			return false;
			
		}
		
		
		
		
		
		
		
	
	
	
}

package Hospital.service;

import Hospital.repository.LoginRepository;

public class AdminService {
	
	LoginRepository lr=new LoginRepository();
	public int AddAdmin(String name,String password)
	{
		return lr.isAddAdminRegister(name,password)?1:-1;
	}
	
	public int Adminverified(String username,String password)
	{
		
	   return lr.isAdminverified(username,password)?1:-1;
	
	}

}

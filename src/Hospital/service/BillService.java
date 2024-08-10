package Hospital.service;

import Hospital.repository.BillRepository;
import Hospital.repository.DoctorRepository;

public class BillService {
	BillRepository br=new BillRepository();
	DoctorRepository dr=new DoctorRepository();
	public int getBill(int pid)
	{
	br.isGetBill(pid);	
//		int did=dr.getDoctorIdByPid(pid);
//		int dfees=
	
		return 1;
	}

}

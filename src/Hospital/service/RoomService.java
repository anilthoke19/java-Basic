package Hospital.service;

import Hospital.model.RoomModel;
import Hospital.repository.RoomRepository;

public class RoomService {

	RoomRepository rs=new RoomRepository();
	
	
	public int addRoom(RoomModel rm)
	{
		
		rs.isAddRoom(rm);
		return 1;
		
	}
	
	
	
}

package in.shriram.dreambiketwowheelerloan.model.service;

import java.util.List;

import in.shriram.dreambiketwowheelerloan.model.model.Cibil;

public interface CibilService {
    	public Cibil updateCibilStatus(int cibilId, String status);


		public Cibil getCibilById(int cibilId);


 

		public Cibil addData(Cibil c);



		public List<Cibil> approvedEnquiry(String status);

		public Cibil getCibilbyId(int cibilId);

		public Cibil delete(int cibilId);

		

}  


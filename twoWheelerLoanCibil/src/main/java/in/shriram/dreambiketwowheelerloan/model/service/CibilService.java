package in.shriram.dreambiketwowheelerloan.model.service;

import in.shriram.dreambiketwowheelerloan.model.model.Cibil;

public interface CibilService {
    	public Cibil updateCibilStatus(int cibilId, String status);


		public Cibil getCibilById(int cibilId);


 

		public Cibil addData(Cibil co);

}  


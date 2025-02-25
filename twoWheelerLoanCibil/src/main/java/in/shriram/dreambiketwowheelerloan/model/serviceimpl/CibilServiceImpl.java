package in.shriram.dreambiketwowheelerloan.model.serviceimpl;


import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.shriram.dreambiketwowheelerloan.model.model.Cibil;
import in.shriram.dreambiketwowheelerloan.model.repository.CibilRepo;
import in.shriram.dreambiketwowheelerloan.model.service.CibilService;
import jakarta.persistence.GenerationType;

@Service
public class CibilServiceImpl implements CibilService{

	@Autowired
	CibilRepo cr;

	@Override  
	public Cibil updateCibilStatus(int cibilId, String status) {
		
		Cibil co = cr.findById(cibilId).get();
		 
		Cibil cu = new Cibil();
		cu.setCibilId(cibilId);
		cu.setCibilRemark(co.getCibilRemark());
		cu.setCibilScore(co.getCibilScore());
		cu.setCibilscoredDateTime(co.getCibilscoredDateTime());
		cu.setStatus(status);
		
		return cr.save(cu);
	}

	@Override

	public Cibil getCibilById(int cibilId) {
				
		return cr.findById(cibilId).get();
	}

	public Cibil addData(Cibil co) {
		
		//Cibil co = new Cibil(); 
		//co.setCibilId(co.getCibilId());
			Random randam = new Random();
			
			int low = 300;
			int high = 900;
			int score =  randam.nextInt(high-low) + low;
			
			co.setCibilScore(score);
		
			co.setCibilscoredDateTime(new Date()); 
			
			String status1;
			
			if(score > 700)
				status1 = "Approved";
			else
				status1="Rejected";
			
			co.setStatus(status1);
		
			String remark = "Good";
			
			if(score >= 300 && score <= 600)
				remark="Need Help";
			
			if(score > 600 && score <= 700)
				remark="Average";
			
			if(score > 700 && score <= 760)
				remark="Good";
			
			if(score > 760 && score <= 800)
				remark="Very Good";
			
			if(score > 800 && score <= 900)
				remark="Excellent";
			
			co.setCibilRemark(remark);
		
			//cr.saveAndFlush(co);
			return cr.save(co);
	}

	@Override

	public List<Cibil> approvedEnquiry(String status) {
		
		Cibil c=new Cibil();
		c.setStatus(c.getStatus());
		
		return cr.findAll();
	}

	public Cibil getCibilbyId(int cibilId) {
		Optional<Cibil> op=cr.findById(cibilId);
		if(op.isPresent()) {
			Cibil cs=op.get();
			return cs;
		}
		return null;
	}

	public Cibil delete(int cibilId) {
		cr.deleteById(cibilId);

		return null;

	}

	
	
}

package in.shriram.dreambiketwowheelerloan.model.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shriram.dreambiketwowheelerloan.model.model.Cibil;
import in.shriram.dreambiketwowheelerloan.model.repository.CibilRepo;
import in.shriram.dreambiketwowheelerloan.model.service.CibilService;

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
		// TODO Auto-generated method stub
		return cr.save(co);
	}

	@Override
	public List<Cibil> approvedEnquiry(String status) {
		
		Cibil c=new Cibil();
		c.setStatus(c.getStatus());
		
		return cr.findByStatus(status);
	}

}

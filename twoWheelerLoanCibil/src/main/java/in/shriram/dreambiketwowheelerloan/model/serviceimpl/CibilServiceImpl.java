package in.shriram.dreambiketwowheelerloan.model.serviceimpl;

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

}

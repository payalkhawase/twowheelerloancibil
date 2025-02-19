package in.shriram.dreambiketwowheelerloan.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.shriram.dreambiketwowheelerloan.model.model.Cibil;
import in.shriram.dreambiketwowheelerloan.model.service.CibilService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cibil")
@Slf4j
public class CibilController {

	@Autowired
	CibilService cs;
		
	@PutMapping("updateCibilStatus/{cibilId}/{status}")
	public ResponseEntity<Cibil> updateCibil(@PathVariable("cibilId") int cibilId, @PathVariable("status") String status) {

		Cibil co = cs.updateCibilStatus(cibilId, status);
		
		return new ResponseEntity<Cibil>(co,HttpStatus.OK);
		
	} 
	
	@GetMapping("/getCibilById/{cibilId}")
	public ResponseEntity<Cibil> getCibilById(@PathVariable("cibilId") int cibilId){
		
		Cibil c=cs.getCibilById(cibilId);
		
		return new ResponseEntity<Cibil>(c,HttpStatus.OK);
	}


}

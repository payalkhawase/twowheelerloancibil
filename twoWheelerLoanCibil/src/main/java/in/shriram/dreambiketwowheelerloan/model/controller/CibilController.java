package in.shriram.dreambiketwowheelerloan.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.shriram.dreambiketwowheelerloan.model.model.Cibil;
import in.shriram.dreambiketwowheelerloan.model.service.CibilService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/cibil")
public class CibilController {

	@Autowired
	CibilService cs;  
	

	@PostMapping("add")
	public ResponseEntity<Cibil> addData(@Valid @RequestBody Cibil co)
	{
		
		Cibil c = cs.addData(co);
		
		return new ResponseEntity<Cibil>(c, HttpStatus.CREATED);
	}
		
	@PutMapping("updateCibilStatus/{cibilId}/{status}")
	public ResponseEntity<Cibil> updateCibil(@PathVariable("cibilId") int cibilId, @PathVariable("status") String status) {

		Cibil co = cs.updateCibilStatus(cibilId, status);
		
		return new ResponseEntity<Cibil>(co,HttpStatus.OK);
		
	} 
	@DeleteMapping("deleteSingleEnquiry/{cibilId}")
     public ResponseEntity<Cibil> delete(@PathVariable("cibilId") int cibilId){
		
		Cibil co=cs.delete(cibilId);
		
		return new ResponseEntity<Cibil>(co, HttpStatus.ACCEPTED);
		
	}
	

	@GetMapping("getcibil/{cibilId}")
	public ResponseEntity<Cibil> getCibilbyId(@PathVariable("cibilId") int cibilId) {

		Cibil co = cs.getCibilbyId(cibilId);
		
		return new ResponseEntity<Cibil>(co,HttpStatus.OK);
		
	} 
	
	
}

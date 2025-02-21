package in.shriram.dreambiketwowheelerloan.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.shriram.dreambiketwowheelerloan.model.model.Cibil;
import in.shriram.dreambiketwowheelerloan.model.service.CibilService;

import jakarta.validation.Valid;


import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cibil")
@Slf4j
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
	
	@GetMapping("/getCibilById/{cibilId}")
	public ResponseEntity<Cibil> getCibilById(@PathVariable("cibilId") int cibilId){
		
		Cibil c=cs.getCibilById(cibilId);
		
		return new ResponseEntity<Cibil>(c,HttpStatus.OK);
	}
	
	@GetMapping("/approvedEnquiry/{status}")
	public ResponseEntity<List<Cibil>> approvedEnquiry(@PathVariable("status") String status){
		
		List<Cibil> cb=cs.approvedEnquiry(status);
		
		return new ResponseEntity<List<Cibil>>(cb,HttpStatus.OK);
	}


}

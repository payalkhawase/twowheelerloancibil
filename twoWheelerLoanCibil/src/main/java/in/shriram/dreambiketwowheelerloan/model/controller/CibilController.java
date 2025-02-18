package in.shriram.dreambiketwowheelerloan.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import in.shriram.dreambiketwowheelerloan.model.service.CibilService;

@RestController
public class CibilController {

	@Autowired
	CibilService cs;
}

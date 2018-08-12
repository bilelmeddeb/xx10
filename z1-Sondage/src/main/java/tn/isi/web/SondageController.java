package tn.isi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.isi.dao.SondageRepository;
import tn.isi.entites.Sondage;

@RestController
@CrossOrigin("*")
@RequestMapping("api")
public class SondageController {
	
	@Autowired
	private SondageRepository sondageRepository ;
	
	
	@RequestMapping(value = "/sndLista", method = RequestMethod.GET)
	public List<Sondage> getSondages() {
		return sondageRepository.findAll();
	}

}

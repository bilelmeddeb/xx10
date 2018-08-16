package tn.isi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import tn.isi.dao.SondageRepository;
import tn.isi.entites.Question;
import tn.isi.entites.Sondage;
import tn.isi.metier.SondageService;


@RestController
@CrossOrigin("*")
@RequestMapping("api")
public class SondageRegisterController {
	
	private final SondageRepository sondageRepository;
	private SondageService sondageservice;
	
	@Autowired
	public SondageRegisterController(SondageRepository sondageRepository) {
		this.sondageRepository=sondageRepository;
	}
	
	
	@RequestMapping(
			value="/savesnd",
			method = RequestMethod.POST,
			produces= MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<?>registersondage(@RequestBody Sondage sondage){
		if(sondageRepository.findOneByTitre(sondage.getTitre())!=null) {
			return new ResponseEntity<>(new Sondage(),HttpStatus.OK);
		}
		Sondage createdSondage=sondageRepository.save(sondage);
		return new ResponseEntity<>(createdSondage,HttpStatus.OK);
	}
	
	
	
	@RequestMapping(
			value="/saveall",
			method=RequestMethod.POST,
			produces= MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<?>registersond(@RequestBody Sondage sondage){
		
		Sondage createdSondage= sondageservice.addSND(sondage);
		return new ResponseEntity<>(createdSondage,HttpStatus.OK);
	}

}

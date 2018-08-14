package tn.isi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.isi.dao.SondageRepository;
import tn.isi.entites.Sondage;


@RestController
@CrossOrigin("*")
@RequestMapping("api")
public class SondageRegisterController {
	
	private final SondageRepository sondageRepository;

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

}

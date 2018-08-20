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

import tn.isi.dao.OptionaRepository;
import tn.isi.dao.QuestionRepository;
import tn.isi.dao.SondageRepository;
import tn.isi.entites.Optiona;
import tn.isi.entites.Question;
import tn.isi.entites.Sondage;


@RestController
@CrossOrigin("*")
@RequestMapping("api")
public class SondageRegisterController {
	
	private final SondageRepository sondageRepository;
	private final QuestionRepository questionRepository ;
	private final OptionaRepository optionaRepository;
	
	@Autowired
	public SondageRegisterController(SondageRepository sondageRepository , OptionaRepository optionaRepository , QuestionRepository questionRepository) {
		this.sondageRepository=sondageRepository;
		this.questionRepository=questionRepository;
		this.optionaRepository=optionaRepository;
	}
	
/*********************************Save-snd*************************************/
 	@RequestMapping(
			value="/savesndd",
			method = RequestMethod.POST,
			produces= MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<?>registersondag(@RequestBody Sondage sondage){
			
	
		if(sondageRepository.findOneByTitre(sondage.getTitre())!=null) {
			return new ResponseEntity<>(new Sondage(),HttpStatus.OK);
		}
						
	
		Sondage createdSondage=sondageRepository.save(sondage);
		
		for(Question question : sondage.getQuestions())
		{
			question.setSondage(createdSondage);
			Question createdQuestion =questionRepository.save(question);
			
				for (Optiona optiona: question.getOptions())
					{
						optiona.setQst(createdQuestion);
						Optiona CreatedOption= optionaRepository.save(optiona);
					}
		}
		
		return new ResponseEntity<>(createdSondage,HttpStatus.OK);
	
	
	}

	

	/****************Pour le test afichage fil console ***************************/
		
	
/*
	@RequestMapping(
			value="/savesndd",
			method = RequestMethod.POST,
			produces= MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE
			)
	public Sondage registersondage(@RequestBody Sondage sondage){
		
	
		JSONObject a = new JSONObject(sondage);

	
		System.out.println("****le json object a :*******");
		System.out.println(a);
		System.out.println("-------------------");
		
		JSONArray qus = a.getJSONArray("questions");
		
		for (int i=0; i< qus.length(); ++i)
		{
			JSONObject qu =qus.getJSONObject(i);
			Gson gson =new GsonBuilder().create();
			String titre_qu = qu.getString("titre_question");
			System.out.println("la liste des titre des question est :^^^^^^^^^^^^^^");
			System.out.println(titre_qu);

		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		return sondage;

	}
	*/

	
}

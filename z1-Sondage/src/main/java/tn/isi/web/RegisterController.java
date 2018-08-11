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

import tn.isi.dao.UserRepository;
import tn.isi.entites.User;

@RestController
@CrossOrigin("*")
@RequestMapping("api")
public class RegisterController {
	
	private final UserRepository userRepository;
	
	@Autowired
	public RegisterController(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	@RequestMapping(
			value="/registerr",
			method = RequestMethod.POST,
			produces= MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<?> register(@RequestBody User user){
		if (userRepository.findOneByEmail(user.getEmail())!=null) {
			return new ResponseEntity<>(new User(),HttpStatus.OK);
		}
		
		User createdUser=userRepository.save(user);
		return new ResponseEntity<>(createdUser,HttpStatus.OK);
	}

}

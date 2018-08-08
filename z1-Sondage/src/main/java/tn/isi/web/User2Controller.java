package tn.isi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.isi.dao.UserRepository;
import tn.isi.entites.User;

@RestController
@CrossOrigin("*")
public class User2Controller {
	@Autowired
	private UserRepository userrepository;

	@RequestMapping(value = "/usersBy", method = RequestMethod.GET)
	public List<User> getListUserByNom(@RequestParam(name = "mc", defaultValue = "") String mc) 
	{
		return userrepository.chercherUserByNom("%" + mc + "%");
	}

	@RequestMapping(value = "/usersLista", method = RequestMethod.GET)
	public List<User> getUsers() 
	{
		return userrepository.findAll();
	}
	
	@RequestMapping(value = "/usersave", method = RequestMethod.POST)
	public User saveUsers(@RequestBody User U) 
	{
		return userrepository.save(U);
	}
	
}

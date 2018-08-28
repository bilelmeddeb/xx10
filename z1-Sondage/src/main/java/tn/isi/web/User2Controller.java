package tn.isi.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import tn.isi.dao.UserRepository;
import tn.isi.entites.User;

@RestController
@CrossOrigin("*")
@RequestMapping("api")
public class User2Controller {
	@Autowired
	private UserRepository userrepository;
	@Value("${xs}")
	private String imageDir;

	@RequestMapping(value = "/usersBy", method = RequestMethod.GET)
	public List<User> getListUserByNom(@RequestParam(name = "mc", defaultValue = "") String mc) {
		return userrepository.chercherUserByNom("%" + mc + "%");
	}

	@RequestMapping(value = "/usersLista", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userrepository.findAll();
	}

	@RequestMapping(value = "/usersave", method = RequestMethod.POST)
	public User saveUsers(@RequestBody User U ) {
		
		/*	if(!(userimage.isEmpty())) {
				System.out.println("--------------");
				System.out.println(userimage.getOriginalFilename());
				U.setimageuser(userimage.getOriginalFilename());
				userimage.transferTo(new File(System.getProperty("user.home")+"/ph/"+userimage.getOriginalFilename()));
			}
		if(!(UserImage.isEmpty())) {
			U.setUserImage(UserImage.getOriginalFilename());
			U.getUserImage().transferTo(new File(imageDir));
		}
		System.out.println("--------------");
		System.out.println("-------tsajal------");
		//System.out.println(nomm);*/

		
		return userrepository.save(U);


	}

}

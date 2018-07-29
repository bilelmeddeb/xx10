package tn.isi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tn.isi.dao.UserRepository;
import tn.isi.entites.User;

@Controller
@RequestMapping(value = "/User")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/index")
	public String index(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "motcle", defaultValue = "") String mc) {

		Page<User> userspage = userRepository.findByNom("%" + mc + "%", new PageRequest(p, 5));

		int pageCount = userspage.getTotalPages();

		int[] pages = new int[pageCount];
		for (int i = 0; i < pageCount; i++)
			pages[i] = i;
		model.addAttribute("pages", pages);
		model.addAttribute("pageUser", userspage);
		model.addAttribute("pageCourante", p);
		model.addAttribute("motCle", mc);
		return "Users";
	}
	

}

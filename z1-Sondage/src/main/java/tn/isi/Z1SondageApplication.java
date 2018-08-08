package tn.isi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import com.jayway.jsonpath.Option;


import tn.isi.dao.CategorieRpository;
import tn.isi.dao.OptionaRepository;
import tn.isi.dao.QuestionRepository;
import tn.isi.dao.SondageRepository;

import tn.isi.dao.UserRepository;
import tn.isi.entites.Categorie;
import tn.isi.entites.Optiona;
import tn.isi.entites.Question;
import tn.isi.entites.Sondage;

import tn.isi.entites.User;

@SpringBootApplication

public class Z1SondageApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Z1SondageApplication.class, args);

		// fama 7lkaya chakeke fiha na3rech es ce que ya mel hibernate aka l code hqm
		// adheka walla 7kaya tab3ales convention ta3 el web
		// hamza nahihom el kol ?? akili fi repo ?? w njarab ??
		// la7dha trah ncomentiwhem

		/*
		 * UserRepository userRepository = ctx.getBean(UserRepository.class);
		 * SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);
		 * userRepository.save(new User("09814217", "meddeb", "bilel", "m2b@mail.com",
		 * (long) 23206993)); userRepository.save(new User("098142172", "meddeb2",
		 * "bilel2", "m2b@mail.com2", (long) 232062993));
		 * 
		 * //userRepository.findAll().forEach(p -> System.out.println(p.getCin()));
		 * 
		 * SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);
		 * sondageRepository.save(new Sondage("zara", "l7wayej", new Date()));
		 * sondageRepository.save(new Sondage("zara2", "l7wayej2", new Date()));
		 * sondageRepository.save(new Sondage("Medicament ", "lgonfoln", new Date()));
		 * sondageRepository.save(new Sondage("Medicament ", "Doliprane ", new Date()));
		 * 
		 *
		 * 
		 * ThemeRepository ThemeRepository = ctx.getBean(ThemeRepository.class);
		 * ThemeRepository.save(new Theme("Sport")); ThemeRepository.save(new
		 * Theme("Medicamùent"));
		 * 
		 * 
		 * Sous_themeRepository sous_themeRepository =
		 * ctx.getBean(Sous_themeRepository.class); sous_themeRepository.save(new
		 * Sous_theme("foot")); sous_themeRepository.save(new Sous_theme("dwa"));
		 * 
		 * QuestionRepository questionRepository=ctx.getBean(QuestionRepository.class);
		 * questionRepository.save(new Question("chniya rayek"));
		 * questionRepository.save(new Question("chniya rayek2"));
		 * questionRepository.save(new Question("chniya rayek10"));
		 * questionRepository.save(new Question("chniya rayek20"));
		 * 
		 * 
		 * OptionaRepository optionaRepository=ctx.getBean(OptionaRepository.class);
		 * optionaRepository.save(new Optiona("ok1")); optionaRepository.save(new
		 * Optiona("ok2")); optionaRepository.save(new Optiona("ok3"));
		 * optionaRepository.save(new Optiona("ok4")); optionaRepository.save(new
		 * Optiona("ok5")); optionaRepository.save(new Optiona("ok6"));
		 * optionaRepository.save(new Optiona("ok7"));
		 */
	
		/*
		OptionaRepository optionaRepository = ctx.getBean(OptionaRepository.class);
		Optiona opa1 = optionaRepository.save(new Optiona("oui"));
		Optiona opa2 = optionaRepository.save(new Optiona("Non"));
		Optiona opa3 = optionaRepository.save(new Optiona("Aucun"));
		Optiona opa4 = optionaRepository.save(new Optiona("YES"));
		Optiona opa5 = optionaRepository.save(new Optiona("Nine"));
		Optiona opa6 = optionaRepository.save(new Optiona("Naght"));

		Optiona o1 = optionaRepository.save(new Optiona("ok1"));
		Optiona o2 = optionaRepository.save(new Optiona("ok2"));
		Optiona o3 = optionaRepository.save(new Optiona("ok3"));
		Optiona o4 = optionaRepository.save(new Optiona("ok4"));
		Optiona o5 = optionaRepository.save(new Optiona("ok5"));
		Optiona o6 = optionaRepository.save(new Optiona("ok6"));
		Optiona o7 = optionaRepository.save(new Optiona("ok7"));
		Optiona o8 = optionaRepository.save(new Optiona("ok88"));

		QuestionRepository questionRepository = ctx.getBean(QuestionRepository.class);
		Collection<Optiona> optionas1 = new ArrayList<Optiona>();

		optionas1.add(o1);
		optionas1.add(o2);
		Collection<Optiona> optionas2 = new ArrayList<Optiona>();
		optionas2.add(o3);
		optionas2.add(o4);
		Collection<Optiona> optionas3 = new ArrayList<Optiona>();
		optionas3.add(o5);
		optionas3.add(o6);

		Collection<Optiona> optionas4 = new ArrayList<Optiona>();

		optionas4.add(o7);
		optionas4.add(o8);

		Question q1 = questionRepository.save(new Question("chniya rayek", optionas1));
		Question q2 = questionRepository.save(new Question("chniya rayek2", optionas2));
		Question q3 = questionRepository.save(new Question("chniya rayek10", optionas3));
		Question q4 = questionRepository.save(new Question("chniya rayek20", optionas4));

		o1.setQst(q1);
		o2.setQst(q1);
		o3.setQst(q2);
		o4.setQst(q2);
		o5.setQst(q3);
		o6.setQst(q3);
		o7.setQst(q4);
		o8.setQst(q4); // modifyin question

		optionaRepository.save(o1);
		optionaRepository.save(o2);
		optionaRepository.save(o3);

		optionaRepository.save(o4);

		optionaRepository.save(o5);

		optionaRepository.save(o6);

		optionaRepository.save(o7);
		optionaRepository.save(o8);
		SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);

		UserRepository userRepository = ctx.getBean(UserRepository.class);
		User bilel = userRepository
				.save(new User("4", "bilel", "meddeb", "b@mail.com", (long) 23206993, "123456789", new Date()));
		User hamza = userRepository
				.save(new User("2", "hamza", "meddeb", "b@mail.com", (long) 23206993, "123456789", new Date()));
		User amir = userRepository
				.save(new User("3", "amir", "meddeb", "b@mail.com", (long) 23206993, "123456789", new Date()));
		User mohsen = userRepository
				.save(new User("10", "mohsen", "meddeb", "b@mail.com", (long) 23206993, "123456789", new Date()));

		User afif = userRepository
				.save(new User("6", "afif", "meddeb", "b@mail.com", (long) 23206993, "123456789", new Date()));

		User basma = userRepository
				.save(new User("9", "basma", "meddeb", "b@mail.com", (long) 23206993, "123456789", new Date()));
		User wahid = userRepository
				.save(new User("10", "wahid", "meddeb", "b@mail.com", (long) 23206993, "123456789", new Date()));

		User adel = userRepository
				.save(new User("10", "adel", "meddeb", "b@mail.com", (long) 23206993, "123456789", new Date()));

		User abdou = userRepository
				.save(new User("9", "abdou", "meddeb", "b@mail.com", (long) 23206993, "123456789", new Date()));

		Sondage snd1 = sondageRepository.save(new Sondage("foot", "foot", new Date(), bilel));
		Sondage snd2 = sondageRepository.save(new Sondage("hnd", "foot", new Date(), hamza));

		Collection<Sondage> Sondage_I_Respond = new ArrayList<Sondage>();
		Sondage_I_Respond.add(snd2);

		adel.setLes_snd_jawibt_alihom(Sondage_I_Respond);
		bilel.setLes_snd_jawibt_alihom(Sondage_I_Respond);
		amir.setLes_snd_jawibt_alihom(Sondage_I_Respond);
		abdou.setLes_snd_jawibt_alihom(Sondage_I_Respond);

		Collection<Sondage> Sondage_I_Respond2 = new ArrayList<Sondage>();
		Sondage_I_Respond2.add(snd2);

		adel.setLes_snd_jawibt_alihom(Sondage_I_Respond2);
		basma.setLes_snd_jawibt_alihom(Sondage_I_Respond2);
		afif.setLes_snd_jawibt_alihom(Sondage_I_Respond2);
		// abdou.setLes_snd_jawibt_alihom(Sondage_I_Respond2);

		userRepository.save(adel);
		userRepository.save(wahid);
		userRepository.save(basma);
		userRepository.save(abdou);

		Collection<User> users1 = new ArrayList<User>();
		users1.add(adel);
		users1.add(hamza);
		users1.add(amir);
		users1.add(abdou);
		snd1.setUsers_jawbou_3aliya(users1);
		sondageRepository.save(snd1);

		Collection<User> users2 = new ArrayList<User>();
		users2.add(mohsen);
		users2.add(wahid);
		users2.add(afif);
		users2.add(abdou);
		snd2.setUsers_jawbou_3aliya(users2);
		sondageRepository.save(snd2);

		///
		q1.setSondage(snd2);
		q2.setSondage(snd2);
		q3.setSondage(snd1);
		q4.setSondage(snd1);

		// Nouveau Update
		q1.setOptiona(o1);
		q2.setOptiona(o4);

		questionRepository.save(q1);
		questionRepository.save(q2);
		questionRepository.save(q3);
		questionRepository.save(q4);
		// sous Categories
		Collection<Categorie> categ_Multimidia_Liste = new ArrayList<Categorie>();
		// Categorie
		Categorie categ_Multimidia = new Categorie("Sport", categ_Multimidia_Liste);
		// sousCategory1
		Categorie telephone = new Categorie("Natation", categ_Multimidia);

		Categorie Pc = new Categorie("Foot", categ_Multimidia);
		// sousCategory2
		categ_Multimidia_Liste.add(telephone);
		categ_Multimidia_Liste.add(Pc);
		CategorieRpository cateorieRepository = ctx.getBean(CategorieRpository.class);
		cateorieRepository.save(categ_Multimidia);
		cateorieRepository.save(Pc);
		cateorieRepository.save(telephone);
		// Page<User> use = userRepository.chercheUserRepondaunsondage("hnd", new
		// PageRequest(0, 3));
		// use.forEach(e -> System.out.println(e.getNom()));
		// List<Sondage>ss =
		// abdou.getLes_snd_jawibt_alihom().forEach(e->{e.getQuestions().forEach(z->z.getOptiona().getReponce());
		// return e ; });
		List<Optiona> Choices = userRepository.Get_Liste_Reponce(abdou.getCin(), snd2.getId());
		Choices.forEach(e -> System.out.println(e.getReponce()));
		
		List<Categorie> soucateg = cateorieRepository.findByCategoriees(categ_Multimidia.getId());
		
		soucateg.forEach(e->{System.out.println(e.getName());});
		// Page<User> findd = userRepository.findByNom("bilel", new PageRequest(0, 1));
		/// findd.forEach(e -> System.out.println(e.getNom()));
		/**/
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		userRepository.save(new User("09814217", "bilel", "meddeb", "bilel@meddeb.com", (long)23206993, "123456789", new Date()));
		userRepository.save(new User("09814216", "med", "meddeb", "bilel@meddeb.com", (long)23206993, "123456789", new Date()));
		userRepository.save(new User("09814218", "hamza", "meddeb", "bilel@meddeb.com", (long)23206993, "123456789", new Date()));

	}
	
	
}

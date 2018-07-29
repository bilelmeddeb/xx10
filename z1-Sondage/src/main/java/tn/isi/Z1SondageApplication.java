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

import tn.isi.dao.OptionaRepository;
import tn.isi.dao.QuestionRepository;
import tn.isi.dao.SondageRepository;
import tn.isi.dao.Sous_themeRepository;
import tn.isi.dao.ThemeRepository;
import tn.isi.dao.UserRepository;
import tn.isi.entites.Optiona;
import tn.isi.entites.Question;
import tn.isi.entites.Sondage;
import tn.isi.entites.Sous_theme;
import tn.isi.entites.Theme;
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
		 * OptionaRepository optionaRepository = ctx.getBean(OptionaRepository.class);
		 * Optiona o1 = optionaRepository.save(new Optiona("ok1")); Optiona o2 =
		 * optionaRepository.save(new Optiona("ok2")); Optiona o3 =
		 * optionaRepository.save(new Optiona("ok3")); Optiona o4 =
		 * optionaRepository.save(new Optiona("ok4")); Optiona o5 =
		 * optionaRepository.save(new Optiona("ok5")); Optiona o6 =
		 * optionaRepository.save(new Optiona("ok6")); Optiona o7 =
		 * optionaRepository.save(new Optiona("ok7")); Optiona o8 =
		 * optionaRepository.save(new Optiona("ok88"));
		 * 
		 * QuestionRepository questionRepository =
		 * ctx.getBean(QuestionRepository.class); Collection<Optiona> optionas1 = new
		 * ArrayList<Optiona>(); optionas1.add(o1); optionas1.add(o2);
		 * 
		 * Collection<Optiona> optionas2 = new ArrayList<Optiona>(); optionas1.add(o3);
		 * optionas1.add(o4);
		 * 
		 * Collection<Optiona> optionas3 = new ArrayList<Optiona>(); optionas1.add(o5);
		 * optionas1.add(o6);
		 * 
		 * Collection<Optiona> optionas4 = new ArrayList<Optiona>();
		 * 
		 * optionas1.add(o7); optionas1.add(o8);
		 * 
		 * Question q1 = questionRepository.save(new Question("chniya rayek",
		 * optionas1)); Question q2 = questionRepository.save(new
		 * Question("chniya rayek2", optionas2)); Question q3 =
		 * questionRepository.save(new Question("chniya rayek10", optionas3)); Question
		 * q4 = questionRepository.save(new Question("chniya rayek20", optionas4));
		 * 
		 * o1.setQst(q1); o2.setQst(q1); o3.setQst(q2); o4.setQst(q2); o5.setQst(q3);
		 * o6.setQst(q3); o7.setQst(q4); o8.setQst(q4); // modifyin question
		 * 
		 * optionaRepository.save(o1); optionaRepository.save(o2);
		 * optionaRepository.save(o3);
		 * 
		 * optionaRepository.save(o4);
		 * 
		 * optionaRepository.save(o5);
		 * 
		 * optionaRepository.save(o6);
		 * 
		 * optionaRepository.save(o7); optionaRepository.save(o8);
		 * 
		 * User bilel = userRepository.save(new User("09814217", "meddeb", "bilel",
		 * "m2b@mail.com", (long) 23206993)); User hamza = userRepository.save(new
		 * User("09814217", "meddeb", "bilel", "m2b@mail.com", (long) 23206993));
		 * 
		 * 
		 * Collection<Question> questions1 = new ArrayList<Question>();
		 * questions1.add(q1); questions1.add(q2);
		 * 
		 * Collection<Question> questions2 = new ArrayList<Question>();
		 * questions1.add(q3); questions1.add(q4); Sous_themeRepository
		 * sous_themeRepository = ctx.getBean(Sous_themeRepository.class); Sous_theme s1
		 * = sous_themeRepository.save(new Sous_theme("foot")); Sous_theme s2 =
		 * sous_themeRepository.save(new Sous_theme("dwa")); //
		 * sondageRepository.save(new Sondage("Medicament ", "lgonfoln", new //
		 * Date(),bilel)); User hamza = userRepository.save(new User("09814217",
		 * "meddeb", "bilel", "m2b@mail.com", (long) 23206993));
		 * 
		 * ThemeRepository ThemeRepository = ctx.getBean(ThemeRepository.class);
		 * Collection<Sous_theme> sous_themes1 = new ArrayList<Sous_theme>();
		 * Collection<Sous_theme> sous_themes2 = new ArrayList<Sous_theme>();
		 * sous_themes1.add(s1); sous_themes2.add(s2); Theme theme1 =
		 * ThemeRepository.save(new Theme("Sport", sous_themes1)); Theme theme2 =
		 * ThemeRepository.save(new Theme("Medicamùent", sous_themes2));
		 * s1.setTheme(theme1); s2.setTheme(theme2);
		 * 
		 * Collection<User> users1 = new ArrayList<User>(); users1.add(bilel);
		 * Collection<User> users2 = new ArrayList<User>(); users1.add(hamza);
		 * 
		 * Collection<User> usersR1 = new ArrayList<User>(); users1.add(hamza);
		 * Collection<User> usersR2 = new ArrayList<User>(); users1.add(bilel); Sondage
		 * sondg1 = sondageRepository .save(new Sondage("Medicament ", "lgonfoln", new
		 * Date(), bilel, questions1, users1, s1));
		 * 
		 * Sondage sondg2 = sondageRepository .save(new Sondage("bebidas ", "JusOrange",
		 * new Date(), hamza, questions2, users2, s2));
		 */

		/*
		 * UserRepository userRepository = ctx.getBean(UserRepository.class); User bilel
		 * = userRepository.save(new User("09814217", "meddeb", "bilel", "m2b@mail.com",
		 * (long) 23206993)); User hamza = userRepository.save(new User("09814217",
		 * "sayari", "hamza", "m2b@mail.com", (long) 23206993)); User amir =
		 * userRepository.save(new User("09814217", "amir", "amirr", "m2b@mail.com",
		 * (long) 23206993));
		 * 
		 * SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);
		 */

		/*
		 * Sondage snd1=sondageRepository.save(new Sondage("sondage-1",
		 * "sondage san3ou bilel", new Date(), bilel)); Sondage
		 * snd2=sondageRepository.save(new Sondage("sondage-2", "sondage san3ou bilel",
		 * new Date(), bilel));
		 * 
		 * Sondage snd3=sondageRepository.save(new Sondage("sondage-3",
		 * "sondage san3ou hamza", new Date(), hamza)); Sondage
		 * snd4=sondageRepository.save(new Sondage("sondage-4", "sondage san3ou hamza",
		 * new Date(), hamza));
		 */

		/*
		 * Collection<User> usersR1 = new ArrayList<User>(); usersR1.add(hamza);
		 * Collection<User> usersR2 = new ArrayList<User>(); usersR2.add(bilel);
		 * usersR2.add(amir);
		 * 
		 * SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);
		 * Sondage snd1 =sondageRepository.save(new Sondage("aaa", "bbbbb", new
		 * Date(),usersR2 ));
		 */
		/*
		 * SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);
		 */

		// les sondages hadhom raw maghri owner juste akakea ferghin
		// ey ey ya hamza mani kotlik batalit khan nnjarab creation simple chay ma ba
		// yemchi chof
		// hamza araftha chouf chouf
		// wada7 l7dha
		// ya3tini 3asba hhh nn fama l mochkla o5ra
		// ti ahna hana raja3na awil hql w hiya tnakit ali hiya mich dakhla ta option :o
		// :o

		// 9a3ed yara fel option w les relatio,s emla estan nlawjou 3liha trah

		/*
		 * sondageRepository.save(new Sondage("7wayej", "7wayej bahin w khaybin", new
		 * Date())); sondageRepository.save(new Sondage("7wayej2",
		 * "7aawayej bahin w khaybin", new Date())); sondageRepository.save(new
		 * Sondage("BILEL", "7wayej bahin w khaybin", new Date()));
		 * sondageRepository.save(new Sondage("Bilelmeddeb",
		 * "7aa/ wayej bahin w khaybin", new Date())); sondageRepository.save(new
		 * Sondage("bolbol", "7wayej bahin w khaybin", new Date()));
		 * sondageRepository.save(new Sondage("7ddd", "7aawayej bahin w khaybin", new
		 * Date())); sondageRepository.save(new Sondage("abhisa",
		 * "7wayej bahin w khaybin", new Date())); sondageRepository.save(new
		 * Sondage("7wddddqez", "7aawayej bahin w khaybin", new Date()));
		 */

		/*
		 * Page<Sondage> snd=sondageRepository.chercherSondage("%b%", new PageRequest(0,
		 * 10)); snd.forEach(e->System.out.println(e.getTitre()));
		 */

		/*********************
		 * jarrabna sous theme yemchi
		 * 
		 * Sous_themeRepository sous_themeRepository =
		 * ctx.getBean(Sous_themeRepository.class); Sous_theme s1 =
		 * sous_themeRepository.save(new Sous_theme("foot")); Sous_theme s2 =
		 * sous_themeRepository.save(new Sous_theme("hand")); Sous_theme s3 =
		 * sous_themeRepository.save(new Sous_theme("makla")); Sous_theme s4 =
		 * sous_themeRepository.save(new Sous_theme("boisson"));
		 * 
		 * ThemeRepository ThemeRepository = ctx.getBean(ThemeRepository.class);
		 * Collection<Sous_theme> sous_themes1 = new ArrayList<Sous_theme>();
		 * Collection<Sous_theme> sous_themes2 = new ArrayList<Sous_theme>();
		 * 
		 * sous_themes1.add(s1); sous_themes1.add(s2); sous_themes2.add(s3);
		 * sous_themes2.add(s4);
		 * 
		 * Theme theme1 = ThemeRepository.save(new Theme("Sport", sous_themes1)); Theme
		 * theme2 = ThemeRepository.save(new Theme("3acha", sous_themes2));
		 * 
		 * s1.setTheme(theme1); s2.setTheme(theme1); s3.setTheme(theme2);
		 * s4.setTheme(theme2); sous_themeRepository.save(s1);
		 * sous_themeRepository.save(s2); sous_themeRepository.save(s3);
		 * sous_themeRepository.save(s4);
		 * 
		 * 
		 * List<Sous_theme> sn=sous_themeRepository.chercheSousthemeByTheme("Sport");
		 * sn.forEach(e->System.out.println(e.getTitre()));
		 * 
		 */

		/****
		 * chercher sondageBySousTheme*************
		 * 
		 * Sous_themeRepository sous_themeRepository =
		 * ctx.getBean(Sous_themeRepository.class); Sous_theme s1 =
		 * sous_themeRepository.save(new Sous_theme("foot")); Sous_theme s2 =
		 * sous_themeRepository.save(new Sous_theme("hand"));
		 * 
		 * SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);
		 * sondageRepository.save(new Sondage("sondage_s1_foot", "taba3foot", new
		 * Date(), s1)); sondageRepository.save(new Sondage("sondage_s2_foot",
		 * "taba3foot", new Date(), s1)); sondageRepository.save(new
		 * Sondage("sondage_s3_hand", "taba3foot2", new Date(), s2));
		 * sondageRepository.save(new Sondage("sondage_s4_hand", "taba3foot2", new
		 * Date(), s2));
		 * 
		 * 
		 * List<Sondage> sn=sondageRepository.chercheSondageBySoustheme("hand");
		 * sn.forEach(e->System.out.println(e.getTitre()));
		 * 
		 */

		/****
		 * chercher Sondage By User Repondue*****
		 * 
		 * SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);
		 * Sondage bs1=sondageRepository.save(new Sondage("foot", "footfoot", new
		 * Date())); Sondage bs2=sondageRepository.save(new Sondage("hond", "footfoot",
		 * new Date())); Sondage bs3=sondageRepository.save(new Sondage("basket",
		 * "footfoot", new Date())); Sondage bs4=sondageRepository.save(new
		 * Sondage("tenis_s4", "footfoot", new Date()));
		 * 
		 * 
		 * Collection<Sondage> sondage1= new ArrayList<Sondage>(); Collection<Sondage>
		 * sondage2= new ArrayList<Sondage>(); sondage1.add(bs1); sondage1.add(bs2);
		 * sondage1.add(bs3); sondage2.add(bs4);
		 * 
		 * UserRepository userRepository = ctx.getBean(UserRepository.class);
		 * 
		 * User bilel=userRepository.save(new User("09814217", "bilel", "bbb",
		 * "gg@gg.com", (long) 23206993, "11111", new Date(), sondage1)); User
		 * hamza=userRepository.save(new User("hamza", "hamza", "bbb", "gg@gg.com",
		 * (long) 23206993, "11111", new Date(), sondage1)); User
		 * amir=userRepository.save(new User("amir", "amir", "bbb", "gg@sgg.com", (long)
		 * 23206993, "11111", new Date(), sondage2));
		 * 
		 * List<Sondage> sn=sondageRepository.chercheSondageByUserRependue("09814217");
		 * sn.forEach(e->System.out.println(e.getTitre()));
		 */

		/*
		 * chercher user ijawib ala sondage
		 * 
		 * 
		 */
		// kalemni y a hamza i

		/*
		 * UserRepository userRepository = ctx.getBean(UserRepository.class); User bilel
		 * = userRepository.save(new User("bilel", "bilel", "bilel", "bilel", (long)
		 * 23206993)); User hamza = userRepository.save(new User("hamza", "hamza",
		 * "hamza", "bilel", (long) 23206993)); User amir = userRepository.save(new
		 * User("amir", "amir", "amir", "bilel", (long) 23206993)); User mohsen =
		 * userRepository.save(new User("mohsen", "mohsen", "mohsen", "bilel", (long)
		 * 23206993));
		 * 
		 * Collection<User> users1 = new ArrayList<User>(); users1.add(bilel);
		 * users1.add(hamza); users1.add(amir);
		 * 
		 * SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);
		 * Sondage bs1=sondageRepository.save(new Sondage("foot", "footfoot", new
		 * Date(),users1)); sondageRepository.save(new Sondage("ss", "sss", new Date(),
		 * bilel));
		 * 
		 * sondageRepository.save(bs1);
		 * 
		 * List<User> us=userRepository.chercheUserRepondaunsondage("foot");
		 * us.forEach(e->System.out.println(e.getNom())); System.out.println("hhh");
		 */

		/*
		 * UserRepository userRepository = ctx.getBean(UserRepository.class); User
		 * bilel=userRepository.save(new User("09814217", "bilel", "meddeb",
		 * "m2@mail.com", (long) 23206993, "123456789", new Date())); User
		 * hamza=userRepository.save(new User("09814218", "hamza", "meddeb",
		 * "m2@mail.com", (long) 23206993, "123456789", new Date())); User
		 * amira=userRepository.save(new User("09814216", "amir", "meddeb",
		 * "m2@mail.com", (long) 23206993, "123456789", new Date())); User
		 * mohsn=userRepository.save(new User("09814219", "mohsen", "meddeb",
		 * "m2@mail.com", (long) 23206993, "123456789", new Date()));
		 * 
		 * Collection<User> users1 = new ArrayList<User>(); users1.add(bilel);
		 * users1.add(hamza); users1.add(amira);
		 * 
		 * Collection<User> users2 = new ArrayList<User>(); users2.add(mohsn);
		 * 
		 * SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);
		 * Sondage snd1=sondageRepository.save(new Sondage("foot", "foot", new Date(),
		 * users1)); Sondage snd2=sondageRepository.save(new Sondage("hand", "foot", new
		 * Date(), users2));
		 * 
		 * 
		 * List<User> use=userRepository.chercheUserRepondaunsondage("foot");
		 * use.forEach(e->System.out.println(e.getNom()));
		 */


		/***lawij ala les user ali jawbou ala 1 sondage ****
		 * 
		 * 
		 *
		SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		User bilel = userRepository
				.save(new User("09814217", "bilel", "meddeb", "m2@mail.com", (long) 23206993, "123456789", new Date()));
		User hamza = userRepository
				.save(new User("09814218", "hamza", "meddeb", "m2@mail.com", (long) 23206993, "123456789", new Date()));
		User amira = userRepository
				.save(new User("09814216", "amir", "meddeb", "m2@mail.com", (long) 23206993, "123456789", new Date()));
		User mohsn = userRepository.save(
				new User("09814219", "mohsen", "meddeb", "m2@mail.com", (long) 23206993, "123456789", new Date()));

	
		Sondage snd1 = sondageRepository.save(new Sondage("foot", "foot", new Date(), bilel));

		Collection<Sondage> Sondage_I_Respond = new ArrayList<Sondage>();
		Sondage_I_Respond.add(snd1);
		hamza.setLes_snd_jawibt_alihom(Sondage_I_Respond);
		bilel.setLes_snd_jawibt_alihom(Sondage_I_Respond);
		amira.setLes_snd_jawibt_alihom(Sondage_I_Respond);

		Sondage snd2 = sondageRepository.save(new Sondage("hnd", "foot", new Date(), bilel));
		Collection<Sondage> Sondage_I_Respond2 = new ArrayList<Sondage>();
		Sondage_I_Respond2.add(snd2);

		hamza.setLes_snd_jawibt_alihom(Sondage_I_Respond2);
		amira.setLes_snd_jawibt_alihom(Sondage_I_Respond2);

		userRepository.save(hamza);
		userRepository.save(bilel);
		userRepository.save(amira);

		Collection<User> users1 = new ArrayList<User>();
		users1.add(bilel);
		users1.add(hamza);
		users1.add(amira);
		snd1.setUsers_jawbou_3aliya(users1);
		sondageRepository.save(snd1);

		/*Collection<User> users2 = new ArrayList<User>();
		users2.add(hamza);
		users2.add(amira);
		snd2.setUsers_jawbou_3aliya(users2);
		sondageRepository.save(snd2);

		List<User> use = userRepository.chercheUserRepondaunsondage("hnd");
		use.forEach(e -> System.out.println(e.getNom()));
        
		*/
		
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		User bilel= userRepository.save(new User("1", "bilel", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User hamza= userRepository.save(new User("2", "hamza", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User amir = userRepository.save(new User("3", "amir", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User mohsen= userRepository.save(new User("4", "mohsen", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User med  = userRepository.save(new User("5", "med", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User afif = userRepository.save(new User("6", "afif", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User tijani= userRepository.save(new User("7", "tijani", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User marwen= userRepository.save(new User("8", "marwan", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User basma= userRepository.save(new User("9", "basma", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User wahid= userRepository.save(new User("10", "wahid", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User fatma= userRepository.save(new User("8", "fatma", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User tesnim= userRepository.save(new User("9", "tesnim", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User adel= userRepository.save(new User("10", "adel", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User ali= userRepository.save(new User("8", "ali", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User abdou= userRepository.save(new User("9", "abdou", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User wahida= userRepository.save(new User("10", "wahida", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User bilel1= userRepository.save(new User("11", "bilel", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User hamza1= userRepository.save(new User("12", "hamza", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User amir1 = userRepository.save(new User("13", "amir", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User mohsen1= userRepository.save(new User("14", "mohsen", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User med1  = userRepository.save(new User("15", "med", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User afif1 = userRepository.save(new User("16", "afif", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User tijani1= userRepository.save(new User("17", "tijani", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User marwen1= userRepository.save(new User("18", "marwan", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User basma1= userRepository.save(new User("19", "basma", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User wahid1= userRepository.save(new User("20", "wahid", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User fatma1= userRepository.save(new User("21", "fatma", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User tesnim1= userRepository.save(new User("22", "tesnim", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User adel1= userRepository.save(new User("23", "adel", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User ali1= userRepository.save(new User("24", "ali", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User abdou1= userRepository.save(new User("25", "abdou", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		User wahida1= userRepository.save(new User("125", "wahida", "meddeb", "b@mail.com",(long)23206993, "123456789", new Date()));
		
		
		/*
		SondageRepository sondageRepository = ctx.getBean(SondageRepository.class);
		Sondage snd1 = sondageRepository.save(new Sondage("foot", "foot", new Date(), bilel));
		Sondage snd2 = sondageRepository.save(new Sondage("hnd", "foot", new Date(), hamza));
		
		Collection<Sondage> Sondage_I_Respond = new ArrayList<Sondage>();
		Sondage_I_Respond.add(snd1);
		
		hamza.setLes_snd_jawibt_alihom(Sondage_I_Respond);
		bilel.setLes_snd_jawibt_alihom(Sondage_I_Respond);
		amir.setLes_snd_jawibt_alihom(Sondage_I_Respond);
		med.setLes_snd_jawibt_alihom(Sondage_I_Respond);

		Collection<Sondage> Sondage_I_Respond2 = new ArrayList<Sondage>();
		Sondage_I_Respond2.add(snd2);

		wahid.setLes_snd_jawibt_alihom(Sondage_I_Respond2);
		basma.setLes_snd_jawibt_alihom(Sondage_I_Respond2);
		afif.setLes_snd_jawibt_alihom(Sondage_I_Respond2);
		mohsen.setLes_snd_jawibt_alihom(Sondage_I_Respond2);
	
		userRepository.save(mohsen);
		userRepository.save(wahid);
		userRepository.save(basma);
		userRepository.save(afif);

		Collection<User> users1 = new ArrayList<User>();
		users1.add(bilel);
		users1.add(hamza);
		users1.add(amir);
		users1.add(med);
		snd1.setUsers_jawbou_3aliya(users1);
		sondageRepository.save(snd1);
		
		Collection<User> users2 = new ArrayList<User>();
		users2.add(mohsen);
		users2.add(wahid);
		users2.add(afif);
		users2.add(basma);
		snd2.setUsers_jawbou_3aliya(users2);
		sondageRepository.save(snd2);
		
		Page<User> use = userRepository.chercheUserRepondaunsondage("hnd", new PageRequest(0, 3));
		use.forEach(e -> System.out.println(e.getNom()));
		*/
		
		Page<User> findd=userRepository.findByNom("bilel", new PageRequest(0, 1));
		findd.forEach(e -> System.out.println(e.getNom()));
	}
}

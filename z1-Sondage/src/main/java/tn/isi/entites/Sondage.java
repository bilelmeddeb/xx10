package tn.isi.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sondage implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String titre;
	private String Description;
	private Date dateCreation;
	private boolean accepted ;
	
	@ManyToOne
	@JoinColumn(name="CIN_OWNER")
	private User owner;
	
	@OneToMany(mappedBy="sondage")
	private Collection<Question> questions;
	
	@ManyToMany(mappedBy="les_snd_jawibt_alihom")
	private Collection<User> users_jawbou_3aliya;
	
	@ManyToOne
	@JoinColumn(name="id_S_TH")
	private Sous_theme	sous_theme;

	@ManyToOne
	private Categorie categorie ; 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Collection<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Collection<Question> questions) {
		this.questions = questions;
	}

	public Collection<User> getUsers_jawbou_3aliya() {
		return users_jawbou_3aliya;
	}

	public void setUsers_jawbou_3aliya(Collection<User> users_jawbou_3aliya) {
		this.users_jawbou_3aliya = users_jawbou_3aliya;
	}

	public Sous_theme getSous_theme() {
		return sous_theme;
	}

	public void setSous_theme(Sous_theme sous_theme) {
		this.sous_theme = sous_theme;
	}

	public Sondage(String titre, String description, Date dateCreation, boolean accepted, User owner,
			Collection<Question> questions, Collection<User> users_jawbou_3aliya, Sous_theme sous_theme) {
		super();
		this.titre = titre;
		Description = description;
		this.dateCreation = dateCreation;
		this.accepted = accepted;
		this.owner = owner;
		this.questions = questions;
		this.users_jawbou_3aliya = users_jawbou_3aliya;
		this.sous_theme = sous_theme;
	}

	public Sondage(String titre, String description, Date dateCreation, User owner, Collection<Question> questions,
			Collection<User> users_jawbou_3aliya, Sous_theme sous_theme) {
		super();
		this.titre = titre;
		Description = description;
		this.dateCreation = dateCreation;
		this.owner = owner;
		this.questions = questions;
		this.users_jawbou_3aliya = users_jawbou_3aliya;
		this.sous_theme = sous_theme;
	}

	public Sondage(String titre, String description, Date dateCreation, User owner) {
		super();
		this.titre = titre;
		Description = description;
		this.dateCreation = dateCreation;
		this.owner = owner;
	}

	public Sondage(String titre, String description, Date dateCreation, Collection<User> users_jawbou_3aliya) {
		super();
		this.titre = titre;
		Description = description;
		this.dateCreation = dateCreation;
		this.users_jawbou_3aliya = users_jawbou_3aliya;
	}

	public Sondage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sondage(String titre, String description, Date dateCreation) {
		super();
		this.titre = titre;
		Description = description;
		this.dateCreation = dateCreation;
	}

	public Sondage(String titre, String description, Date dateCreation, User owner,
			Collection<User> users_jawbou_3aliya) {
		super();
		this.titre = titre;
		Description = description;
		this.dateCreation = dateCreation;
		this.owner = owner;
		this.users_jawbou_3aliya = users_jawbou_3aliya;
	}
	 
	


	
	
}

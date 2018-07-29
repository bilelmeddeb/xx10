package tn.isi.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String titre_question;
	@OneToMany(mappedBy="qst")
	private Collection<Optiona> options ; 

	@ManyToOne
	@JoinColumn(name="ID_SND")
	private Sondage sondage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre_question() {
		return titre_question;
	}

	public void setTitre_question(String titre_question) {
		this.titre_question = titre_question;
	}



	public Sondage getSondage() {
		return sondage;
	}

	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}

	public Question(String titre_question) {
		super();
		this.titre_question = titre_question;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collection<Optiona> getOptions() {
		return options;
	}

	public void setOptions(Collection<Optiona> options) {
		this.options = options;
	}

	public Question(String titre_question, Collection<Optiona> options, Sondage sondage) {
		super();
		this.titre_question = titre_question;
		this.options = options;
		this.sondage = sondage;
	}

	public Question(String titre_question, Collection<Optiona> options) {
		super();
		this.titre_question = titre_question;
		this.options = options;
	}
	
	
}

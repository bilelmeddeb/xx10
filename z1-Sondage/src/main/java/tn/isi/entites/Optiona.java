package tn.isi.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Optiona implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String reponce;

	public Optiona(String reponce) {
		super();
		this.reponce = reponce;
	}

	@OneToOne(mappedBy="optiona")
	private Question question;
	
	@ManyToOne
	private Question qst;

	public Optiona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReponce() {
		return reponce;
	}

	public void setReponce(String reponce) {
		this.reponce = reponce;
	}

	public Question getQst() {
		return qst;
	}

	public void setQst(Question qst) {
		this.qst = qst;
	}


	public Question getQuestion() {
		return question;
	}

	public Optiona(String reponce, Question question, Question qst) {
		super();
		this.reponce = reponce;
		this.question = question;
		this.qst = qst;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Optiona(String reponce, Question qst) {
		super();
		this.reponce = reponce;
		this.qst = qst;
	}

}

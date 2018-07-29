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
public class Sous_theme implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String titre;
	
	@ManyToOne
	@JoinColumn(name="ID_THEME")
	private Theme theme;
	
	@OneToMany(mappedBy="sous_theme")
	private Collection<Sondage> sondages;

	public Sous_theme() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sous_theme(String titre) {
		super();
		this.titre = titre;
	}

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

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public Collection<Sondage> getSondages() {
		return sondages;
	}

	public void setSondages(Collection<Sondage> sondages) {
		this.sondages = sondages;
	}

	public Sous_theme(String titre, Theme theme, Collection<Sondage> sondages) {
		super();
		this.titre = titre;
		this.theme = theme;
		this.sondages = sondages;
	}	

	
}

package tn.isi.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Theme implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	private String titre;
	
	@OneToMany(mappedBy="theme")
	private Collection<Sous_theme> sous_themes;

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

	public Collection<Sous_theme> getSous_themes() {
		return sous_themes;
	}

	public void setSous_themes(Collection<Sous_theme> sous_themes) {
		this.sous_themes = sous_themes;
	}

	public Theme(String titre) {
		super();
		this.titre = titre;
	}

	public Theme() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Theme(String titre, Collection<Sous_theme> sous_themes) {
		super();
		this.titre = titre;
		this.sous_themes = sous_themes;
	}

	
}

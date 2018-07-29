package tn.isi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.isi.entites.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Long>{
	
		
	  public List<Theme> findByTitre(String titre );

	

}

package tn.isi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.isi.entites.Sous_theme;

public interface Sous_themeRepository extends JpaRepository<Sous_theme, Long> {

	
	public List<Sous_theme> findByTitre(String Sous_theme);

 	
	@Query("select st from Sous_theme st  , Theme th where th.titre = :titre  and st.theme=th.id")
	public List<Sous_theme> chercheSousthemeByTheme(@Param("titre") String titre);

}

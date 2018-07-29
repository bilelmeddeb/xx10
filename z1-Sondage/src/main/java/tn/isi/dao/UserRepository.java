package tn.isi.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import tn.isi.entites.User;

public interface UserRepository extends JpaRepository<User, String> {

	//public List<User> findByNom(String nom);
	
	@Query("select u from User u where u.nom like :x")
	public Page<User> findByNom(@Param("x") String nom, Pageable pageable);
	
	@Query("select u from User u where u.nom like :x")
	public List<User> chercherUserByNom(@Param("x") String nom);
	
	
	@Query("select u from  User u where u.birth_date > :x and u.birth_date <:y")
	public List<User> chercherUserDateCreation(@Param("x") Date d1, @Param("y") Date d2);

	@Query("select u from  User u  join u.les_snd_jawibt_alihom sndg where sndg.titre =:titre ")
	public Page<User>chercheUserRepondaunsondage(@Param("titre") String titre,Pageable pageable);
	
	@Query("select u from  User u  join u.les_snd_jawibt_alihom sndg where sndg.titre =:titre ")
	public List<User> chercheUserRepondaunsondage(@Param("titre") String titre);
}
 
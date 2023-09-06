package com.movie.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.movie.dto.Movie;

@Repository
public class MovieRepo {
	@Autowired
	Movie m;
	
  EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
  EntityManager em=emf.createEntityManager();
  EntityTransaction et=em.getTransaction();
  String s="Movie details Stored succesfully";
  public String persit(int id,String name,int cost) {
	  m.setId(id);
	  m.setName(name);
	  m.setCost(cost);
	  et.begin();
	  em.persist(m);
	  et.commit();
	  return s;
  }
  public String  update(Movie m) {
	  m.setId(m.getId());
	  m.setName(m.getName());
	  m.setCost(m.getCost());
	  et.begin();
	  em.merge(m);
	  et.commit();
	  return "updated Succesfully";
	  
  }
  public String  delete(int id) {
	 
	  et.begin();
	  Movie find = em.find(Movie.class, id);
	  em.remove(find);
	  et.commit();
	  return "Deleted Succesfully";
	  
  }
  public List<Movie> getDetails(){
	  Query query=em.createQuery("select s from Movie s");
		List<Movie> list=query.getResultList();
		return list;  
		
		}
  
}

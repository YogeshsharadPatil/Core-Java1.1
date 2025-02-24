package com.ysp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ysp.Entity.Address;
import com.ysp.Entity.User;

public class UserAddressdao {
	public void adduser(User user) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("useraddresMapping");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
		} finally {
			em.close();
			emf.close();
		}
	}

	public void addAddress(Address address) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("useraddresMapping");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(address);
			em.persist(address);
			em.getTransaction().commit();
		} finally {
			emf.close();
			em.close();
		}
	}

	public void updateUser(User user) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("useraddresMapping");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.merge(user);
			em.getTransaction().commit();

		} finally {
			emf.close();
			em.close();
		}
	}

	public void updateAddress(Address address) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("useraddresMapping");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			em.merge(address);
			em.getTransaction().commit();
		} finally {
			emf.close();
			em.close();
		}
	}

	public User fetchuserbyId(int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("useraddresMapping");
			em = emf.createEntityManager();
			User user = em.find(User.class, id);
			return user;
		} finally {
			em.close();
			emf.close();
		}
	}

	public Address fetchAddressbyId(int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("useraddresMapping");
			em = emf.createEntityManager();
			Address address = em.find(Address.class, id);
			return address;
		} finally {
			emf.close();
			em.close();
		}

	}

	public List<User> fetchUserByemail(String email) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("useraddresMapping");
			em = emf.createEntityManager();
				Query q =em.createQuery("select c from User u where u.email=?1");
			q.setParameter(1, q); //return type of q.setparamter is
			List<User> users =q.getResultList();
			return users;
		}finally {
			emf.close();
			em.close();
		}
	}
	
	public List<User> fetchUserByDomain(String domainName){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("useraddresMapping");
			em = emf.createEntityManager();
				Query q =em.createQuery("select u from User u where u.email like ?1");
			q.setParameter(1, "%" + domainName + "%" ); //return type of q.setparamter is
		    List<User> users =q.getResultList();
		    return users;
		}finally {
			emf.close();
			em.close();
		}
	}
	
	public List<User> fetchUsersByCity(String city){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("useraddresMapping");
			em = emf.createEntityManager();
				Query q =em.createQuery("select u from User u join u.address a.city=?1"); //in hibernate in join use Address class objecti.e. address
			q.setParameter(1,  city); //return type of q.setparamter is
		    List<User> users =q.getResultList();
		    return users;
		}finally {
			emf.close();
			em.close();
		}
	}
	
	public List<Object[]> fetchUsersByCityNM(String city){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("useraddresMapping");
			em = emf.createEntityManager();
				Query q =em.createQuery("select u from User u join u.address a.city=?1"); //in hibernate in join use Address class objecti.e. address
			q.setParameter(1,  city); //return type of q.setparamter is
		    List<Object[]> users =q.getResultList();
		    return (List<Object[]>) users;
		}finally {
			emf.close();
			em.close();
		}
	}
	
	
}

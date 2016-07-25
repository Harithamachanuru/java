package com.capgemini.CarDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.Car;
import com.capgemini.service.CarServiceImpl;

public class CarDao {



	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
	EntityManager em = emf.createEntityManager();

	public boolean Add(Car temp)
	{
		if (temp != null)
		{


			em.getTransaction().begin();
			em.persist(temp);
			em.getTransaction().commit();
			return true;
		}
		else {
			return false;
		}

	}

	public Boolean Modify(Car temp)
	{


		if (temp != null)
		{


			em.getTransaction().begin();
			em.persist(temp);
			em.getTransaction().commit();
			return true;
		}
		else {
			return false;
		}


	}



	public  Car search(int id)
	{
		return em.find(Car.class, id);

	}



	public boolean Delete(int id)
	{

		Car emp = search(id);
		if(emp !=null){
			em.remove(emp);
			return true;
		}
		else
		{
			return false;
		}



	}
}

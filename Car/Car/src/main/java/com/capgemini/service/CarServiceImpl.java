package com.capgemini.service;

import java.util.Map;

import com.capgemini.Car;
import com.capgemini.CarDAO.CarDao;



public class CarServiceImpl {
	CarDao repo=new CarDao();
	public boolean AddCar(Map CarTemp)
	{
			Car car=new Car();
			car.setCarModel((String) CarTemp.get("Model"));
			car.setCarName((String) CarTemp.get("Name"));
			car.setYear((String) CarTemp.get("year"));
			
			return repo.Add(car);

	}

	public boolean DeleteCar(int Id)
	{
		if (repo.Delete(Id))
		{
			return true;
		}
		else
		{ 
			return false;
		}

	}


	public boolean Modify(Map CarTemp)
	{
		Car car=repo.search((Integer) CarTemp.get("Id"));
	
		
			Car car1=new Car();
			car1.setCarModel((String) CarTemp.get("Model"));
			car1.setCarName((String) CarTemp.get("Name"));
			car1.setYear((String) CarTemp.get("year"));

			
			return repo.Modify(car1);
	
	}
}
	
	/*public Car[] ViewCar()
	{


	}*/


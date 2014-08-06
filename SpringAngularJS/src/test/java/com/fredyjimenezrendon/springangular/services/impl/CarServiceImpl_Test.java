package com.fredyjimenezrendon.springangular.services.impl;

import junit.framework.Assert;

import org.junit.Test;

public class CarServiceImpl_Test
{
	
	@Test
	public void savePragmaParkingCars()
	{
		//Arrange
		String gregorisCar = "volvo";
		String adrianasCar = "renault";
		String marcosCar = "murano";
		
		//Act
		CarServiceImpl carServiceImpl = new CarServiceImpl();
		carServiceImpl.addCar(gregorisCar);
		carServiceImpl.addCar(adrianasCar);
		carServiceImpl.addCar(marcosCar);
		
		//Assert
		Assert.assertEquals(3, carServiceImpl.getAllCars().size());
		Assert.assertTrue(true);
	}
	

}

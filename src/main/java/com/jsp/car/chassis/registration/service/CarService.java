package com.jsp.car.chassis.registration.service;

import com.jsp.car.chassis.registration.dao.CarDao;
import com.jsp.car.chassis.registration.dto.Car;
import com.jsp.car.chassis.registration.dto.Chassis;
import com.jsp.car.chassis.registration.dto.Registration;

public class CarService {
	CarDao carDao = new CarDao();

	public Car insertCar(Car car, Chassis chassis, Registration registration) {
		return carDao.insertCar(car, chassis, registration);
	}

	public Car deleteCar(Car car, Chassis chassis, Registration registration) {
		return carDao.deleteCar(car, chassis, registration);
	}

	public Car updateCar(Car car, Chassis chassis, Registration registration) {
		return carDao.updateCar(car, chassis, registration);
	}

	public void getAllDetials() {
		carDao.getAllDetails();
	}

}

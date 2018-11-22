package telran.cars.controller;


import static telran.cars.dto.RentCompanyConstants.ADD_CAR;
import static telran.cars.dto.RentCompanyConstants.ADD_DRIVER;
import static telran.cars.dto.RentCompanyConstants.ADD_MODEL;
import static telran.cars.dto.RentCompanyConstants.GET_DRIVER;
import static telran.cars.dto.RentCompanyConstants.GET_MODEL;
import static telran.cars.dto.RentCompanyConstants.REMOVE_CAR;
import static telran.cars.dto.RentCompanyConstants.RENT_CAR;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.cars.dto.Car;
import telran.cars.dto.CarsReturnCode;
import telran.cars.dto.DatesForRent;
import telran.cars.dto.Driver;
import telran.cars.dto.Model;
import telran.cars.model.IRentCompany;

@RestController
public class CarsController {
	@Autowired
	IRentCompany rentCompany;

	@PostMapping(value = ADD_MODEL)
	public CarsReturnCode addModel(@RequestBody Model model) {
		return rentCompany.addModel(model);		
	}
	
	@PostMapping(value = ADD_CAR)
	public CarsReturnCode addCar(@RequestBody Car car) {
		return rentCompany.addCar(car);		
	}

	@PostMapping(value = ADD_DRIVER)
	public CarsReturnCode addDriver(@RequestBody Driver driver) {
		return rentCompany.addDriver(driver);		
	}
	
	@GetMapping(value = GET_MODEL + "/{modelName}")
	public Model getModel(@PathVariable("modelName") String modelName) {
		return rentCompany.getModel(modelName);		
	}
	
	@GetMapping(value = GET_MODEL + "/{carNumber}")
	public Car getCar(@PathVariable("carNumber") String carNumber) {
		return rentCompany.getCar(carNumber);		
	}

	@GetMapping(value = GET_DRIVER + "/{carNumber}")
	public Driver getDriver(@PathVariable("carNumber") long licenseId) {
		return rentCompany.getDriver(licenseId);		
	}
	
	@PostMapping(value = RENT_CAR)
	public CarsReturnCode rentCar(@RequestBody DatesForRent datesForRent) {
		return rentCompany.addDriver(datesForRent.);	
		String carNumber, long licenseId, LocalDate rentDate, int rentDays
	}
	
	
	
	@DeleteMapping(value = REMOVE_CAR + "/{carNumber}")
	public CarsReturnCode removeCar(@PathVariable("carNumber") String carNumber) {
		return rentCompany.removeCar(carNumber);		
	}
}

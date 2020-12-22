package by.epam.task01.service;


import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.criteria.Criteria;

public interface ApplianceService {
	
	Appliance find(Criteria criteria);
	
}

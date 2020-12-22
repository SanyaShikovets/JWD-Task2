package by.epam.task01.dao.impl;

import by.epam.task01.dao.ApplianceDAO;
import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.criteria.Criteria;

import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) {

		ApplianceReader applianceReader = new ApplianceReader();
		List<String> applianceData = applianceReader.takeAll();

		ApplianceFilter applianceFilter = new ApplianceFilter(applianceData);
		List<String> filterApplianceData = applianceFilter.filter(criteria);

		System.out.println(filterApplianceData);

		ApplianceBuilder applianceBuilder = new ApplianceBuilder();
		List<Appliance> appliances = applianceBuilder.build(filterApplianceData);

		return appliances;
	}
	
	// you may add your own code here

	StringBuilder stringBuilder = new StringBuilder();
}


//you may add your own new classes
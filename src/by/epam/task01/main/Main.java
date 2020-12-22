package by.epam.task01.main;

import by.epam.task01.dao.ApplianceDAO;
import by.epam.task01.dao.impl.ApplianceDAOImpl;
import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.Oven;
import by.epam.task01.entity.TabletPC;
import by.epam.task01.entity.criteria.Criteria;
import by.epam.task01.entity.criteria.SearchCriteria;
import by.epam.task01.service.ApplianceService;
//import by.epam.task01.service.ServiceFactory;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Criteria criteria = new Criteria("1");
		ApplianceDAOImpl applianceDAO = new ApplianceDAOImpl();
		List<Appliance> appliances = applianceDAO.find(criteria);
		System.out.println(appliances);
//		Appliance appliance;
//
//		ServiceFactory factory = ServiceFactory.getInstance();
//		ApplianceService service = factory.getApplianceService();
//
//		//////////////////////////////////////////////////////////////////
//
//		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
//		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 3);
//
//		appliance = service.find(criteriaOven);
//
//		PrintApplianceInfo.print(appliance);
//
//		//////////////////////////////////////////////////////////////////
//
//		criteriaOven = new Criteria(Oven.class.getSimpleName());
//		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
//		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);
//
//		appliance = service.find(criteriaOven);
//
//		PrintApplianceInfo.print(appliance);
//
//		//////////////////////////////////////////////////////////////////
//
//		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
//		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
//		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
//		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);
//
//		appliance = service.find(criteriaOven);// find(Object...obj)
//
//		PrintApplianceInfo.print(appliance);

	}

}

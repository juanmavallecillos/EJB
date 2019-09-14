package controller;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import model.AdderSingletonLazyBean;

/**
 * Session Bean implementation class AdderStatefulControllerBean
 */
@Singleton
@Startup
public class AdderSingletonLazyControllerBean {

	@EJB AdderSingletonLazyBean adder1;
	@EJB AdderSingletonLazyBean adder2;
    /**
     * Default constructor. 
     */
    public AdderSingletonLazyControllerBean() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
    private void init() {
    	System.out.println("AdderSingletonLazyControllerBean");
    	System.out.println(adder1.getValue());
    	adder1.add();
    	adder1.add();
    	System.out.println(adder1.getValue());
    	System.out.println(adder2.getValue());
    	adder2.add();
    	adder2.add();
    	System.out.println(adder2.getValue());
    	System.out.println(adder1.getValue());
    	adder1.add();
    	adder1.add();
    	System.out.println(adder1.getValue());
    }

}

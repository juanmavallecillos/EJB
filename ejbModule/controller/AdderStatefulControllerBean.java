package controller;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import model.AdderStatefulBean;

/**
 * Session Bean implementation class AdderStatefulControllerBean
 */
@Singleton
@Startup
public class AdderStatefulControllerBean {

	@EJB AdderStatefulBean adder1;
	@EJB AdderStatefulBean adder2;
    /**
     * Default constructor. 
     */
    public AdderStatefulControllerBean() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
    private void init() {
    	System.out.println("AdderStatefulControllerBean");
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

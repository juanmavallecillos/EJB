package controller;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import model.AdderStatelessBean;

/**
 * Session Bean implementation class AdderStatelessControllerBean
 */
@Singleton
@Startup
public class AdderStatelessControllerBean {
	
	@EJB AdderStatelessBean adder1;
	@EJB AdderStatelessBean adder2;

    /**
     * Default constructor. 
     */
    public AdderStatelessControllerBean() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
    private void init() {
    	System.out.println("AdderStatelessControllerBean");
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

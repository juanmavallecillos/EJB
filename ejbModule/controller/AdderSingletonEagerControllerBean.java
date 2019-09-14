package controller;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import model.AdderSingletonEagerBean;

/**
 * Session Bean implementation class AdderSingletonEagerControllerBean
 */
@Singleton
@Startup
public class AdderSingletonEagerControllerBean {

	@EJB AdderSingletonEagerBean adder1;
	@EJB AdderSingletonEagerBean adder2;
	
    /**
     * Default constructor. 
     */
    public AdderSingletonEagerControllerBean() {
        // TODO Auto-generated constructor stub
    }
    
    @PostConstruct
    private void init() {
    	System.out.println("AdderSingletonEagerControllerBean");
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

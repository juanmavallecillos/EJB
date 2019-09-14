package model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class AdderStatefulBean
 */
@Stateful
public class AdderStatefulBean {
	private int value;

    /**
     * Default constructor. 
     */
    public AdderStatefulBean() {
        // TODO Auto-generated constructor stub
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	/*
	 * Method that increments in one unit the value property.
	 * @return the new value of the value property.
	 */
	public int add() {
		value++;
		return value;
	}
	
	/*
	 * Method that sets to 0 the value property
	 * @return the new value of the value property
	 */
	public int reset() {
		value = 0;
		return value;
	}
	
	@PostConstruct
	private void init() {
		System.out.println(System.currentTimeMillis() + " - Creat el Bean: " + this);
	}

	@PreDestroy
	private void destroy() {
		System.out.println(System.currentTimeMillis() + " - Destruïnt el Bean: " + this);
	}
}

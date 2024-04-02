package com.prowings.zeroxmlconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Lookup;

//@Component
@Repository
public class SingltonBean {
	
	   public void usePrototype() {
	        PrototypeBean dependency = createPrototypeDependency();
	        dependency.doSomething();
	    }

	    @Lookup
	    protected PrototypeBean createPrototypeDependency() {
	        // This method body will be replaced by Spring at runtime
	        return null;
	    }

}
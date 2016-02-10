package com.infosys.stack;

import org.apache.log4j.Logger;

public class StackApp {
	
	public static Logger logger=Logger.getLogger(StackApp.class);

	public static void main(String[] args) throws Exception {
		
		StackX<Long> stackx=new StackX<Long>(5);
		
		stackx.push(11L);
		stackx.push(12L);
		stackx.push(13L);
		stackx.push(14L);
		stackx.push(15L);

		while(!stackx.isEmpty()){
			logger.info(stackx.pop());
		}
		
		
		
	}

}

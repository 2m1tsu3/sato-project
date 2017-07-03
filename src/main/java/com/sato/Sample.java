package com.sato;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sato.config.AppConfig;

@SpringBootApplication
public class Sample {
	
	@Autowired
	SampleExecute sampleExecute;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		sampleExecute.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
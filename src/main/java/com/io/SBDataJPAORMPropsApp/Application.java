package com.io.SBDataJPAORMPropsApp;

import com.io.SBDataJPAORMPropsApp.entity.ResourceDtls;
import com.io.SBDataJPAORMPropsApp.repository.ResourceDtlsRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ResourceDtlsRepo repo = context.getBean(ResourceDtlsRepo.class);

		ResourceDtls rs= new ResourceDtls();
		//rs.setResourceId(103);
		rs.setResourceName("Ganesh_3");
		rs.setResourceSkill("Java");
		rs.setResourceExpr("6 yrs");

		ResourceDtls save = repo.save(rs);
		if(save!= null){
			System.out.println("Record saved");
		}
		else{
			System.out.println("Failed to save");
		}





	}

}

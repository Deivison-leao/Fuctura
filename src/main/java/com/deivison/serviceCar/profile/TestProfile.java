package com.deivison.serviceCar.profile;

import com.deivison.serviceCar.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestProfile {
    @Autowired
    private DbService dbService;



    @Bean
    public void instanciaDb(){
        this.dbService.instanciaDb();
    }


}

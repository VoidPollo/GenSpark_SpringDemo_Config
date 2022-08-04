package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public Student student(){
        return new Student("Marks Harold", 13579, phone(), address());
    }

    @Bean
    public Address address(){
        return  new Address("Venice", "AL", "US", "25367");
    }

    @Bean
    public List<Phone> phone() {
        List<Phone> ph = new ArrayList<>();
        ph.add(new Phone("888-296-5264"));
        ph.add(new Phone("888-784-4568"));
        return ph;
    }
}

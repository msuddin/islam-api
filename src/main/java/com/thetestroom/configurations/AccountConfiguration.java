package com.thetestroom.configurations;

import com.thetestroom.beans.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfiguration {

    @Bean
    public Account account() {
        return new Account();
    }

}

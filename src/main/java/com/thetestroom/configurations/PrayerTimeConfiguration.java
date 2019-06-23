package com.thetestroom.configurations;

import com.thetestroom.beans.PrayerTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrayerTimeConfiguration {

    @Bean
    public PrayerTime prayerTime() {
        return new PrayerTime();
    }
}

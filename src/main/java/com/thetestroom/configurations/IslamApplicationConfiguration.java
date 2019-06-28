package com.thetestroom.configurations;

import com.thetestroom.beans.AllahName;
import com.thetestroom.beans.Ayah;
import com.thetestroom.beans.DailyPrayerTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IslamApplicationConfiguration {

    @Bean
    public DailyPrayerTime dailyPrayerTime() {
        return new DailyPrayerTime();
    }

    @Bean
    public AllahName allahName() {
        return new AllahName();
    }

    @Bean
    public Ayah ayah() {
        return new Ayah();
    }
}

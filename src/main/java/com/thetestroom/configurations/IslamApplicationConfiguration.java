package com.thetestroom.configurations;

import com.thetestroom.beans.DailyPrayerTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IslamApplicationConfiguration {

    @Bean
    public DailyPrayerTime dailyPrayerTime() {
        return new DailyPrayerTime();
    }
}

package com.thetestroom.controllers;

import com.thetestroom.beans.DailyPrayerTime;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;

public class DailyPrayerTimeTest {

    @Test
    public void shouldBeAbleToSetName() throws IOException {
        // Given
        final String day = "01";
        final String month = "01";
        final String year = "2000";
        DailyPrayerTime dailyPrayerTime = new DailyPrayerTime();

        // When
        dailyPrayerTime.setDay(day);
        dailyPrayerTime.setMonth(month);
        dailyPrayerTime.setYear(year);

        // Then
        Assert.assertThat(dailyPrayerTime.getPrayerTimes(), containsString("01 Jan 2000"));
    }
}

package com.thetestroom.controllers;

import com.thetestroom.beans.PrayerTime;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

public class PrayerTimeTest {

    @Test
    public void shouldBeAbleToSetName() throws IOException {
        // Given
        final String day = "01";
        final String month = "01";
        final String year = "2000";
        PrayerTime prayerTime = new PrayerTime();

        // When
        prayerTime.setDay(day);
        prayerTime.setMonth(month);
        prayerTime.setYear(year);

        // Then
        Assert.assertThat(prayerTime.getPrayerTimes(), containsString("01 Jan 2000"));
    }
}

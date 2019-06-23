package com.thetestroom.beans;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class PrayerTimeTest {

    @Test
    public void shouldBeAbleToSetName() {
        // Given
        final String helloName = "Test Name";
        PrayerTime prayerTime = new PrayerTime();

        // When
        prayerTime.setName(helloName);

        // Then
        Assert.assertThat(prayerTime.getName(), is(helloName));
    }
}

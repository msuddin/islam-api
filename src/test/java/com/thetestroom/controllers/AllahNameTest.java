package com.thetestroom.controllers;

import com.thetestroom.beans.AllahName;
import com.thetestroom.beans.DailyPrayerTime;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;

public class AllahNameTest {

    @Test
    public void shouldBeAbleToSetName() throws IOException {
        // Given
        final String nameByNumber = "01";
        AllahName allahName = new AllahName();

        // When
        allahName.setAllNameByNumber(nameByNumber);

        // Then
        Assert.assertThat(allahName.getAllahName(), containsString("The Beneficent"));
    }
}

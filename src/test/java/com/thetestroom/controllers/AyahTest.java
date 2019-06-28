package com.thetestroom.controllers;

import com.thetestroom.beans.Ayah;
import com.thetestroom.beans.DailyPrayerTime;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;

public class AyahTest {

    @Test
    public void shouldBeAbleToSetAyahFromSurah() throws IOException {
        // Given
        final String surah = "1";
        final String ayah = "1";
        Ayah ayahObject = new Ayah();

        // When
        ayahObject.setSurah(surah);
        ayahObject.setAyah(ayah);

        // Then
        Assert.assertThat(
                ayahObject.getAyahFromSurah(),
                containsString("In the name of God, The Most Gracious, The Dispenser of Grace"));
    }
}

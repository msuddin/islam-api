package com.thetestroom.controllers;

import com.thetestroom.beans.Ayah;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;

public class AyahTest {

    @Test
    public void shouldBeAbleToSetAyahFromSurah() throws IOException {
        // Given
        final String ayah = "1";
        Ayah ayahObject = new Ayah();

        // When
        ayahObject.setAyah(ayah);

        // Then
        Assert.assertThat(
                ayahObject.getAyahFromSurah(),
                containsString("In the name of God, The Most Gracious, The Dispenser of Grace"));
    }
}

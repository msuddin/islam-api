package com.thetestroom.beans;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class HelloTest {

    @Test
    public void shouldBeAbleToSetName() {
        // Given
        final String helloName = "Test Name";
        Hello hello = new Hello();

        // When
        hello.setName(helloName);

        // Then
        Assert.assertThat(hello.getName(), is(helloName));
    }
}

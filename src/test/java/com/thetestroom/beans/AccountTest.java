package com.thetestroom.beans;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class AccountTest {

    @Test
    public void shouldBeAbleToSetAccountName() {
        // Given
        final String accountName = "Test Name";
        Account account = new Account();

        // When
        account.setName(accountName);

        // Then
        Assert.assertThat(account.getName(), is(accountName));
    }
}

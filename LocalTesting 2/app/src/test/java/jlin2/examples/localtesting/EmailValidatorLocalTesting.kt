package jlin2.examples.localtesting

import org.junit.Assert
import org.junit.Test

class EmailValidatorLocalTesting {
    companion object {
        val VALID_EMAIL_1 = "123@abc.com"
        val VALID_EMAIL_2 = "123@abc.co.ca"
        val INVALID_EMAIL_1 = "123@abc"
        val INVALID_EMAIL_2 = "123@abc..com"
        val INVALID_EMAIL_3 = "@abc.com"
        val INVALID_EMAIL_4 = "testing123"
        val EMPTY_EMAIL = ""
    }
    @Test
    fun testDefaultEmailFormat() {
        Assert.assertTrue(EmailValidator.isValidEmail(VALID_EMAIL_1))
    }
    @Test
    fun testSubDomainFormat() {
        Assert.assertTrue(EmailValidator.isValidEmail(VALID_EMAIL_2))
    }

    @Test
    fun testIncorrectDomain() {
        Assert.assertFalse(EmailValidator.isValidEmail(INVALID_EMAIL_1))
    }

    @Test
    fun testDoubleDots() {
        Assert.assertFalse(EmailValidator.isValidEmail(INVALID_EMAIL_2))
    }

    @Test
    fun testWithoutUsername() {
        Assert.assertFalse(EmailValidator.isValidEmail(INVALID_EMAIL_3))
    }

    @Test
    fun testWithoutDomain() {
        Assert.assertFalse(EmailValidator.isValidEmail(INVALID_EMAIL_4))
    }
}
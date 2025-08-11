package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainKtTest {
    @Test
    fun `adds two numbers`() {
        assertEquals(4, add(2, 2))
    }

    @Test
    fun `subtracts two numbers`() {
        assertEquals(2, subtract(4, 2))
    }

    @Test
    fun `multiplies two numbers`() {
        assertEquals(4, multiply(2, 2))
    }

    @Test
    fun `divides two numbers`() {
        assertEquals(2, divide(4, 2))
    }

    @Test
    fun `gets remainder of two numbers`() {
        assertEquals(1, remainder(5, 2))
    }
}
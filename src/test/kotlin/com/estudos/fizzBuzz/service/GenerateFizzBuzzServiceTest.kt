package com.estudos.fizzBuzz.service

import com.estudos.fizzBuzz.dto.FizzBuzzRequest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GenerateFizzBuzzServiceTest {
    private val generateFizzBuzzService = GenerateFizzBuzzService()

    @Test
    fun deveRetornarListaAteQuinze(){
        val fizzBuzzRequest = FizzBuzzRequest (15)
        val fizzBuzzResponse = generateFizzBuzzService.generate(fizzBuzzRequest)
        assertEquals("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]", fizzBuzzResponse.startGame.toString())
    }
}
package com.estudos.fizzBuzz.service

import com.estudos.fizzBuzz.dto.FizzBuzzRequest
import com.estudos.fizzBuzz.dto.FizzBuzzResponse
import org.springframework.stereotype.Service

@Service
class GenerateFizzBuzzService {
    fun generate(fizzBuzzRequest: FizzBuzzRequest) = (1..fizzBuzzRequest.numero)
        .map {
            when {
                it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
                it % 3 == 0 -> "Fizz"
                it % 5 == 0 -> "Buzz"
                else -> it.toString()
            }
        }
        .let { FizzBuzzResponse(it) }
}
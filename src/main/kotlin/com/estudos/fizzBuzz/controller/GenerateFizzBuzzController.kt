package com.estudos.fizzBuzz.controller

import com.estudos.fizzBuzz.dto.FizzBuzzRequest
import com.estudos.fizzBuzz.dto.FizzBuzzResponse
import com.estudos.fizzBuzz.log.logger
import com.estudos.fizzBuzz.service.GenerateFizzBuzzService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/fizzbuzz")
class GenerateFizzBuzzController(
    private val service: GenerateFizzBuzzService
) {
    @PostMapping("/numero")
    fun generate(@RequestBody fizzBuzzRequest: FizzBuzzRequest): Unit {
        logger.info("Requisicao do fizz buzz")
        return service.generate(fizzBuzzRequest)
    }
}
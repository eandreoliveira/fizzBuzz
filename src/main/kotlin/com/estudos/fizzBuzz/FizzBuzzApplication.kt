package com.estudos.fizzBuzz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FizzBuzzApplication

fun main(args: Array<String>) {
	runApplication<FizzBuzzApplication>(*args)
}

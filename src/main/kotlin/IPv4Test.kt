package org.example

fun main() {
    check(
        name ="should return true when valid IPv4 address" ,
        result = isValidIPv4("192.168.1.1") ,
        correctAnswer = true)


    check(
        name = "should return false when IP with consecutive dots",
        result = isValidIPv4("192..168.1.1"),
        correctAnswer = false)

    check(
        name = "should return false when IPv4 with missing segments",
        result = isValidIPv4("192.168.1"),
        correctAnswer = false)


    check(
        name = "should return false when IPv4 with extra segments",
        result = isValidIPv4("192.168.1.1.2"),
        correctAnswer = false)

    check(
        name = "should return false when IPv4 with letters",
        result = isValidIPv4("192.168.a.1"),
        correctAnswer = false)

    check(
        name = "should return false when IPv4 with out-of-range numbers",
        result = isValidIPv4("256.100.100.100"),
        correctAnswer = false,)

    check(
        name = "should return false when IPv4 with comma",
        result = isValidIPv4("243,100,100,100"),
        correctAnswer = false)

    check(
        name = "should return false when IPv4 with leading zeros",
        result = isValidIPv4("01.2.3.4"),
        correctAnswer = false)

    check(
        name = "should return false when IPv4 with extra spaces",
        result = isValidIPv4(" 192.168.1.1"),
        correctAnswer = false)

    check(
        name = "should return false, when IPv4 with special characters",
        result = isValidIPv4("192.168.1.1#"),
        correctAnswer = false)
}

fun check(name: String, result:Boolean, correctAnswer:Boolean) {
    if (result == correctAnswer) {
        println("Test: $name  Passed")
    } else {
        println("Test: $name  Failed")
    }
}
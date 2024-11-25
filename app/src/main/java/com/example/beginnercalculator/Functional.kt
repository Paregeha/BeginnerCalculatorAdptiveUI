package com.example.beginnercalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

fun Functional(
    numberScreen: String,
    numberScreen2: String,
    newNumber: String,
    action: String,
    actionResult: String
): String {
    var updateNumber by mutableStateOf("")

    if (action == "") {
        if (numberScreen == "0" && actionResult == "") {
            updateNumber = newNumber
        } else{
            updateNumber = numberScreen + newNumber
        }
    } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == "") {
        if (numberScreen2 == "0"){
            updateNumber = newNumber
        }else{
            updateNumber = numberScreen2 + newNumber
        }
    }else if(actionResult == "=") {
        when (action){
            "+" -> updateNumber = (numberScreen.toInt() + numberScreen2.toInt()).toString()
            "-" -> updateNumber = (numberScreen.toInt() - numberScreen2.toInt()).toString()
            "*" -> updateNumber = (numberScreen.toInt() * numberScreen2.toInt()).toString()
            "/" -> updateNumber = (numberScreen.toInt() / numberScreen2.toInt()).toString()
        }
    }

    return updateNumber
}
package com.example.beginnercalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.beginnercalculator.ui.theme.BeginnerCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BeginnerCalculatorTheme {
                MainScreen()
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainScreen() {
    var numberScreen by remember { mutableStateOf("0") }
    var numberScreen2 by remember { mutableStateOf("0") }
    var numberResult by remember { mutableStateOf("0") }

    var newNumber by remember { mutableStateOf("0") }

    var action by remember { mutableStateOf("") }
    var actionResult by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.systemBarsPadding()
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(bottom = 5.dp)
                .fillMaxSize()
        ) {
            Button(
                onClick = {
                    numberScreen = "0"
                    numberScreen2 = "0"
                    numberResult = "0"
                    actionResult = ""
                    action = ""
                },
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(10.dp)
            ) {
                Text(
                    text = "Clear",
                    fontSize = 20.sp
                )
            }
            Box(
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.3f)
            ) {
                Text(
                    text = if (action == "" && actionResult == "") {
                        numberScreen
                    } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == "") {
                        if (numberScreen2 == "0"){
                            numberScreen
                        }else{
                            numberScreen2
                        }
                    }else {
                        numberResult
                    },
                    fontSize = 50.sp,
                    modifier = Modifier
                        .padding(20.dp)
                        .align(Alignment.BottomEnd)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {
                        newNumber = "7"
                        if (action == "" && actionResult == "") {
                             numberScreen = Functional(
                                 numberScreen,
                                 numberScreen2,
                                 newNumber,
                                 action,
                                 actionResult
                             )
                        } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == ""){
                            numberScreen2 = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "7")
                }
                Button(
                    onClick = {
                        newNumber = "8"
                        if (action == "" && actionResult == "") {
                            numberScreen = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == ""){
                            numberScreen2 = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "8")
                }
                Button(
                    onClick = {
                        newNumber = "9"
                        if (action == "" && actionResult == "") {
                            numberScreen = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == ""){
                            numberScreen2 = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "9")
                }
                Button(
                    onClick = {
                        action = "*"
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "*")
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {
                        newNumber = "4"
                        if (action == "" && actionResult == "") {
                            numberScreen = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == ""){
                            numberScreen2 = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "4")
                }
                Button(
                    onClick = {
                        newNumber = "5"
                        if (action == "" && actionResult == "") {
                            numberScreen = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == ""){
                            numberScreen2 = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "5")
                }
                Button(
                    onClick = {
                        newNumber = "6"
                        if (action == "" && actionResult == "") {
                            numberScreen = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == ""){
                            numberScreen2 = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "6")
                }
                Button(
                    onClick = {
                        action = "/"
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "/")
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {
                        newNumber = "1"
                        if (action == "" && actionResult == "") {
                            numberScreen = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == ""){
                            numberScreen2 = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "1")
                }
                Button(
                    onClick = {
                        newNumber = "2"
                        if (action == "" && actionResult == "") {
                            numberScreen = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == ""){
                            numberScreen2 = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "2")
                }
                Button(
                    onClick = {
                        newNumber = "3"
                        if (action == "" && actionResult == "") {
                            numberScreen = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == ""){
                            numberScreen2 = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "3")
                }
                Button(
                    onClick = {
                        action = "+"
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "+")
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = {
                        newNumber = "00"
                        if (action == "" && actionResult == "") {
                            numberScreen = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == ""){
                            numberScreen2 = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "00")
                }
                Button(
                    onClick = {
                        newNumber = "0"
                        if (action == "" && actionResult == "") {
                            numberScreen = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        } else if ((action == "*" || action == "/" || action == "+" || action == "-") && actionResult == ""){
                            numberScreen2 = Functional(
                                numberScreen,
                                numberScreen2,
                                newNumber,
                                action,
                                actionResult
                            )
                        }
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "0")
                }
                Button(
                    onClick = {
                        actionResult = "="
                        numberResult = Functional(
                            numberScreen,
                            numberScreen2,
                            newNumber,
                            action,
                            actionResult
                        )
                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "=")
                }
                Button(
                    onClick = {
                        action = "-"

                    },
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                        .weight(1f)
                        .aspectRatio(1f),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "-")
                }
            }

        }
    }
}
package com.muradnajafli.composecalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muradnajafli.composecalculator.ui.theme.AcBackgroundColor
import com.muradnajafli.composecalculator.ui.theme.AcColor
import com.muradnajafli.composecalculator.ui.theme.DelBackgroundColor
import com.muradnajafli.composecalculator.ui.theme.EqualBackgroundColor
import com.muradnajafli.composecalculator.ui.theme.EqualColor
import com.muradnajafli.composecalculator.ui.theme.NumberBackground
import com.muradnajafli.composecalculator.ui.theme.OperationBackground
import com.muradnajafli.composecalculator.ui.theme.White


@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = state.number1 + state.operation + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = White,
                maxLines = 2
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                CalculatorButton(
                    symbol = "Ac",
                    modifier = Modifier
                        .background(AcBackgroundColor)
                        .aspectRatio(2f)
                        .weight(1.8f),
                    onClick = {
                        onAction(CalculatorAction.Clear)
                    },
                    textColor = AcColor
                )
                DeleteButton(
                    modifier = Modifier
                        .background(DelBackgroundColor)
                        .aspectRatio(0.9f)
                        .weight(0.8f),

                    onClick = {
                        onAction(CalculatorAction.Delete)
                    }
                )
                CalculatorButton(
                    symbol = "*",
                    modifier = Modifier
                        .background(OperationBackground)
                        .aspectRatio(0.9f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.CalculatorOperation.Multiply)
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(OperationBackground)
                        .aspectRatio(1f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.CalculatorOperation.Subtract)
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(OperationBackground)
                        .aspectRatio(1f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.CalculatorOperation.Divide)
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(OperationBackground)
                        .aspectRatio(0.7f)
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.CalculatorOperation.Add)
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1.9f)
                        .weight(1.8f), // Adjusted weight
                    onClick = {
                        onAction(CalculatorAction.Number(0))
                    }
                )
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(0.7f) // Adjusted aspect ratio
                        .weight(0.8f), // Adjusted weight
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(EqualBackgroundColor)
                        .aspectRatio(0.7f) // Adjusted aspect ratio
                        .weight(0.8f),
                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    },
                    textColor = EqualColor
                )
            }
        }
    }
}
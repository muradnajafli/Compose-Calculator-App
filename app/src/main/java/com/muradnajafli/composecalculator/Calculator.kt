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
import androidx.compose.ui.unit.Dp
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
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + "\n" + state.operation + "\n" + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = White,
                maxLines = 3
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(AcBackgroundColor)
                        .aspectRatio(2f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorAction.Clear)
                    },
                    textColor = AcColor
                )
                DeleteButton(
                    modifier = Modifier
                        .background(DelBackgroundColor)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Delete)
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(OperationBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.CalculatorOperation.Divide)
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }
                )
                CalculatorButton(
                    symbol = "*",
                    modifier = Modifier
                        .background(OperationBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.CalculatorOperation.Multiply)
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(OperationBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.CalculatorOperation.Subtract)
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(OperationBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.CalculatorOperation.Add)
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(2f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(NumberBackground)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(EqualBackgroundColor)
                        .aspectRatio(1f) // uzun teref balacanin 2 qati olmasi ucun
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    },
                    textColor = EqualColor
                )
            }
        }
    }
}
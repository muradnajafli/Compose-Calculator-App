package com.muradnajafli.composecalculator

sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    data object Clear: CalculatorAction()
    data object Delete: CalculatorAction()
    data object Decimal: CalculatorAction()
    data object Calculate: CalculatorAction()
    sealed class CalculatorOperation(val symbol: String): CalculatorAction() {
        data object Add : CalculatorOperation("+")
        data object Subtract : CalculatorOperation("-")
        data object Divide : CalculatorOperation("/")
        data object Multiply : CalculatorOperation("*")
    }
}
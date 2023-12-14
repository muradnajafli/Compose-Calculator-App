package com.muradnajafli.composecalculator

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muradnajafli.composecalculator.ui.theme.SymbolColor

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit,
    textColor: Color = SymbolColor,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(33))
            .clickable { onClick() }
            .then(modifier)
    ) {
        Text(
            text = symbol,
            fontSize = 32.sp,
            color = textColor,
            modifier = Modifier.padding(horizontal = 4.dp, vertical = 6.dp),
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily(Font(R.font.poppins_medium)),
        )
    }
}

@Composable
fun DeleteButton(
    modifier: Modifier,
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(33))
            .clickable { onClick() }
            .then(modifier)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_delete),
            contentDescription = "Delete",
            modifier = Modifier
                .size(48.dp, 48.dp)
                .padding(horizontal = 4.dp, vertical = 6.dp)
        )
    }
}
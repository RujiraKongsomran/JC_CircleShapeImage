package com.rujirakongsomran.jc_circleshapeimage

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rujirakongsomran.jc_circleshapeimage.ui.theme.JC_CircleShapeImageTheme

@Composable
fun MainScreen() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Circular Image",
        modifier = Modifier
            .size(300.dp)
            .clip(CircleShape)
            .border(
                width = 10.dp,
                color = Color.Cyan,
                shape = CircleShape
            )
    )
}

@Composable
@Preview
fun MainScreenPreview() {
    JC_CircleShapeImageTheme {
        MainScreen()
    }
}
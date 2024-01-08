package com.kenruizinoue.profilecardcomposable.profile_card

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Composable function to create a row of two action buttons.
 *
 * @param buttonsTextSize The font size of the text inside the buttons. Default value is 16.sp (scalable pixels).
 * @param buttonsCornerShape Determines the shape of the button corners. Default is a rounded corner shape with a radius of 12.dp.
 * @param contentPadding Specifies the padding around the content inside the Row layout that contains the buttons. Default padding is 16.dp on all sides.
 * @param textButton1 The text displayed on the first button. Default text is "Follow".
 * @param textColorButton1 Sets the color of the text on the first button. Default color is a shade of dark grey (0xFF283542).
 * @param containerColorButton1 Defines the background color of the first button. Default is transparent.
 * @param onClickButton1 Lambda function to be invoked when the first button is clicked.
 * @param textButton2 The text displayed on the second button. Default text is "Contact".
 * @param textColorButton2 Sets the color of the text on the second button. Default color is white.
 * @param containerColorButton2 Defines the background color of the second button. Default is a dark grey (0xFF283542).
 * @param onClickButton2 Lambda function to be invoked when the second button is clicked.
 */
@Composable
fun ProfileActionButtons(
    buttonsTextSize: TextUnit = 16.sp,
    buttonsCornerShape: Shape = RoundedCornerShape(12.dp),
    contentPadding: Dp = 16.dp,
    textButton1: String = "Follow",
    textColorButton1: Color = Color(0xFF283542),
    containerColorButton1: Color = Color.Transparent,
    onClickButton1: () -> Unit = {},
    textButton2: String = "Contact",
    textColorButton2: Color = Color.White,
    containerColorButton2: Color = Color(0xFF283542),
    onClickButton2: () -> Unit = {}
) {
    Row(modifier = Modifier.padding(
        start = contentPadding,
        end = contentPadding,
        bottom = contentPadding
    )) {
        Button(
            modifier = Modifier.weight(1f),
            onClick = { onClickButton1() },
            colors = ButtonDefaults.buttonColors(containerColor = containerColorButton1),
            border = getButtonBorder(containerColorButton1, textColorButton1),
            shape = buttonsCornerShape
        ) {
            Text(
                textButton1,
                color = textColorButton1,
                fontSize = buttonsTextSize,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
        Spacer(modifier = Modifier.width(contentPadding))
        Button(
            modifier = Modifier.weight(1f),
            onClick = { onClickButton2() },
            colors = ButtonDefaults.buttonColors(containerColor = containerColorButton2),
            border = getButtonBorder(containerColorButton2, textColorButton2),
            shape = buttonsCornerShape
        ) {
            Text(
                textButton2,
                color = textColorButton2,
                fontSize = buttonsTextSize,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
    }
}

// 1. Determining the Proper Border Style
private fun getButtonBorder(containerColor: Color, textColor: Color): BorderStroke {
    return if (containerColor == Color.Transparent)
        BorderStroke(1.dp, textColor)
    else BorderStroke(0.dp, Color.Transparent)
}

@Preview
@Composable
fun ProfileActionButtonsPreview() {
    ProfileActionButtons()
}
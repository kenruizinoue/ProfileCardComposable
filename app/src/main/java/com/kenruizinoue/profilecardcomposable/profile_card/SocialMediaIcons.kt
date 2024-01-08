package com.kenruizinoue.profilecardcomposable.profile_card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kenruizinoue.profilecardcomposable.R

/**
 * Composable function to create a row of social media icon buttons.
 *
 * @param onClickIcon1 Lambda function to be invoked when the first icon is clicked.
 * @param onClickIcon2 Lambda function to be invoked when the second icon is clicked.
 * @param onClickIcon3 Lambda function to be invoked when the third icon is clicked.
 * @param onClickIcon4 Lambda function to be invoked when the fourth icon is clicked.
 * @param icon1Painter The painter for the first icon. Default is the Twitter icon.
 * @param icon2Painter The painter for the second icon. Default is the GitHub icon.
 * @param icon3Painter The painter for the third icon. Default is the LinkedIn icon.
 * @param icon4Painter The painter for the fourth icon. Default is the Medium icon.
 * @param iconBackgroundColor The background color of the icon buttons. Default color is a teal green (0xFF05D79B).
 * @param iconTintColor The color of the icons inside the buttons. Default color is white.
 * @param contentPadding The padding inside the row that contains the icon buttons. Default value is 16.dp.
 */
@Composable
fun SocialMediaIcons(
    onClickIcon1: () -> Unit = {},
    onClickIcon2: () -> Unit = {},
    onClickIcon3: () -> Unit = {},
    onClickIcon4: () -> Unit = {},
    icon1Painter: Painter = painterResource(id = R.drawable.ic_twitter),
    icon2Painter: Painter = painterResource(id = R.drawable.ic_github),
    icon3Painter: Painter = painterResource(id = R.drawable.ic_linkedin),
    icon4Painter: Painter = painterResource(id = R.drawable.ic_medium),
    iconBackgroundColor: Color = Color(0xFF05D79B),
    iconTintColor: Color = Color.White,
    contentPadding: Dp = 16.dp
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(contentPadding),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(
            onClick = { onClickIcon1() },
            modifier = Modifier
                .clip(CircleShape)
                .background(iconBackgroundColor)
        ) {
            Icon(
                painter = icon1Painter,
                contentDescription = null,
                tint = iconTintColor
            )
        }
        IconButton(
            onClick = { onClickIcon2() },
            modifier = Modifier
                .clip(CircleShape)
                .background(iconBackgroundColor)
        ) {
            Icon(
                painter = icon2Painter,
                contentDescription = null,
                tint = iconTintColor
            )
        }
        IconButton(
            onClick = { onClickIcon3() },
            modifier = Modifier
                .clip(CircleShape)
                .background(iconBackgroundColor)
        ) {
            Icon(
                painter = icon3Painter,
                contentDescription = null,
                tint = iconTintColor
            )
        }
        IconButton(
            onClick = { onClickIcon4() },
            modifier = Modifier
                .clip(CircleShape)
                .background(iconBackgroundColor)
        ) {
            Icon(
                painter = icon4Painter,
                contentDescription = null,
                tint = iconTintColor
            )
        }
    }
}

@Preview
@Composable
fun SocialMediaIconsPreview() {
    SocialMediaIcons()
}
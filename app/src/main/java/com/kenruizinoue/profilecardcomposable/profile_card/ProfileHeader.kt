package com.kenruizinoue.profilecardcomposable.profile_card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.kenruizinoue.profilecardcomposable.R

/**
 * Composable function to create a profile header with an image, a title, and a subtitle.
 *
 * @param imagePainter The painter used to draw the image. Default is an AI face image.
 * @param imageSize The size of the image. Default value is 80.dp.
 * @param imageShape The shape of the image. Default is a rounded corner shape with a radius of 8.dp.
 * @param titleText The text for the title. Default text is "John Doe".
 * @param titleFontSize The font size of the title text. Default value is 18.sp.
 * @param titleTextColor The color of the title text. Default color is a light grey (0xFFBEC2C5).
 * @param subtitleText The text for the subtitle. Default text is "Software Engineer".
 * @param subtitleFontSize The font size of the subtitle text. Default value is 16.sp.
 * @param subtitleTextColor The color of the subtitle text. Default color is a lighter grey (0xFF9E9FA0).
 * @param backgroundColor The background color of the entire row. Default color is a dark grey (0xFF283542).
 * @param contentPadding The padding inside the row. Default value is 16.dp.
 */
@Composable
fun ProfileHeader(
    // 1. Efficient Image Handling with Coil
    imagePainter: Painter = rememberImagePainter(data = R.drawable.ai_face),
    imageSize: Dp = 80.dp,
    imageShape: Shape = RoundedCornerShape(8.dp),
    titleText: String = "John Doe",
    titleFontSize: TextUnit = 18.sp,
    titleTextColor: Color = Color(0xFFBEC2C5),
    subtitleText: String = "Software Engineer",
    subtitleFontSize: TextUnit = 16.sp,
    subtitleTextColor: Color = Color(0xFF9E9FA0),
    backgroundColor: Color = Color(0xFF283542),
    contentPadding: Dp = 16.dp
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(backgroundColor)
            .padding(contentPadding)
    ) {
        Box(
            modifier = Modifier
                .size(imageSize)
                // 2. Box for Image Shaping
                .clip(imageShape),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = imagePainter,
                contentDescription = null
            )
        }
        Spacer(modifier = Modifier.width(contentPadding))
        Column {
            Text(
                text = titleText,
                fontSize = titleFontSize,
                fontWeight = FontWeight.Bold,
                color = titleTextColor,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
            Text(
                text = subtitleText,
                fontSize = subtitleFontSize,
                fontWeight = FontWeight.Normal,
                color = subtitleTextColor,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
        }
    }
}

@Preview
@Composable
fun ProfileHeaderPreview() {
    ProfileHeader()
}
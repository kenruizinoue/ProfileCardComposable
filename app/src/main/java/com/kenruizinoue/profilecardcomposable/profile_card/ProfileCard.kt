package com.kenruizinoue.profilecardcomposable.profile_card

// Your package...

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.kenruizinoue.profilecardcomposable.R

/**
 * Composable function to create a complete profile card with a header, social media icons, and action buttons.
 *
 * @param cornerShapeRadius The radius of the corners of the card. Default value is 16.dp.
 * @param contentPadding The padding inside the card. Default value is 16.dp.
 * @param primaryColor The primary color used in the card, especially for background colors. Default is a dark grey (0xFF283542).
 * @param secondaryColor The secondary color used in the card, for accentuating elements. Default is teal green (0xFF05D79B).
 * @param tertiaryColor The tertiary color used in the card, generally for texts and icons. Default is white.
 *
 * Parameters for ProfileHeader():
 * @param imagePainter The painter used to draw the profile image. Default is an AI face image.
 * @param imageSize The size of the profile image. Default value is 80.dp.
 * @param imageShape The shape of the profile image. Default is a rounded corner shape with a radius of 8.dp.
 * @param titleText The text for the title in the header. Default text is "John Doe".
 * @param titleFontSize The font size of the title text. Default value is 18.sp.
 * @param titleTextColor The color of the title text. Default is the tertiary color.
 * @param subtitleText The text for the subtitle in the header. Default text is "Software Engineer".
 * @param subtitleFontSize The font size of the subtitle text. Default value is 16.sp.
 * @param subtitleTextColor The color of the subtitle text. Default color is a lighter grey (0xFF9E9FA0).
 * @param headerBackgroundColor The background color of the header. Default is the primary color.
 *
 * Parameters for SocialMediaIcons():
 * @param onClickIcon1 Lambda function for the first social media icon click action.
 * @param onClickIcon2 Lambda function for the second social media icon click action.
 * @param onClickIcon3 Lambda function for the third social media icon click action.
 * @param onClickIcon4 Lambda function for the fourth social media icon click action.
 * @param icon1Painter The painter for the first social media icon. Default is the Twitter icon.
 * @param icon2Painter The painter for the second social media icon. Default is the GitHub icon.
 * @param icon3Painter The painter for the third social media icon. Default is the LinkedIn icon.
 * @param icon4Painter The painter for the fourth social media icon. Default is the Medium icon.
 * @param iconBackgroundColor The background color of the social media icons. Default is the secondary color.
 * @param iconTintColor The tint color of the social media icons. Default is the tertiary color.
 *
 * Parameters for ProfileActionButtons():
 * @param onClickButton1 Lambda function for the first action button click.
 * @param onClickButton2 Lambda function for the second action button click.
 * @param textButton1 The text for the first action button. Default text is "Follow".
 * @param textColorButton1 The text color for the first action button. Default is the primary color.
 * @param containerColorButton1 The container color for the first action button. Default is transparent.
 * @param textButton2 The text for the second action button. Default text is "Contact".
 * @param textColorButton2 The text color for the second action button. Default is the tertiary color.
 * @param containerColorButton2 The container color for the second action button. Default is the primary color.
 * @param buttonsTextSize The font size for the text in the action buttons. Default value is 16.sp.
 * @param buttonsCornerShape The shape of the corners of the action buttons. Default value is RoundedCornerShape(12.dp).
 */
@Composable
fun ProfileCard(
    cornerShapeRadius: Dp = 16.dp,
    contentPadding: Dp = 16.dp,
    // 1. Simple Color Theming
    primaryColor: Color = Color(0xFF283542),
    secondaryColor: Color = Color(0xFF05D79B),
    tertiaryColor: Color = Color.White,
    // Parameters for ProfileHeader()
    imagePainter: Painter = rememberImagePainter(data = R.drawable.ai_face),
    imageSize: Dp = 80.dp,
    imageShape: Shape = RoundedCornerShape(8.dp),
    titleText: String = "John Doe",
    titleFontSize: TextUnit = 18.sp,
    titleTextColor: Color = tertiaryColor,
    subtitleText: String = "Software Engineer",
    subtitleFontSize: TextUnit = 16.sp,
    subtitleTextColor: Color = Color(0xFF9E9FA0),
    headerBackgroundColor: Color = primaryColor,
    // Parameters for SocialMediaIcons()
    onClickIcon1: () -> Unit = {},
    onClickIcon2: () -> Unit = {},
    onClickIcon3: () -> Unit = {},
    onClickIcon4: () -> Unit = {},
    icon1Painter: Painter = painterResource(id = R.drawable.ic_twitter),
    icon2Painter: Painter = painterResource(id = R.drawable.ic_github),
    icon3Painter: Painter = painterResource(id = R.drawable.ic_linkedin),
    icon4Painter: Painter = painterResource(id = R.drawable.ic_medium),
    iconBackgroundColor: Color = secondaryColor,
    iconTintColor: Color = tertiaryColor,
    // Parameters for ProfileActionButtons()
    button1Text: String = "Follow",
    button1TextColor: Color = primaryColor,
    button1ContainerColor: Color = Color.Transparent,
    onButton1Clicked: () -> Unit = {},
    button2Text: String = "Contact",
    button2TextColor: Color = tertiaryColor,
    button2ContainerColor: Color = primaryColor,
    onButton2Clicked: () -> Unit = {},
    buttonsTextSize: TextUnit = 16.sp,
    buttonsCornerShape: Shape = RoundedCornerShape(12.dp)
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = RoundedCornerShape(cornerShapeRadius)
    ) {
        Column {
            ProfileHeader(
                imagePainter = imagePainter,
                imageSize = imageSize,
                imageShape = imageShape,
                titleText = titleText,
                titleFontSize = titleFontSize,
                titleTextColor = titleTextColor,
                subtitleText = subtitleText,
                subtitleFontSize = subtitleFontSize,
                subtitleTextColor = subtitleTextColor,
                backgroundColor = headerBackgroundColor,
                contentPadding = contentPadding
            )
            SocialMediaIcons(
                onClickIcon1 = onClickIcon1,
                onClickIcon2 = onClickIcon2,
                onClickIcon3 = onClickIcon3,
                onClickIcon4 = onClickIcon4,
                icon1Painter = icon1Painter,
                icon2Painter = icon2Painter,
                icon3Painter = icon3Painter,
                icon4Painter = icon4Painter,
                iconBackgroundColor = iconBackgroundColor,
                iconTintColor = iconTintColor,
                contentPadding = contentPadding
            )
            ProfileActionButtons(
                onClickButton1 = onButton1Clicked,
                onClickButton2 = onButton2Clicked,
                textButton1 = button1Text,
                textColorButton1 = button1TextColor,
                containerColorButton1 = button1ContainerColor,
                textButton2 = button2Text,
                textColorButton2 = button2TextColor,
                containerColorButton2 = button2ContainerColor,
                buttonsTextSize = buttonsTextSize,
                buttonsCornerShape = buttonsCornerShape,
                contentPadding = contentPadding
            )
        }
    }
}

@Preview
@Composable
fun ProfileCardPreview() {
    Box(modifier = Modifier.padding(16.dp)) {
        ProfileCard()
    }
}
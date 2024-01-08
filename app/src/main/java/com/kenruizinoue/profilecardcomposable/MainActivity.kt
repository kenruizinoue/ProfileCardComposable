package com.kenruizinoue.profilecardcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.kenruizinoue.profilecardcomposable.profile_card.ProfileCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.padding(16.dp)) {
                ProfileCard(
                    primaryColor = Color(0xFF0079F1),
                    secondaryColor = Color(0xFF1E233A),
                    cornerShapeRadius = 0.dp,
                    contentPadding = 24.dp,
                    imagePainter = rememberImagePainter(data = R.drawable.ai_face),
                    imageShape = CircleShape,
                    titleText = "David Johnson",
                    titleFontSize = 22.sp,
                    subtitleText = "Web Developer",
                    subtitleTextColor = Color(0xFFC8E2FC),
                    subtitleFontSize = 18.sp,
                    icon1Painter = painterResource(id = R.drawable.ic_medium),
                    icon2Painter = painterResource(id = R.drawable.ic_github),
                    icon3Painter = painterResource(id = R.drawable.ic_linkedin),
                    icon4Painter = painterResource(id = R.drawable.ic_twitter),
                    button1Text = "Like",
                    button2Text = "Message",
                    buttonsTextSize = 18.sp,
                    buttonsCornerShape = RoundedCornerShape(24.dp)
                )
            }
        }
    }
}
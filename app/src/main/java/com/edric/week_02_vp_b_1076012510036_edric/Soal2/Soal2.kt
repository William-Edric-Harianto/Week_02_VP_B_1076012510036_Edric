package com.edric.week_02_vp_b_1076012510036_edric.Soal2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults.Container
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.edric.week_02_vp_b_1076012510036_edric.R

@Composable
fun Soal2View() {
    val defaultFontFamily = FontFamily(
        Font(resId = R.font.poppins_black, weight = FontWeight.Black),
        Font(resId = R.font.poppins_blackitalic, weight = FontWeight.Black, style = FontStyle.Italic),
        Font(resId = R.font.poppins_bold, weight = FontWeight.Bold),
        Font(resId = R.font.poppins_bolditalic, weight = FontWeight.Bold, style = FontStyle.Italic),
        Font(resId = R.font.poppins_extrabold, weight = FontWeight.ExtraBold),
        Font(resId = R.font.poppins_extrabolditalic, weight = FontWeight.ExtraBold, style = FontStyle.Italic),
        Font(resId = R.font.poppins_extralight, weight = FontWeight.ExtraLight),
        Font(resId = R.font.poppins_extralightitalic, weight = FontWeight.ExtraLight, style = FontStyle.Italic),
        Font(resId = R.font.poppins_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
        Font(resId = R.font.poppins_light, weight = FontWeight.Light),
        Font(resId = R.font.poppins_lightitalic, weight = FontWeight.Light, style = FontStyle.Italic),
        Font(resId = R.font.poppins_medium, weight = FontWeight.Medium),
        Font(resId = R.font.poppins_mediumitalic, weight = FontWeight.Medium, style = FontStyle.Italic),
        Font(resId = R.font.poppins_regular, weight = FontWeight.Normal),
        Font(resId = R.font.poppins_semibold, weight = FontWeight.SemiBold),
        Font(resId = R.font.poppins_semibolditalic, weight = FontWeight.SemiBold, style = FontStyle.Italic),
        Font(resId = R.font.poppins_thin, weight = FontWeight.Thin),
        Font(resId = R.font.poppins_thinitalic, weight = FontWeight.Thin, style = FontStyle.Italic)
    )
    val backgroundColor = Color(0xFF040348)
    val foregroundColor = Color(0xFF87CEEB)
    val mainTextColor = Color.White


    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.guangzhou_huacheng_square),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
            )
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .weight(4f)
                    .fillMaxSize()
            ) { }
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(6f)
                    .fillMaxSize()
                    .clip(RoundedCornerShape(
                        topStart = 32.dp,
                        topEnd = 32.dp
                    ))
                    .background(backgroundColor)
                    .padding(all = 30.dp)
            ) {
                Text(
                    "My Travel",
                    textAlign = TextAlign.Center,
                    color = mainTextColor,
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    "Canton Tower",
                    textAlign = TextAlign.Left,
                    color = mainTextColor,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    "Guangzhou, China",
                    textAlign = TextAlign.Left,
                    color = mainTextColor,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(30.dp)
                ){
                    Icon(
                        painter = painterResource(R.drawable.five_pointed_star_solid),
                        contentDescription = "Filled star",
                        tint = Color.Yellow,
                        modifier = Modifier.size(25.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.five_pointed_star_solid),
                        contentDescription = "Filled star",
                        tint = Color.Yellow,
                        modifier = Modifier.size(25.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.five_pointed_star_solid),
                        contentDescription = "Filled star",
                        tint = Color.Yellow,
                        modifier = Modifier.size(25.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.five_pointed_star_solid),
                        contentDescription = "Filled star",
                        tint = Color.Yellow,
                        modifier = Modifier.size(25.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.five_pointed_star_solid),
                        contentDescription = "Filled star",
                        tint = Color.Yellow,
                        modifier = Modifier.size(25.dp)
                    )
                    Text(
                        "5.0",
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Left,
                        color = Color.Yellow,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
                Column(
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ){
                    defaultTextField("What did you enjoy the most about your trip?")
                    defaultTextField("What was your favorite spot?")
                    defaultTextField("Anything else you'd like to add?")
                }
                Row(
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    FloatingActionButton(
                        containerColor = backgroundColor,
                        // Change the icon/text color
                        contentColor = foregroundColor,
                        onClick = {
                            //push rank
                        }
                    ) {
                        Icon(
                            painterResource(R.drawable.filled_add),
                            "add button"
                        )
                    }
                }
            }
        }

    }
}

@Composable
fun defaultTextField(placeholder:String){
    var hold by remember { mutableStateOf("") }
    TextField(
        value = hold,
        onValueChange = { newText -> hold = newText },
        placeholder = { Text(placeholder) },
        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.Black,
            unfocusedTextColor = Color.Gray,
            focusedContainerColor = Color.LightGray,
            focusedIndicatorColor = Color.Blue // Bottom line/border color
        ),
        modifier = Modifier
            .fillMaxWidth()

    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal2Preview() {
    Soal2View()
}

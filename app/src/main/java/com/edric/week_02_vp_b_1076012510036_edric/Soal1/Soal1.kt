package com.edric.week_02_vp_b_1076012510036_edric.Soal1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.systemGestureExclusion
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edric.week_02_vp_b_1076012510036_edric.R

//region Assets
val backgroundColor =  Color(0xFFc0a086)
val albumCover = R.drawable.flyingbeagle_albumcover
val lyricBackground = Color(0xFF5a4135)
val lyricTextColor = Color.White
val lyrics = """
    突然のキスや熱いまなざしで
    恋のプログラムを狂わせないでね
    出逢いと別れ上手に打ち込んで
    時間がくれば終わる don't hurry!
    愛に傷ついたあの日からずっと
    昼と夜が逆の暮らしを続けて
    はやりの disco で踊り明かすうちに
    おぼえた魔術なのよ I'm sorry!
    私のことを決して本気で愛さないで
    恋なんてただのゲーム
    楽しめばそれでいいの
    閉ざした心を飾る
    派手なドレスも靴も 孤独な友だち
    私を誘う人は皮肉なものね
    いつも彼に似てるわ
    なぜか思い出と重なり合う
    グラスを落として急に涙ぐんでも
    わけは尋ねないでね
    夜更けの高速で眠りにつくころ
    ハロゲンライトだけ妖しく輝く
    氷のように冷たい女だと
    ささやく声がしても don't worry!
    I'm just playing games
    I know that's plastic love
    Dance to the plastic beat
    Another morning comes
    I'm just playing games
    I know that's plastic love
    Dance to the plastic beat
    Another morning comes
    I'm just playing games
    I know that's plastic love
    Dance to the plastic beat
    Another morning comes
""".trimIndent()
//endregion
@Composable
fun soal1View(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(backgroundColor)
            .padding(
                start = 30.dp,
                end = 30.dp,
                top = 20.dp
            )
    ){
        Row(
            modifier = Modifier
                .padding(
                    top = 5.dp,
                    end = 10.dp,
                    bottom = 20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(painterResource(R.drawable.down_arrow),"arrow down",
                modifier = Modifier.size(50.dp)
            )
            Text("Liked Songs",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Image(painterResource(R.drawable.baseline_more_horiz_24),
                "more horizontal",
                modifier = Modifier.size(30.dp)
            )
        }
        Image(painterResource(albumCover),"Album Cover")
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column(

                    verticalArrangement = Arrangement.SpaceEvenly
                    ){
                Text("Flying Beagle",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                Text("Liked Songs",
                    fontSize = 20.sp
                )
            }
            Image(painterResource(R.drawable.solid_heart_svgrepo_com),"Heart Icon",
                modifier = Modifier
                        .size(40.dp)
                        .clip(RectangleShape)
            )
        }
        Column(
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(3.dp)
                    .background(Color.Black)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text("0:12",
                    fontSize = 15.sp
                )
                Text("-6:28",
                    fontSize = 15.sp
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(
                    top = 20.dp,
                    bottom = 25.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(painterResource(R.drawable.previous_track),"Previous Track",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Image(painterResource(R.drawable.pause_button),"Pause",
                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
            )
            Image(painterResource(R.drawable.next_track_button),"Next Track",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
        }
        Box(
            modifier = Modifier

            .fillMaxWidth()
            .fillMaxHeight()

            .background(
                color = lyricBackground,
                shape = RoundedCornerShape(32.dp)
            )
        ){
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .padding(
                        top = 20.dp,
                        start = 12.dp,
                        end = 12.dp
                    ),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Lyrics",
                    color = lyricTextColor,
                    fontSize = 25.sp,
                    modifier = Modifier
                        .padding(
                            start = 10.dp,
                            bottom = 15.dp)
                        .fillMaxWidth()
                )
                Text(
                    text = lyrics,
                    fontSize = 19.sp,
                    color = lyricTextColor,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth(),
                    lineHeight = 30.sp
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun soal1Preview(){
    soal1View()
}
package com.edric.week_02_vp_b_1076012510036_edric

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.edric.week_02_vp_b_1076012510036_edric.Soal1.soal1View
import com.edric.week_02_vp_b_1076012510036_edric.ui.theme.Week_02_VP_B_1076012510036_EdricTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            soal1View()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Week_02_VP_B_1076012510036_EdricTheme {
        Greeting("Android")
    }
}
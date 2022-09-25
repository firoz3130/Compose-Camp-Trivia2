package com.example.rockpaperscissors

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rockpaperscissors.ui.theme.RockPaperScissorsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RockPaperScissorsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                        Trivia2()
                }
            }
        }
    }
}



@Composable
fun Trivia2()
{
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment=Alignment.CenterHorizontally,
    modifier=Modifier.fillMaxSize()
    ) {
    Image(
        contentDescription = null,
        painter = painterResource(id = R.drawable.rps),
        modifier = Modifier.fillMaxWidth(),
        contentScale = ContentScale.FillWidth
    )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
                Text(text="Score",fontSize=30.sp)
                Text(text="0 / 4",fontSize=50.sp, fontWeight = FontWeight.Bold)
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier=Modifier.fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text ="You chose", fontSize = 16.sp)
                Text(text="Rock", fontSize = 32.sp, fontWeight = FontWeight.Bold)
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text ="Android chose", fontSize = 16.sp)
                Text(text="Paper", fontSize = 32.sp, fontWeight = FontWeight.Bold)
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp,)
        ){
            Button(
                onClick = { },
                modifier=Modifier.size(100.dp),
                shape= RoundedCornerShape(15.dp)
            ) {
                Text(
                    text="Rock"
                )
            }
            Button(
                onClick = { },
                modifier=Modifier.size(100.dp),
                shape= RoundedCornerShape(15.dp)
            ) {
                Text(
                    text="Paper"
                )
            }
            Button(
                onClick = { },
                modifier=Modifier.size(100.dp),
                shape=RoundedCornerShape(15.dp)
            ) {
                Text(
                    text="Scissor"
                )
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp,)
        ){
            Text(
                text = "#JetpackCompose",
                fontSize=20.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RockPaperScissorsTheme {
Trivia2()


    }
}
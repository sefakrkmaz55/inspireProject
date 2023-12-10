@file:OptIn(ExperimentalMaterial3Api::class)

package com.korkmaz.inspireproject

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.korkmaz.inspireproject.ui.theme.InspireProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InspireProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting() {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Inspire") }, colors = TopAppBarDefaults.smallTopAppBarColors(
                containerColor = colorResource(id = R.color.teal_700),
                titleContentColor = colorResource(id = R.color.white)
            )
        )
    }, content = {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(id = R.drawable.steve), contentDescription = "")
                Text(
                    text = "Steve Jobs",
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
            }
            Text(
                text = "The ones who are crazy enough to think they can change the world, are the ones who do.",
                modifier = Modifier.padding(all = 10.dp),
                textAlign = TextAlign.Center
            )
            Button(onClick = { Log.e("Button","Inspıre Running") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.White
                )
                ) {
                Text(text = "Inspire")
            }
        }
    })
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    InspireProjectTheme {
        Greeting()
    }
}
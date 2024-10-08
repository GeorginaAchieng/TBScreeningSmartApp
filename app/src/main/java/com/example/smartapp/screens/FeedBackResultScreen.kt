package com.example.smartapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun FeedBack(navController: NavController) {
    val paddingModifier = Modifier.padding(10.dp)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
    ){


        // Welcome message
        Text(text = "Hello,\nHere is what is recommended", fontSize = 25.sp, color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 50.dp, 0.dp, 0.dp)
        )

        // Adding a Spacer of height 20dp
        Spacer(modifier = Modifier.height(20.dp))


        Card(modifier = Modifier
            .size(width = 300.dp, height = 200.dp)
            .padding(16.dp),
    ) {
        Column() {

            Text(text = "TB Presumed, \n Visit the nearest Health Center",
                color = Color.Red,
                modifier = paddingModifier,
                fontSize = 24.sp,
            )

        }

    }
        // Adding a Spacer of height 20dp
        Spacer(modifier = Modifier.height(20.dp))


        Card(modifier = Modifier
            .size(width = 300.dp, height = 200.dp)
            .padding(16.dp),
        ) {
            Column() {

                Text(text = "No TB",
                    color = Color.DarkGray,
                    modifier = paddingModifier,
                    fontSize = 34.sp,
                    fontWeight = FontWeight.Bold,

                )

            }

        }
}}
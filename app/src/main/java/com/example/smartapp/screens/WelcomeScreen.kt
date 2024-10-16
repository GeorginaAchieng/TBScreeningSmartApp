package com.example.smartapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.smartapp.R

@Composable
fun WelcomeScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()) {

        Image(modifier = Modifier
            .fillMaxWidth()
            .size(500.dp),
            painter = painterResource(id = R.drawable.logo), contentDescription = "TB Screening Tool")
        Text(modifier = Modifier.fillMaxWidth()
            .padding(20.dp),
            color = Color.Magenta,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            text = "TB Self Screening Tool")

        // Login button
        OutlinedButton(onClick = { navController.navigate( "login" ) },
            modifier = Modifier.fillMaxWidth().padding(0.dp, 25.dp, 0.dp, 0.dp)) {
            Text(text = "Login",
                modifier = Modifier.fillMaxWidth().padding(5.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )


        }
        // Don't have an Account Register
        OutlinedButton(onClick = { navController.navigate( "registration" ) },
            modifier = Modifier.fillMaxWidth().padding(0.dp, 25.dp, 0.dp, 0.dp)) {
            Text(text = "Don't have an Account\nRegister",
                modifier = Modifier.fillMaxWidth().padding(5.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )


        }
    }


    }






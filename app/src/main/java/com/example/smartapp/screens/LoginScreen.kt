package com.example.smartapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


/**
     * Defines the UI for the login screen.
     */
    @Composable
    fun  LoginScreen(navController: NavController) {


        // State variables to store user input
        val userName = remember {
            mutableStateOf("")
        }
        val userPassword = remember {
            mutableStateOf("")
        }


        // Column to arrange UI elements vertically
        Column(modifier = Modifier
            .fillMaxHeight()
            .padding(40.dp)) {


            // Welcome message
            Text(text = "Hello,\nScreen yourself TB", fontSize = 25.sp, color = Color.Red,
                modifier = Modifier.fillMaxWidth().padding(0.dp, 50.dp, 0.dp, 0.dp)
            )

            // Username input field
            OutlinedTextField(value = userName.value, onValueChange = {
                userName.value = it
            },
                leadingIcon = {
                    Icon(Icons.Default.Person, contentDescription = "person")
                },
                label = {
                    Text(text = "username")
                },
                modifier = Modifier.fillMaxWidth().padding(0.dp, 20.dp, 0.dp, 0.dp)
            )

            // Password input field
            OutlinedTextField(value = userPassword.value, onValueChange = {
                userPassword.value = it
            },
                leadingIcon = {
                    Icon(Icons.Default.Lock, contentDescription = "password")
                },
                label = {
                    Text(text = "password")
                },
                modifier = Modifier.fillMaxWidth().padding(0.dp, 20.dp, 0.dp, 0.dp),
                visualTransformation = PasswordVisualTransformation()
            )

            // Login button
            OutlinedButton(onClick = { navController.navigate( "homepage" ) },
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




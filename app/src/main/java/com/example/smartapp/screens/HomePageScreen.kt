package com.example.smartapp.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.smartapp.R

@Composable
fun ScreeningQuestions(navController: NavController) {

    var state by remember {
        mutableStateOf(false)
    }
    Column(modifier = Modifier
        .fillMaxHeight()
        .padding(40.dp))

    {


        Image(
            modifier = Modifier
                .fillMaxWidth()
                .size(480.dp),
            painter = painterResource(id = R.drawable.logo),
            contentDescription = stringResource(id = R.string.tb_logo)

        )

    Row(modifier = Modifier
        .fillMaxWidth()
        .align(Alignment.CenterHorizontally)){
        Text(text = "Noticeable Weight Loss")
    Checkbox(checked = state, onCheckedChange = { state = it })


}
        Row(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.CenterHorizontally)){
            Text(text = "Cough of a duration of three weeks")
            Checkbox(checked = state, onCheckedChange = { state = it })


        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.CenterHorizontally)){
            Text(text = "Loss of Appetite")
            Checkbox(checked = state, onCheckedChange = { state = it })


        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.CenterHorizontally)){
            Text(text = "Night Sweat")
            Checkbox(checked = state, onCheckedChange = { state = it })


        }

        Button(onClick = {
            navController.navigate("FeedBack")
        }) {
            Text("Submit")
        }
    }}





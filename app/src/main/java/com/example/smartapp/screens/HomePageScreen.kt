package com.example.smartapp.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.smartapp.R

@Composable
fun ScreeningQuestions(navController: NavController) {


     Column(modifier = Modifier
        .fillMaxHeight()
        .padding(40.dp))

     {


         Image(
             modifier = Modifier
                 .fillMaxWidth()
                 .size(400.dp),
             painter = painterResource(id = R.drawable.logo),
             contentDescription = stringResource(id = R.string.tb_logo)

         )
         Text(text = "Symptoms of Active TB. \n Kindly check the symptoms you are having")
         val screeningQuestionsList = arrayListOf("Noticeable weight loss/gain in children", "Loss of appetite", "Night sweat","Cough of a given duration","None of the above")
         screeningQuestionsList.forEach { option: String ->
             Spacer(modifier = Modifier.size(16.dp))
             Row(
                 horizontalArrangement = Arrangement.Center,
                 verticalAlignment = Alignment.CenterVertically,
             ) {
                 val isChecked = remember { mutableStateOf(false) }
                 Checkbox(
                     checked = isChecked.value,
                     onCheckedChange = {
                         isChecked.value = it
                     }
                 )
                 Spacer(modifier = Modifier.size(16.dp))
                 Text(option)
             }

         }
         Button(onClick = {
             navController.navigate("FeedBack")
         }) {
             Text("Submit")
         }


     }}







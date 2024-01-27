package com.example.navigation

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun Homescreen(navController: NavHostController){
    var name by remember {
        mutableStateOf("")
    }
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Home Screen",
                    fontSize = 25.sp)

            Spacer(modifier = Modifier.height(30.dp))
            OutlinedTextField(value = name, onValueChange = {
                name = it
            },
                placeholder = { Text(text = "Enter name")},
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done , capitalization = KeyboardCapitalization.Words)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = { navController.navigate("second/$name") }) {
                Text(text = "Go to next Screen")
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
private fun homescreenprev() {

}
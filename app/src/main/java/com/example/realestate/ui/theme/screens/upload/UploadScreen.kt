package com.example.wazitoecommerce.ui.theme.screens.upload

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.ktx.R

@Composable
fun UploadScreen(navHostController: NavHostController){
    Column {
        //Box
        Box (modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
            ){
            Image(
                painter = (painterResource(id = com.example.wazitoecommerce.R.drawable.realestate)),
                contentDescription = "home",
                modifier = Modifier.size(100.dp)

            )

        }
        Text(
            text = "",
            fontSize = 35.sp,
            color = Color.White,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center

        )
        Text(
            text = "sell your own home",
            color = Color.White,
        )
    }
    Spacer(modifier = Modifier.height(10.dp))
    //End of Box


}



@Preview
@Composable
fun UploadScreenPreview(){
    UploadScreen(rememberNavController())
}
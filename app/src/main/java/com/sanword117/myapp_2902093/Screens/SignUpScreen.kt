package com.sanword117.myapp_2902093.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sanword117.myapp_2902093.R
import com.sanword117.myapp_2902093.components.HeadingTextComponent
import com.sanword117.myapp_2902093.components.NormalTextComponent

@Composable
fun SignUpScreen(){

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
        ) {
        Column(modifier = Modifier.fillMaxSize()) {


        NormalTextComponent(value = stringResource(id = R.string.hello ) )
        HeadingTextComponent(value = stringResource(id = R.string.create_account))

        }
    }

}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}
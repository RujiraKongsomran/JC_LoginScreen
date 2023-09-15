package com.rujirakongsomran.jc_loginscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.rujirakongsomran.jc_loginscreen.ui.theme.JC_LoginScreenTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_LoginScreenTheme {
                navController = rememberNavController()
            }
        }
    }
}

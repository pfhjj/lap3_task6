package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            StudentCard(
                student = Student(
                    name = "Fajr Abuzoah",
                    program = "Computer Science",
                    gpa = "4.50",
                    email = "fajr@example.com",
                    city = "Jubail, Eastern Province"
                ),
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
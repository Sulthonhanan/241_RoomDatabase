package com.example.roomdatabase


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.roomdatabase.ui.theme.RoomDatabaseTheme
import com.example.roomdatabase.ui.theme.RoomDatabaseTheme
import com.example.roomdatabase.view.uicontroller.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RoomDatabaseTheme {
                // Surface digunakan sebagai container utama dengan background color dari theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Memanggil fungsi utama navigasi aplikasi
                    SiswaApp()
                }
            }
        }
    }
}
package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomnavigation = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragmensatu)
        val appBarrconfiguration = AppBarConfiguration(setOf(R.id.fragmensatu, R.id.fragmentKedua, R.id.fragmentKetiga))
        setupActionBarWithNavController(navController, appBarrconfiguration)

        bottomnavigation.setupWithNavController(navController)
    }
}
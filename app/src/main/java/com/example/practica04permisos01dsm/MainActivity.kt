package com.example.practica04permisos01dsm

import android.os.Bundle
import android.Manifest
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private val TAG = "Practica 04 - Permisos"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        configurePermisos()
        }

    private fun configurePermisos(){
        val permission = ContextCompat.checkSelfPermission(this,Manifest.permission.RECORD_AUDIO)
        if (permission != PackageManager.PERMISSION_GRANTED){
            Log.i(TAG, "Permiso para grabar denegado")
        }
    }
}
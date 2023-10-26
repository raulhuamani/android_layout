package com.rhuamani.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class InterfazActivity : AppCompatActivity() {

    lateinit var btnLinear : Button
    lateinit var btnRelative :Button
    lateinit var btnConstraint : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interfaz)
        asignarReferencias();
    }

    private fun asignarReferencias(){
        btnLinear = findViewById(R.id.btnLinear)
        btnRelative = findViewById(R.id.btnRelative)
        btnConstraint = findViewById(R.id.btnConstraint)

        btnLinear.setOnClickListener({
            //Toast.makeText(this, "Hola hiciste click en Linear", Toast.LENGTH_SHORT).show()
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        })

        btnRelative.setOnClickListener({
            val intent = Intent(baseContext, RelativeActivity::class.java)
            startActivity(intent)
        })

        btnConstraint.setOnClickListener({
            val intent = Intent(baseContext, ConstraintActivity::class.java)
            startActivity(intent)
        })
    }
}
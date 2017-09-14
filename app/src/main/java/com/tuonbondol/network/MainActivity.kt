package com.tuonbondol.network

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.tuonbondol.networkutil.isNetworkConnected
import kotlinx.android.synthetic.main.activity_main.*

/***
 *
 * @author TUON BONDOL
 *
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCheckNetwork.setOnClickListener {
            if(!isNetworkConnected(this)){
                Toast.makeText(this, "Network is not Connected!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Network is Connected!", Toast.LENGTH_LONG).show()
        }
    }
}
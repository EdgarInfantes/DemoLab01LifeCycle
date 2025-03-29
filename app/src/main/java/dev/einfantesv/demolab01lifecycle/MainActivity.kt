package dev.einfantesv.demolab01lifecycle

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val tag: String = "INF-State";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.i(tag, "MainActivity-->onCreate")
    }

    override fun onStart(){
        super.onStart()
        Log.i(tag, "MainActivity-->onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.i(tag, "MainActivity-->onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.i(tag, "MainActivity-->onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.i(tag, "MainActivity-->onStop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.i(tag, "MainActivity-->onDestroy")
    }

    //New comment

}
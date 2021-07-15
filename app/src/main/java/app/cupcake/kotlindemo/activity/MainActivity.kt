package app.cupcake.kotlindemo.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import app.cupcake.kotlindemo.R
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    private lateinit var context: Context
    private lateinit var textView:TextView
    private lateinit var button: Button
    private lateinit var button2: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        context = this
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        textView.setOnClickListener{
            //Three ways to set a toast
            //Toast.makeText(this, "COMPUTER SCIENCE PORTAL", Toast.LENGTH_LONG).show()
            //Toast.makeText(applicationContext, "Test", Toast.LENGTH_LONG).show()
            //Toast.makeText(this@MainActivity, "Test", Toast.LENGTH_LONG).show()
            Toast.makeText(context, "This is a test", Toast.LENGTH_LONG).show()

        }

        button.setOnClickListener{
            textView.setText("Button Clicked")
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()

            val intent = Intent(this, NextActivity::class.java)
            intent.putExtra("key", "this is 2021")
            startActivity(intent)

        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("Basic", "On start called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Basic", "On restart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Basic", "On resume called")
    }


    override fun onStop() {
        super.onStop()
        Log.i("Basic", "On stop called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Basic", "On pause called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Basic", "On destroy called")
    }

}
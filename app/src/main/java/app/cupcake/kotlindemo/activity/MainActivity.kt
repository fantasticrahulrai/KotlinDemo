package app.cupcake.kotlindemo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import app.cupcake.kotlindemo.R
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    companion object {
        val log = Logger.getLogger(MainActivity::class.java.name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById(R.id.textView) as TextView
        val button = findViewById(R.id.button) as Button

        textView.setOnClickListener{
            //Three ways to set a toast
            //Toast.makeText(this, "COMPUTER SCIENCE PORTAL", Toast.LENGTH_LONG).show()
            //Toast.makeText(applicationContext, "Test", Toast.LENGTH_LONG).show()
            Toast.makeText(this@MainActivity, "Test", Toast.LENGTH_LONG).show()

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
        log.warning("onStart Called")
    }

    override fun onRestart() {
        super.onRestart()
        log.info("OnRestart Called")
    }

    override fun onResume() {
        super.onResume()
        log.info("OnResume Called")
    }


    override fun onStop() {
        super.onStop()
        log.info("OnStop Called")
    }

    override fun onPause() {
        super.onPause()
        log.info("OnPause Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        log.info("OnDestroy Called")
    }

}
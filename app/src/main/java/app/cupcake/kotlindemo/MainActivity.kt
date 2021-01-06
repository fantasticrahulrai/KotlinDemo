package app.cupcake.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    companion object {
        val log = Logger.getLogger(MainActivity::class.java.name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "Test", Toast.LENGTH_LONG).show()
        Toast.makeText(this, "Test", Toast.LENGTH_LONG).show()

    }

    override fun onStart() {
        super.onStart()
        log.info("onStart Called")
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
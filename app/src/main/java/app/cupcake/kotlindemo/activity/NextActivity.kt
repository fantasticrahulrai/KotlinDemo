package app.cupcake.kotlindemo.activity

import android.content.Context
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import app.cupcake.kotlindemo.R
import com.bumptech.glide.Glide

class NextActivity : AppCompatActivity() {

    private lateinit var context:Context
    private lateinit var imageView:ImageView
    private lateinit var s: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        context = this
        imageView = findViewById(R.id.imageView)
        s = intent.getStringExtra("key").toString()


        Toast.makeText(this, "This is string s $s", Toast.LENGTH_LONG).show()

        Glide
            .with(applicationContext)
            .asBitmap()
            .load(R.drawable.bg)
            .centerCrop()
            .into(imageView)


    }
}
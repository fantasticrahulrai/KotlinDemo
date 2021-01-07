package app.cupcake.kotlindemo.activity

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import app.cupcake.kotlindemo.R
import com.bumptech.glide.Glide

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val imageView = findViewById(R.id.imageView) as ImageView

        val s = intent.getStringExtra("key")
        Toast.makeText(this, "This is variable $s", Toast.LENGTH_LONG).show()

        Glide
            .with(applicationContext)
            .asBitmap()
            .load(R.drawable.bg)
            .centerCrop()
            .into(imageView)


    }
}
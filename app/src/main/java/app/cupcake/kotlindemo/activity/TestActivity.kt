package app.cupcake.kotlindemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import app.cupcake.kotlindemo.R
import app.cupcake.kotlindemo.fragment.DemoFragment

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val fm = supportFragmentManager // = FragmentManager fm = getSupportFragmentManager();
        val fragment = DemoFragment.newInstance("this is a message0",  "this is a message 1")
        fm.beginTransaction().replace(R.id.constraintlayout, fragment).commit();
    }


    private fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.constraintlayout, fragment)
        transaction.disallowAddToBackStack()
        transaction.commit()
    }

}
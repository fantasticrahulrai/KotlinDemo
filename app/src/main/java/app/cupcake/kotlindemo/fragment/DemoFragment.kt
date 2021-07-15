package app.cupcake.kotlindemo.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import app.cupcake.kotlindemo.R
import com.google.android.material.snackbar.Snackbar

//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

class DemoFragment : Fragment() {

    private var string1: String? = null
    private var string2: String? = null
    private lateinit var cl: FrameLayout


    //new instance for initalization
    /*companion object {
        @JvmStatic
        fun newInstance(s1: String, s2: String) =
            DemoFragment().apply {
                arguments = Bundle().apply {
                    putString("stringkey1", s1) //value is stored in stringkey that is passed by activity
                    putString("stringkey2", s2)
                }
            }
    }*/

    //new instance for initalization
    companion object {
        fun newInstance(s1:String, s2:String): DemoFragment {

            val fragment = DemoFragment() // = Frgemnt fragment = new Frament()
            val args = Bundle() // = Bundle agrs = new Bundle()
            args.putString("stringkey1", s1) //value is stored in stringkey that is passed by activity
            args.putString("stringkey2", s2)
            fragment.arguments = args // =  fragment.setArguments(args)
            return fragment
        }
    }

    //on create
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            string1 = it.getString("stringkey1") //value of stirngkey is accessed that was passed on new instance
            string2 = it.getString("Stringkey2")
        }
    }

    //on create view
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val v = inflater.inflate(R.layout.fragment_demo, container, false) // = final View v = ....

        cl = v.findViewById(R.id.framelayout)
        Snackbar.make(cl, "String = $string1", Snackbar.LENGTH_LONG).show()


        return v
    }



}
package puresoft.org.kotlinlearning

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val fn: (String, Button) -> Unit = { txtt, btn ->
        btn.text = txtt
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            info("all", fn)

        }

    }

    fun info(name: String, funSum: (String, Button) -> Unit) {

        funSum(name, button)

    }


}

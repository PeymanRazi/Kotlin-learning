package puresoft.org.kotlinlearning

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private var resultMe: String = ""

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {

            this.resultMe = when (text.text.toString()) {

                "e", "w", "q" -> "<5"

                "r", "t", "y" -> ">5"

                else -> {
                    "any things"
                }
            }

            Toast.makeText(applicationContext, "result is: $resultMe", 2000).show()

        }

    }
}

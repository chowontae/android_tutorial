package kr.co.talknv.an1_helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var text2:TextView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("abcd", "on create");

        text2 = findViewById<TextView>(R.id.textView4)
        text2?.text = "문자열2"
        text2?.setText("문자열10")
        textView4.text = "문자열4"

    }

    override fun onStart() {
        super.onStart()

        Log.d("abcd", "on Start");
    }

    override fun onResume() {
        super.onResume()
        Log.d("abcd", "on Resume")
    }
    override fun onRestart() {
        super.onRestart()

        Log.d("abcd", "on Restart")
    }

    override fun onPause() {
        super.onPause()

        Log.d("abcd", "on Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("abcd", "on Stop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("abcd", "on Destroy")
    }

}

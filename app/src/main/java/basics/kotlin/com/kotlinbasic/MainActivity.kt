package basics.kotlin.com.kotlinbasic

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFunc.setOnClickListener {
            val funIntent=Intent(this@MainActivity,FunctionaActivity::class.java);
            startActivity(funIntent);
        }
    }
}

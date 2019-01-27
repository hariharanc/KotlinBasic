package basics.kotlin.com.kotlinbasic

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnFunc.setOnClickListener(this)
        btnCollection.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnFunc -> {
                val intentKotlinBase = Intent(this@MainActivity, KotlinBaseActivity::class.java)
                intentKotlinBase.putExtra("type", "function")
                startActivity(intentKotlinBase)
            }
            R.id.btnCollection -> {
                val intentKotlinBase = Intent(this@MainActivity, KotlinBaseActivity::class.java)
                intentKotlinBase.putExtra("type", "collection")
                startActivity(intentKotlinBase)
            }
            else -> {
            }
        }
    }

}

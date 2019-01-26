package basics.kotlin.com.kotlinbasic

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import basics.kotlin.com.kotlinbasic.R.id.btnFunc

class FunctionaActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnFunc=findViewById<Button>(R.id.btnFunc);
        btnFunc.text="Call Function"
        btnFunc.setOnClickListener {
            val function=Function("Function");
            //println(function.functionExp(5,5))
            Log.i("Function","Function With Expression Output::"+function.functionExp(5,5).toString());

            Log.i("Function","Function With Body Output::"+function.functionBody(5,5).toString());

            Log.i("Function","Function With NullWithCheck Output::"+function.functionWithNullCheck(5,5).toString());

            Log.i("Function","Function With funDefultArg Output::"+function.funDefultArg("40802","hari"));

            Log.i("Function","Function With funDefultPositionCal Output::"+function.funDefultPositionCal(type="add"));

           // Log.i("Function","Function With funDefultPositionCal Output::"+function.funDefultPositionCal("add"));//error

           // Log.i("Function","Function With funNameArg Output::"+function.funNameArg(a=20,b=20,d=30));//error use same name

            Log.i("Function","Function With funNameArg Output::"+function.funNameArg(c=30,a=20,b=20));

            Log.i("Function","Function With funNameArg Output::"+function.funNameArg(b=30));

            Log.i("Function","Function With funSameName Output::"+function.funSameName(5,5));//same function name different argument with default value but compiler calls only matched function.

           // Log.i("Function","Function With funSameName Output::"+function.funSameName(5,5,"add"));

            Log.i("Function","Function With funVarArg Output::"+function.funVarArg(10,10,10,b=10));//same function name different argument with default value but compiler calls only matched function.

            //spread operator to pass array to vararg
            val data= intArrayOf(5,5,5)
            Log.i("Function","Function With funVarArg spread Output::"+function.funVarArg(*data,b=10));//same function name different argument with default value but compiler calls only matched function.

            //nested function more encapsulation
            Log.i("Function","Function inside another local function Output::"+function.funAvrg(10,10));//same function name different argument with default value but compiler calls only matched function.



        }

    }
}
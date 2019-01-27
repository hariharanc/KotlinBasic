package basics.kotlin.com.kotlinbasic

import android.util.Log

class Function(type:String) {
    fun functionExp(a: Int, b: Int) = a + b

    fun functionBody(a: Int, b: Int): Int {
        if (a > 1) return a + b
        else return 5
    }

    fun functionWithNullCheck(a: Int, b: Int): Int? = null

    fun funDefultArg(empCode: String, empNam: String, compName: String = "Matrimony"): String = "Emp Name $empNam employeeCode $empCode and company name $compName"


    fun funDefultPositionCal(a: Int = 5, type: Any, b: Int) =
            when (type) {
                "add" -> a + b
                else -> a - b
            }

    fun funDefultPositionCal(a: Int = 5, b: Int=5, type: Any) =
            when (type) {
                "add" -> a + b
                else -> a - b
            }

    fun funNameArg(a: Int = 5, b: Int = 5, c: Int = 5): String = (a + b + c).toString()+" value c is $c"

    fun funSameName(a: Int, b: Int, type: String = "add"): String = "$type" + (a + b).toString()

    fun funSameName(a: Int, b: Int) = a + b

    fun funVarArg(vararg a: Int, b: Int) :Int {
        var sum=b
        for(vale in a){
            sum =sum+ vale
        }
        return sum
    }


    init {
        Log.i("Function","Init call First object creation $type")
        
    }


    //nested function

    fun funAvrg(a:Int,b:Int):Double{

        fun  average(c:Int)=((a+b+c)/2).toDouble()

        return average(10)
    }

}

### KOTLIN FUNCTION BASICS

This section provides the basics idea of how declare,calling functions, Default arguments in function, Named Arguments in function,Varargs in function and Function scopes.

**1.Function Declaration**<br/>
 To declare function using **fun** keyword in kotlin.<br/>
			Example:<br/>		
      **fun** aboutMe(name:String):String{<br/>
       return "Your name is $name"<br/>
      }<br/>
 
 **2.Function Calling in Kotlin**<br/>
 You just need to pass required parameter to calling a function in kotlin.<br/>
 **aboutMe("hari")**

 **General syntax of declaring a function in Kotlin**
 fun functionName(param1: Type1, param2: Type2,..., paramN: TypeN): Type {
	// Method Body
}<br/>

**Single Expression to returns the values without using return type**<br/>
**fun** aboutMe(name:String)="Your name is $name"<br/>

**Function without retuning value**<br/>  

**fun** aboutMe(name:String):**Unit**{<br/>
       //code your logical here...<br/>
      }<br/>    
      If use **Unit** its dosn't returns the values its equally void in java.<br/>
      
**3.Function Default Arguments**<br/>

**fun** funDefultArg(empCode: String, empNam: String, **compName: String = "Gcube"**): String = "Emp Name $empNam employeeCode $empCode and company name $compName"<br/>
In the above example third parameter compName default value is Gcube.Let's check the result while calling above function kotlin.<br/>

   **funDefultArg**("555","hari") --> **Output:** Emp Name hari employeeCode 5252 and company name Gcube"<br/>
   In kotlin function parameter having default value while calling a function you don't want to override a value for this case you just ignore the default argument parameter.<br/>
   
   **Override the default value**<br/>
       **funDefultArg**("40802","hari","Github") --> **Output:** Emp Name hari employeeCode 5252 and company name Github"<br/>
       
  **Function Default Argument next non default Argument**<br/>
  
  **fun** funDefultArg(empCode: Int=555, empNam: String, **compName: String = "Gcube"**): String = "Emp Name $empNam<br/> 
  In the above example first,third parameter have default value but second parameter doesn't have default value calling this function above way its produce the compile time error.<br/>
  
  **funDefultArg("test")//compile time error**<br/>
  Because your calling above function postion based so that compiler produce the exception at compile time.To over come this one you could use named function argument.<br/>
 
 **4.Function Named Arguments**<br/>
 **fun** funNameArg(a: Int = 5, b: Int, c: Int = 5): String = (a + b + c).toString()+" value c is $c";<br/>
 
 If you call the above function it's produce the result in kotlin<br/>
 funNameArg(b==10) ---> **Output:** 20 value b is 10<br/>
 
 In function name argument you should use the same in calling a function otherwwise exception will occur at compile time<br/>
 **funNameArg**(a= 5, c = 5,d=5)//exception occurred<br/>
  
  **5.Function with varargs**Variable Number of Arguments (Varargs)<br/>
  
  **fun** funVarArg(**vararg a: Int**, b: Int) :Int {<br/>
        var sum=b;<br/>
            for(vale in a){<br/>
            sum =sum+ vale<br/>
        }<br/>
        return sum;<br/>
    }<br/>    
   
   You can pass a variable number of arguments to a function by declaring the function with a vararg parameter.<br/>
    function.funVarArg(10,10,10,b=10)--> **it's produce success result**<br/>
    function.funVarArg(10,10,"ffgf",b=10)--> **it's produce compile time exception**<br/>
     A function may have only one vararg parameter.<br/>
     In Kotlin, a vararg parameter of type T is internally represented as an array of type T (Array<T>) inside the function body<br/>
	
 **6.Function Null Check**<br/>
 fun functionWithNullCheck(a: Int, b: Int): Int? = null ;<br/>
 
**7.Function Scope**<br/>
**i. Member Functions**<br/>
      Member functions are functions which are defined inside a class or an object.<br/>
**ii.Local/Nested Functions**<br/>

      fun funAvrg(a:Int,b:Int):Double{

        fun  average(c:Int)=((a+b+c)/2).toDouble()

        return average(10)
    }
   <br/>Function inside another function allows in kotling it provide code readability and encapsulation.<br/>
   Finally download the sample code and see the syntax its may helpfuls you to understand more about function. 
    
  

  
  

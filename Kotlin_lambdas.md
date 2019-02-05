**Kotlin Lambdas**
**Lambda Expressions**<br/>
  Lambda expression or simply lambda is an anonymous function; a function without name. These functions are passed immediately as an expression without declaration.<br/>
 
 ````
  fun main(args: Array<String>) {

    val greeting = { println("Hello!")}

    // invoking function
    greeting()
}
````
Here, a lambda expression is assigned to variable greeting. The expression doesn't accept any parameters and doesn't return any value in this program.<br/>

Then, the function (lambda expression) is invoked as<br/>
````
greeting()
````
**Lambda With Parameters and Return Type**
````
val product = { a: Int, b: Int -> a * b }
val result = product(9, 3)
````

**Higher-Order Function**<br/>
Koltin has a great support for functional programming. You can pass functions as arguments to other functions. Also, you can return a function from other functions. These functions are called higher-order functions.<br/>
**Passing Lambda to Function**<br/>
````
 callMe({ println("Hello!") })
 ````
 
**maxBy() Function**<br/>
````
val people = listOf( Person("Jack", 34), Person("Shelly", 19), Person("Patrick", 13),Person("Jill", 12),Person("Shane", 22),Person("Joe", 18))
val selectedPerson = people.maxBy({ person ->  person.age })
println(selectedPerson) //Person(name=Jack, age=34)
println("name: ${selectedPerson?.name}" )  //name: Jack
println("age: ${selectedPerson?.age}" )   //age: 34

````
**it Keyword: Used for Single Parameter**<br/>
it is used to access parameter values in the body of the lambda expression.<br/>
````
val selectedPerson = people.maxBy({ person -> person.age })
````
with<br/>
````
val selectedPerson = people.maxBy({ it.age })
````
**maxBy() and startsWith()**<br/>
````
val selectedPerson = people
            .filter { it.name.startsWith("S") }
            .maxBy{ it.age }
 println(selectedPerson)//Person(name=Shane, age=22)
 println("name: ${selectedPerson?.name}" )//name: Shane
 println("age: ${selectedPerson?.age}" )//age: 22            
````   
**Function references in Kotlin: use functions as lambdas everywhere**<br/>
Kotlin supports functions as a type, what means that you can save a function in a variable, use it as another function argument, or even make that a function returns another function.<br/>
This is the main feature to consider that a language supports functional programming style, and Kotlin of course allows this.<br/>
````
val sum: (Int, Int) -> Int = { x, y -> x + y }
````
````
val sum: (Int, Int) -> Int = { x, y -> x + y }
fun applyOp(x: Int, y: Int, op: (Int, Int) -> Int): Int = op(x, y)
applyOp(2, 3, sum)
````
**Function references: any function can be a lambda**<br/>
So the same way lambdas can be passed as an argument or saved to a variable, we can do the same with regular functions.<br/>
````
fun sum(x: Int, y: Int) = x + y
applyOp(2, 3, sum)//it fails->sum is not detected as a lambda,
````
We need to use the function reference. For that, you only have to prepend two colons to the name of the function:<br/>
````
applyOp(2, 3, ::sum)
````
You can assign this reference to a variable with the same structure:<br/>
````
val test:(Int,Int)->Int = ::sum
````
**Kotlin let, run, also, apply, with**<br/>
The kotlin-stdlib provides us with useful higher order functions implementing idiomatic patterns.<br/> 
* **let**
* **run**
* **also**
* **apply**
* **with**
**Kotlin let**<br/>
`let` takes the object it is invoked upon as the parameter and returns the result of the lambda expression.<br/>
`it` keyword contains the copy of the property inside let.
````
 var str = "Hello World"
 str.let { println("$it!!") }
 println(str)//output::Hello World!!
  ````
**Kotlin run**<br/>
````
var tutorial = "This is Kotlin Tutorial"
    println(tutorial) //This is Kotlin Tutorial
    tutorial = run {
        val tutorial = "This is run function"
        tutorial
    }
    println(tutorial) //This is run function
````
* Similar to the let function, the run function also returns the last statement.
* Unlike let, the run function doesn’t support the it keyword.

**Kotlin also**<br/>
`also` expressions does some additional processing on the object it was invoked.<br/>
 Unlike let, it returns the original object instead of any new return data. Hence the return data has always the same type.<br/>
 **Kotlin let vs also**<br/>
 ````
 data class Person(var name: String, var tutorial : String)
var person = Person("hari", "Kotlin")

var l = person.let { it.tutorial = "Android" }
var al = person.also { it.tutorial = "Android" }
    
println(l)//output->kotlin unit
println(al)//output->Person(name=hari,tutorial=Android)
println(person)//output->Person(name=hari,tutorial=Android)
````

**Kotlin apply**<br/>
`apply` is an extension function on a type. It runs on the object reference (also known as receiver) into the expression and returns the object reference on completion.
**apply vs also**<br/>
````
data class Person(var n: String, var t : String)
var person = Person("Anupam", "Kotlin")

person.apply { t = "Swift" }
println(person)

person.also { it.t = "Kotlin" }
println(person)
````
**Kotlin with**<br/>
`with` is used to change instance properties without the need to call dot operator over the reference every time.
````
data class Person(var name: String, var tutorial : String)
var person = Person("Anupam", "Kotlin")

with(person)
    {
        name = "No Name"
        tutorial = "Kotlin tutorials"
    }
````    
* with runs without an object(receiver) whereas apply needs one.
* apply runs on the object reference, whereas with just passes it as an argument.
* The last expression of with function returns a result.    


    

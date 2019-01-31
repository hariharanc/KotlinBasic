**Kotlin Abstract Class**<br/>
1.`abstract` keyword is used to declare abstract classes in Kotlin.<br/>
2.abstract class cannot be instantiated (you cannot create objects of an abstract class). However, you can inherit subclasses from can them.<br/>
3.Abstract Property (Must be overridden by Subclasses)<br/>
4.Abstract classes are always open. You do not need to explicitly use open keyword to inherit subclasses from them.<br/>

**Kotlin Abstract Class and Method**<br/>
````
abstract class Person(name: String) {

    init {
        println("My name is $name.")
    }

    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }

    abstract fun displayJob(description: String)//Must be overridden by Subclasses
}

class Teacher(name: String): Person(name) {

    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {
    val jack = Teacher("Jack Smith")
    jack.displayJob("I'm a mathematics teacher.")
    jack.displaySSN(23123)
}
````

**Kotlin Interface**<br/>
Keyword `interface` is used to define interfaces in Kotlin.<br/>

````
interface MyInterface {
    var test: String   // abstract property
    fun foo()          // abstract method
    fun hello() = "Hello there" // method with default implementation
}
class InterfaceImp : MyInterface {
    override val test: Int = 25
    override fun foo() = "Lol"
    // other code
}
**Multiple inheritance**<br/>
```
interface A {
    fun foo() { print("A") }
    fun bar()
}
interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}
````
**Interface delegation**<br/>
Another very interesting feature in Kotlin is the interface delegation.<br/>
````
interface A {
    fun functionA(){}
}
 
interface B {
    fun functionB(){}
}
 
class C(val a: A, val b: B) {
    fun functionC(){
        a.functionA()
        b.functionB()
    }
}
````
**Interface vs Abstract**<br/>
Kotlin interfaces are similar to abstract classes. However, interfaces cannot store state whereas abstract classes can. Meaning, interface may have property but it needs to be abstract or has to provide accessor implementations. Whereas, it's not mandatory for property of an abstract class to be abstract.<br/>

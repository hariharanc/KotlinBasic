**Object Declarations**<br/>
Singleton is an object-oriented pattern where a class can have only one instance (object).<br/>
For example<br/>
You are working an application having SQL database backend. You want to create a connection pool to access the database while reusing the same connection for all clients. For this, you can create the connection through singleton class so that every client get the same connection.<br/>

Kotlin provides an easy way to create singletons using the object declaration feature. For that, `object` keyword is used.<br/>
An object declaration can contain properties, methods and so on. However, they are not allowed to have constructors (which makes sense). Why?<br/>

Similar to objects of a normal class, you can call methods and access properties by using the . notation.<br/>
**Example**<br/>
````
object Test {
    private var a: Int = 0
    var b: Int = 1

    fun makeMe12(): Int {
        a = 12
        return a
    }
}

fun main(args: Array<String>) {
    val result: Int

    result = Test.makeMe12()

    println("b = ${Test.b}")
    println("result = $result")
}
````

**Companion Object**<br/>
Kotlin doesn’t have static members or member functions. Kotlin recommends to simply use package-level functions instead.
If you need to write a function that can be called without having a class instance but needs access to the internals of a class, you can write it as a member of a companion object declaration inside that class.<br/>
````
class Person {
    companion object Test {
        fun callMe() = println("I'm called.")
    }
}

fun main(args: Array<String>) {
    Person.callMe()
}
````

A Better Example for `Object vs Companion Object`<br/>
**Object**
````
  object MySingletonObject {
        fun getInstance(): MySingletonObject {
            // return single instance of object
        }
    }
     MySingletonObject.getInstance()
````

**Companion Object**<br/>
````
class MyClass {
        companion object MyCompanionObject {
            fun actsAsStatic() {
                // do stuff
            }
        }

       fun instanceMethod() {
            // do stuff
        }
    }
    
 ````   
 Invoking the instance method would look like this.<br/>
 ````
 var myClass = MyClass()
 myClass.instanceMethod()
 ````
Invoking the companion object method would look like this.<br/>
````
 MyClass.actsAsStatic()
 ````

    

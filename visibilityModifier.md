**Kotlin Visibility Modifiers**<br/>
  Visibility modifiers are keywords that set the visibility (accessibility) of classes, objects, interface, constructors, functions, 
  properties and their setters.
  **Note:** If visibility modifier is not specified, it is public by default.<br/>
  **Visibility Modifiers**<br/>
  1.public   - visible everywhere<br/>
  2.private  - visible inside the class only or file<br/>
  3.internal - visible inside the same module<br/>
  4.protected- visible inside the class and its subclasses<br/>
  
  **Example**
  ````
  open class Base() {
    var a = 1                 // public by default
    private var b = 2         // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    internal val d = 4        // visible inside the same module

    protected fun e() { }     // visible to the Base and the Derived class
}


class Derived: Base() {

    // a, c, d, and e() of the Base class are visible
    // b is not visible

    override val c = 9        // c is protected
}

````

***Changing Visibility of a Constructor***<br/>
By default, the visibility of a constructor is 'public'.However, you can change it. For that, you need to explicitly add constructor keyword.<br/>
public by default<br/>
````
class Test(val a: Int) {
    // code
}
````
**Changing visibility**<br/>

````
class Test private constructor(val a: Int) {
    // code
}
````

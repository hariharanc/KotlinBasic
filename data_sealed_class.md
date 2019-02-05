**Data Class**<br/>
 1.Classes whose main purpose is to hold data.In such cases, you can mark the class as data to create a `data` class.<br/>

**Example**<br/>
 ````
 data class Movie(var name: String, var studio: String, var rating: Float)
 ````
 For this class, the compiler automatically generates:<br/>
 `copy()` function, `equals()` and `hashCode()` pair, and `toString()` form of the primary constructor<br/>
 `componentN()` functions<br/>
 
 **Usage**
```` 
println(movie.name)   //Whiplash
println(movie.studio) //Sony Pictures
println(movie.rating) //8.5 
movie.rating = 9F
 
println(movie.toString()) //Movie(name=Whiplash, studio=Sony Pictures, rating=9.0)
````
 
**Kotlin Data Class Requirements**<br/>

1.The primary constructor must have at least one parameter.<br/>
2.The parameters of the primary constructor must be marked as either val (read-only) or var (read-write).<br/>
3.The class cannot be open, abstract, inner or sealed.<br/>
4.The class may extend other classes or implement interfaces. If you are using Kotlin version before 1.1, the class can only implement interfaces.<br/>

**Copy Function**<br/>
The copy() function is created, in case that we need to copy an object altering some of its properties but keeping the rest unchanged.<br/>
````
val betterRating = movie.copy(rating = 9.5F)
println(betterRating.toString()) // Movie(name=Whiplash, studio=Sony Pictures, rating=9.5)
````

**component**<br/>
Destructuring Declarations allow us to treat objects properties as individual values. For each property in out data class, a componentN() is generated:<br/>
````
movie.component1() // name
movie.component2() // studio
movie.component3() // rating
````

**2.Kotlin - Sealed Class**<br/>
The below example gives you better understanding about sealed class purpose in kotlin<br/> 
You have a domain (your pets) where you know there is a definite enumeration (count) of types. 
For example, you have two and only two pets (which you will model with a class called MyPet).
Meowsi is your cat and Fido is your dog.<br/> 

Compare the following two implementations of that contrived example:<br/> 
````
sealed class MyPet
class Meowsi : MyPet()
class Fido : MyPet()
````
Because you have used sealed classes, when you need to perform an action depending on the type of pet, then the possibilities of MyPet are exhausted in two and you can ascertain that the MyPet instance will be exactly one of the two options:<br/>
````
fun feed(myPet: MyPet) {
    when(myPet) {
       is Meowsi -> print("Giving cat food to Meowsi!")
       is Fido -> print("Giving dog biscuit to Fido!") 
    }
}
````
























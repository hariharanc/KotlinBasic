Classes and Objects are the central concepts in any Object Oriented Programming(OOP) language.

**Classes**<br/>
A class is an entity that determines how an object will behave and what the object will contain.In other words, it is a blueprint or a set of instruction to build a specific type of object.<br/>

Create class use class keyword in kotlin<br/>
```
class Student {
}
```
To create an object for above class in kotlin so it has default constructor.<br/>
val Student = Student()<br/>
There was no need to use **new** keyword to create an object in kotlin.<br/>

**Properties**<br/>
```
class Student {
	// Properties or Member Variables
    var firstName: String
    var lastName: String
    val schollName: String = "GHSS"//initializing value & not changeable.
}
```
Using the var keyword is mutable or read-only use keyword val.<br/>

**Constructors**<br/>
Every class needs to have a constructor. If you don’t declare one yourself, the compiler generates a default constructor.<br/>
There are two types of constructors in Kotlin -<br/>
1.Primary Constructor<br/>
2.Secondary Constructor<br/>
**1. Primary Constructor**<br/>
The Primary constructor is part of the class header and declared after the class name<br/> 

```
class Student constructor(firstName: String, lastName: String) {
}
```
You can omit the constructor keyword from the primary constructor<br/> 
```
class Student(firstName: String, lastName: String) {
}
```
**Initializer Block**<br/>
The primary constructor cannot contain any code. So all the initialization logic is written inside an initializer block which is prefixed with the init keyword<br/>
```
class Student (firstName: String, lastName: String) {
  var firstName: String
  var lastName: String
  init{
  this.firstName=firstName
  thhis.lastName=lastName
  }
}
```
Note that, instead of initializing the properties in the init block, you can directly initialize them in the class body itself like this
```
class Student (firstName: String, lastName: String) { 
  var firstName: String = firstName 
  var lastName: String = =lastName   
} 
```
**Default Values in the Constructor**<br/>
```
class Student (firstName: String, lastName: String,schoolName: String="GHSS") {
  var firstName: String = firstName
  var lastName: String = =lastName
  init{
  println("Student data firstName = $firstName and lastName = $lastName" and school name $schoolName)
  }
}
```
So you could omit the school name to create object like this val student = Student("hari","c") in output we receive default school name<br/>
If you want to override the default value call like this val student1 = Student("Ram","R","VIDYAA VIKAS");<br/> 

**2. Secondary Constructor**<br/> 
Secondary constructors are prefixed with the constructor keyword and declared inside the class body<br/> 
```
class Student(firstName: String, lastName: String,schoolName: String="GHSS") {
  var firstName: String = firstName
  var lastName: String = =lastName
   constructor(firstName: String, lastName: String,schoolName: String="GHSS")this(firstName,lastName){
  println("Student data firstName = $firstName and lastName = $lastName" and school name $schoolName)
  }
}
```
One thing to note here is that every secondary constructor must call the primary constructor, either directly or indirectly via another secondary constructor<br/> 
**The secondary constructor calls the primary constructor using this keyword**
**Getter && Setter**
If you use **val** in constructor then there was no setter properties only getter properites
If you use **var** in constructor then you could use both setter && getter properties in accessing from object.

```
class Student (var firstName: String, var lastName: String,val schoolName: String="GHSS")
val student = Student("hari", "c")   
student.firstName="Ram"// ok
student.schoolName="VIDYAA VIKAS"// Error
```
**Note**Kotlin internally calls the default (implicit) getters/setters of the properties

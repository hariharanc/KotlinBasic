**Inheritance**<br/>
Inheritance is the features of another class is called the Child class or Derived class or Sub class, and the class whose features are inherited is called the Parent class or Base class or Super class.<br/>
All the classes in Kotlin have a common base class called **Any**<br/>

````
class Student // Implicitly inherits from the default Super class - Any
`````
**Any** class contains three methods namely equals(), hashCode() and toString()<br/>

Declare class && derived class in kotlin

````
// Base class (Super class)
open class School(val schoolname:String,val place:String) {
}
````
Notice the use of **open** keyword in the base class. By default, all the classes in Kotlin are final (non-inheritable).<br/>
To allow a class to be inherited by others, you must mark it with the **open modifier**.<br/>

1.If child class has primary constructor then must initialize the parant class right in the header.<br/>
2.If child class doesn't have primary constructor then secondary constructor initialize the parent class using **super** keyword.<br/>

**Example1: Child class with Primary Constructor calls Parent**<br/>

````
class Student(var schollName:String,var place:String,var rollNo:String) : School(schollName,place){
}
````
**Example2: Child class with without Primary Constructor calls Parent**<br/>

````
class Student : School{
constructor(var schollName:String,var place:String,var rollNo:String) : super(schollName,place)
}
````


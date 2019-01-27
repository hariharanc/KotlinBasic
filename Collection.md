
**Collections**<br/>
Collections are used to store groups of related objects in memory. In a collection, we can retrieve, store or organize the objects.<br/>

**Kotling Collection Interface**<br/>
The Kotlin Collection interface extends the Iterable interface.The Collection interface is immutable. In other words, you have read-only access to collections.
Some of the functions and properties available in the Collection interface are:<br/>
1.size: this property returns the size of the collection.<br/>
2.isEmpty(): returns true if the collection is empty or false otherwise.<br/> 
3.contains(element: E): returns true if the element specified in the argument is present in the collection.<br/>
4.containsAll(element: Collection<E>): returns true if the element in the collection passed as argument is present 
in the collection.<br/>  

**MutableIterable Interface**<br/>
The MutableCollection interface in Kotlin is a specialized interface that enables collections to be mutable. In other words, add and remove operations can be performed on a given collection. This interface extends both the Collection interface and the MutableIterable interface.<br/>
1.add(element: E)<br/>
2.remove(element: E)<br/>
3.addAll(elements: Collection<E>)<br/>
4.removeAll(elements: Collection<E>)<br/>
5.retainAll(elements: Collection<E>)<br/>
6.clear():<br/>

**1.Immutable (read-only)**<br/>
 **2.Mutable (read and write)**
 
 **1.Immutable**<br/> 
 ```
  val immutableList = listOf(1, 2, "a", "b", "c");//its allow any type<br/>
  var numbers: List<Int> = listOf(1, 2, 3, 4, 5)//its allow only specific type interger<br/>
  var intSet: Set<Int> = setOf(1, 3, 4)<br/> 
  val callingCodesMap: Map<Int, String> = mapOf(234 to "Nigeria", 1 to "USA", 233 to "Ghana")<br/>
  ```
  **2.Mutable**<br/>
  ```
  val mutableList = mutableListOf(1, 2, "a", "b", "c")//accept any type<br/>
  val mutableIntList: MutableList<Int> = mutableListOf(1, 2, 3)//its allow only specific type interger<br/>
  val currenciesMutableMap: MutableMap<String, String> = mutableMapOf("Naira" to "Nigeria", "Dollars" to "USA", "Pounds" to "UK")<br/>
```

**Collections Operation Functions**<br/>
 **last()**->This operator function returns the last element in a collection such as a list or set.<br/>
 **first()**->This operator function returns the first element.<br/>
 **max()**->Invoking this operator function on a collection such as a list or set returns the largest element, or null if no largest element is found.<br/>
 **drop()**->Its drop the element from list but its return new list master copy not changed kindly check code.<br/>
  **plus()**->Its add the element in list but its return new list master copy not changed kindly check code.<br/>
  **minus()**->Its remove the element in list but its return new list master copy not changed kindly check code.<br/>
 `Finally download the sample code and see the syntax its may helpfuls you to understand more about function.`<br/>
 [Reference Link](https://code.tutsplus.com/tutorials/kotlin-from-scratch-ranges-and-collections--cms-29397).

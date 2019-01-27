package basics.kotlin.com.kotlinbasic

import android.content.Context
import android.util.Log

class Collection {

    fun functionProperties() {
        imMutableProperties()
        mutableProperties()
        collectionOperation()
    }

    //******immutable ***********//
    val immutableList = listOf(1, 2, "a", "b", "c")//its allow any type
    var numbers: List<Int> = listOf(1, 2, 3, 4, 5)//its allow only interger
    //properties of immutable list
    fun imMutableProperties() {
        Log.i("Collection", "Get the list size:${immutableList.size}")
        Log.i("Collection", "Get value index::${immutableList.get(1)}")
        Log.i("Collection", "Get the index from element::${immutableList.indexOf("b")}")
        Log.i("Collection", "List SubList::${immutableList.subList(2, immutableList.size)}")//gives new list
        //accessing array list values
        for (item in numbers)
            Log.i("Collection", "Geting value for loop in operator:$item")
        for (item in numbers.indices)
            Log.i("Collection", "Getting list index:$item value${numbers[item]}")
        val iterator = numbers.iterator()
        while (iterator.hasNext())
            Log.i("Collection", "Geting value using iterator operator:${iterator.next()}")

        val callingCodesMap: Map<Int, String> = mapOf(234 to "Nigeria", 1 to "USA", 233 to "Ghana")
        for ((key, value) in callingCodesMap) {
            println("$key is the calling code for $value")
        }
        print(callingCodesMap[234]) // Nigeria
    }

    //******* mutable ********//
    val mutableList = mutableListOf(1, 2, "a", "b", "c")//accept any type
    val mutableIntList: MutableList<Int> = mutableListOf(1, 2, 3)//accept only integer
    val mutableStrList = mutableListOf<String>("java", "kotlin", "c#")//accept only string

    fun mutableProperties() {
        Log.i("Collection", "Collection Mutable getValue ${mutableList.get(3)}")
        mutableIntList.add(4)//adding
        Log.i("Collection", "Collection Mutable getLastVal ${mutableIntList[mutableIntList.lastIndex]}")
        mutableIntList[3] = 5//updating
        Log.i("Collection", "Collection Mutable getLastVal ${mutableIntList[mutableIntList.lastIndex]}")
        // converting immutable list to mutable list
        val converList = numbers.toMutableList()
        converList.add(6)
        Log.i("Collection", "Collection Mutable getLastVal ${converList[converList.lastIndex]}")

        val currenciesMutableMap: MutableMap<String, String> = mutableMapOf("Naira" to "Nigeria", "Dollars" to "USA", "Pounds" to "UK")

        Log.i("Collection","Map to get values: ${currenciesMutableMap.values}")
        Log.i("Collection","Map to get keys: ${currenciesMutableMap.keys}")
        currenciesMutableMap.put("Cedi", "Ghana")
        currenciesMutableMap.remove("Dollars")
        Log.i("Collection","Map to get value from key: ${currenciesMutableMap.get("Naira")}")

        for((key,value) in currenciesMutableMap)
        {
            Log.i("Collection","Get Map key $key &value $value")

        }
    }

    fun collectionOperation() {
        Log.i("Collection", "Collection operation first element ${mutableIntList.first()} last val ${mutableIntList.last()} min val ${mutableIntList.min()} max val${mutableIntList.max()}")
        Log.i("Collection", "Collection operation drop element ${mutableIntList.drop(2)}")//return new list
        Log.i("Collection", "Collection operation last element ${mutableIntList.last()}")//master list value not changed.

        for (item in mutableIntList)
        Log.i("Collection", "Collection operation element $item")//master list value not changed.

        mutableIntList.removeAt(mutableIntList.size-1)
        Log.i("Collection", "Collection remove  master element item ${mutableIntList.last()}")//master list value not changed.

        for (item in mutableIntList)
        Log.i("Collection", "Collection Master copy value $item")//master list value not changed.

       Log.i("Collection","Collection plus${mutableStrList.plus("c")}")//retun new list
       Log.i("Collection","Collection plus${mutableStrList.minus("kotlin")}")//retun new list

    }


}
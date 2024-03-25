fun main(){
    println(isPalindrome("madam"))
    volSphere(2.0)
    println(calc(arrayOf(10,10)))
    wholeStr("Barnie bakes brown bagel and buns")
    println(aver(arrayOf(10,10)).contentToString())




}
//A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.
fun isPalindrome(word: String): Boolean{
    var reversedWord = word.reversed()
    return reversedWord ==word

}

//The volume of a sphere is calculated using the formula below
//
//V = 4/3 π r
//3
//
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π

fun volSphere(radius: Double){
    var vol = 4/3 * 3.14159 * (radius)
    println(vol)

}

//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.

fun calc(numbers: Array<Int>): Any {
//    var sum = numbers.sum()
//    return sum

    var sum1 = numbers.reduce{ acc, curr -> acc + curr }
    return sum1
//    var aver = numbers.count()
//   return aver




}

fun aver(nm:Array<Int>):Array<Any>{
    return arrayOf(nm.sum(),nm.count(),nm.average())

}

//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.
fun wholeStr(word: String){
    var res = word.toList()
    println(res)

}
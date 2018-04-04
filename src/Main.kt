// This is main, the entry point of a Java/Kotlin Application
fun main(args: Array<String>) {

    val myBook = Student(title = "The lord of the rings", author = "Tolkien", pages = 12345)

    println(myBook.getDetails())
    
    myBook.price = 45.9
    println(myBook.price)

}



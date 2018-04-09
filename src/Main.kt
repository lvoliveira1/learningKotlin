//import java.awt.print.Book

// This is main, the entry point of a Java/Kotlin Application

fun main(args: Array<String>) {
    val teacher1 = Teacher(firstName = "João", lastName = "da Silva", Age = 44, gender = "male", currentSubject = "Math")

    println(teacher1.getDetailsTeacher())

    val student1 = student(firstName = "José", lastName = "da Silva", Age = 44, gender = "male", favoriteSubject = "Math", grade = 100)

    println(student1.getDetailsStudent())

    println(student1.getLetterGrade())

    val myBook = Book(title = "The lord of the rings", author = "Tolkien", pages = 12345)

    println(myBook.getDetails())

    myBook.price = 45.9

    println(myBook.price)
}

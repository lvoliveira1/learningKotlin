
// Title = String
// Numbers = Integer

class Book {
    val title: String
    val author: String
    private val pages: Int
    var price = 0.0

    constructor(title: String, author: String, pages: Int){
        this.title = title
        this.author = author
        this.pages = pages
    }
    fun getDetails(): String {
        return  "Title: $title, Author: $author, Pages: $pages"
    }

    override fun toString(): String {
        return "Student(title='$title', author='$author', pages=$pages, price=$price)"
    }

}

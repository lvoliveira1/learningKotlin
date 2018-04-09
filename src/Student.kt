import javafx.beans.binding.When

class student {
    val firstName: String
    val lastName: String
    val Age: Int
    val gender: String
    val favoriteSubject: String
    val grade: Int

    constructor(firstName: String, lastName: String, Age: Int, gender: String, favoriteSubject: String, grade: Int) {
        this.firstName = firstName
        this.lastName = lastName
        this.Age = Age
        this.gender = gender
        this.favoriteSubject = favoriteSubject
        this.grade = grade
    }

    fun getDetailsStudent(): String {
        return "First Name = $firstName, Last Name = $lastName, Age = $Age, Gender = $gender, Fav. Subj. = $favoriteSubject, Grade = $grade"
    }

    fun getLetterGrade(): String{
        return if (grade >= 90) "A"
        else if (grade >= 80) "B"
        else if (grade >= 70) "C"
        else if (grade >= 60) "D"
        else "F"
    }

}

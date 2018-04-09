class Teacher{

    val firstName: String
    val lastName: String
    val Age: Int
    val gender: String
    val currentSubject: String

    constructor(firstName:String, lastName:String, Age:Int, gender:String, currentSubject:String){
        this.firstName = firstName
        this.lastName = lastName
        this.Age = Age
        this.gender = gender
        this.currentSubject = currentSubject
    }
    fun getDetailsTeacher() : String {
    return "First Name= $firstName, Last Name= $lastName, Age= $Age, Gender= $gender, Cur. Subj.,= $currentSubject"
    }

}
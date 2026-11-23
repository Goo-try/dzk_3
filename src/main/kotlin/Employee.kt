class Employee(
    val lastName: String,
    val firstName: String,
    val middleName: String,
    val position: String,
    val email: String,
    val phone: String,
    var salary: Int?,
    var age: Int
) {
    constructor(
        lastName: String,
        firstName: String,
        middleName: String,
        position: String,
        email: String,
        phone: String,
        age: Int
    ) : this(lastName, firstName, middleName, position, email, phone, null, age)

    fun printInfo() {
        val salaryText = if (salary != null) "$salary руб." else "Испытательный срок (без оплаты)"
        println(
            """
                
            ФИО: $lastName $firstName $middleName

            Должность: $position

            Email: $email

            Телефон: $phone

            Зарплата: $salaryText

            Возраст: $age
            ________________________________________
            
            """.trimIndent()
        )
    }
}

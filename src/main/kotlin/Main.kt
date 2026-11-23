fun main() {
    val employees = arrayOf(
        Employee("Пушкин", "Александр", "Сергеевич", "Разработчик", "pushkin@mail.ru", "+7 (916) 482-91-04", 50000, 37),
        Employee("Толстой", "Лев", "Николаевич", "Директор", "tolstoy@mail.ru", "+7 (926) 390-17-48", 150000, 55),
        Employee("Лермонтов", "Михаил", "Юрьевич", "Системный администратор", "lermontov@mail.ru", "+7 (903) 715-84-92", 45000, 26),
        Employee("Бродский", "Иосиф", "Александрович", "Стажёр", "brodsky@mail.ru", "+7 (963) 109-48-25", 41),
        Employee("Чехов", "Антон", "Павлович", "Разработчик", "chekhov@mail.ru", "+7 (915) 839-40-21", 55000, 44)
    )

    println()
    println("Сотрудники старше 40 лет:")
    println()

    employees.forEach { employee ->
        if (employee.age > 40) {
            employee.printInfo()
        }
    }
}

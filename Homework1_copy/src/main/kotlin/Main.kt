import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        // Задание 1
        println("Швера Данила, техник-программис")
        // Задание 2
        val a: Byte = 127
        val b: Short = 32767
        val c = 2147483647
        val d: Long = 2
        val e = 0.645f
        val f = 0.987
        val g = true
        val h = 'h'
        val i = "Буква I"
        println(
            "byte a = " + a
                    + ", short b = " + b
                    + ", int c = " + c
                    + ", long d = " + d
                    + ", float e = " + e
                    + ", double f = " + f
                    + ", boolean g = " + g
                    + ", char h = " + h
                    + ", String i = " + i
        )
        // Задание 3
        val scanner = Scanner(System.`in`)
        println("Введите слово или предложение:")
        val str = scanner.nextLine()
        val j = "Швера"
        val k = "Данила"
        val l = "техник-программист"
        val buffer = StringBuffer("Швера")
        println(
            ("Длинна строки - " + str.length
                    + "\nпроверка на пустоту строки - " + str.isEmpty()
                    + "\nпроверка на пустоту строки - " + str.isEmpty()
                    + "\nвывод символа строки по индексу - " + str[1]
                    + "\nпроверка на одинаковость строки с учётом регитсра - " + (str == k) + "\nпроверка на одинаковость строки - " + str.equals(
                k,
                ignoreCase = true
            )
                    + "\nпроверка, если строка начинается с указанного набора символов - " + str.startsWith("Hello", 2)
                    + "\nпроверка, если строка заканчивается указанным набором символов, - " + str.endsWith("word")
                    + "\nпроверка, если строка содержит в себе указанный набор символов, - " + str.contains("Швера")
                    + "\nдобавление к концу строки новую - " + str + ". Конец." + "\nзамена а на о - " + str.replace(
                'а',
                'о'
            )
                    + "\nвывод исходной строки в нижнем регистре - " + str.lowercase(Locale.getDefault())
                    + "\nвывод исходной строки в нижнем регистре - " + String.format(
                "Я %s %s, %s",
                j,
                k,
                l
            ) + "\nизменяемый вариант строки - " + buffer.append(" Данила."))
        )
    }
}//Задание выполнено

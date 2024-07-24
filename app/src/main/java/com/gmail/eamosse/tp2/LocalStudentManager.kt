package com.gmail.eamosse.tp2

import com.gmail.eamosse.tp2.EnumSexe.Sexe


abstract class LocalStudentManager : StudentManager {
    // TODO 1. Implement all methods so that the class is conformed to the interface
    // TODO 2: init the class with a list of 10 students every time a new instance is created;
    // Use the followi
    private val students = mutableListOf<Student>()

    init {
        students.addAll(
            listOf(
                Student(name = "John1", code = "A1", sexe = Sexe.M, address = "Lilles", age = 20),
                Student(name = "John2", code = "A2", sexe = Sexe.F, address = "Lilles", age = 30),
                Student(name = "John3", code = "A3", sexe = Sexe.F, address = "Lilles", age = 41),
                Student(name = "John4", code = "A4", sexe = Sexe.M, address = "Lilles", age = 42),
                Student(name = "John5", code = "A5", sexe = Sexe.M, address = "Lilles", age = 34),
                Student(name = "John6", code = "A6", sexe = Sexe.F, address = "Lilles", age = 12),
                Student(name = "John7", code = "A7", sexe = Sexe.M, address = "Lilles", age = 28),
                Student(name = "John8", code = "A8", sexe = Sexe.M, address = "Lilles", age = 16),
                Student(name = "John9", code = "A9", sexe = Sexe.F, address = "Lilles", age = 10),
                Student(name = "John10", code = "A10", sexe = Sexe.F, address = "Lilles", age = 56)
            )
        )


        fun listOf10(): List<Student> {
//        val students = mutableListOf<Student>()
//
//            students.addAll(listOf(
//            Student(name = "John1", code = "A1", sexe = "M", address = "Lilles", age = 20),
//            Student(name = "John2", code = "A2", sexe = "F", address = "Lilles", age = 30),
//            Student(name = "John3", code = "A3", sexe = "F", address = "Lilles", age = 41),
//            Student(name = "John4", code = "A4", sexe = "M", address = "Lilles", age = 42),
//            Student(name = "John5", code = "A5", sexe = "M", address = "Lilles", age = 34),
//            Student(name = "John6", code = "A6", sexe = "F", address = "Lilles", age = 12),
//            Student(name = "John7", code = "A7", sexe = "M", address = "Lilles", age = 28),
//            Student(name = "John8", code = "A8", sexe = "M", address = "Lilles", age = 16),
//            Student(name = "John9", code = "A9", sexe = "F", address = "Lilles", age = 10),
//            Student(name = "John10", code = "A10", sexe = "F", address = "Lilles", age = 56)
//        ))
            return students

        }

        fun sortAgeAscDesc(type: String): List<Student> {

            return when (type.lowercase()) {
                "asc" -> students.sortedBy { it.age }
                "desc" -> students.sortedByDescending { it.age }
                else -> {
                    students
                }
            }
        }

        fun groupBySex(): Map<String, List<Student>> {
            return students.groupBy { it.sexe.name }
        }

        fun boysOrGirls(sexe: String): List<Student> {
            val sexeEnum = when (sexe.lowercase()) {
                "m" -> Sexe.M
                "f" -> Sexe.F
                else -> throw IllegalArgumentException("Invalid sexe type. Use 'M' or 'F'.")
            }
            return students.filter { it.sexe == sexeEnum }
        }

        fun onlyNames(): List<String> {
            return students.map { it.name }
        }

        fun deleteBySex(sex: String) {
            val sexeEnum = when (sex.lowercase()) {
                "m" -> Sexe.M
                "f" -> Sexe.F
                else -> throw IllegalArgumentException("Invalid sexe type. Use 'M' or 'F'.")
            }
            students.removeAll { it.sexe == sexeEnum }
        }

        fun reverse(): List<Student> {
            return students.reversed()
        }

        fun clear() {
            students.clear()
        }


    }
}

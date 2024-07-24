package com.gmail.eamosse.tp2

import com.gmail.eamosse.tp2.EnumSexe.Sexe

data class Student (
    val name: String,
    val code: String,
    val sexe: Sexe,
    val address: String,
    val age: Int

//    constructor(name: String, code: Int, sexe: Sexe, adresse: String, age: Int ) {
//        this.name = name
//        this.code = code
//        this.sexe = sexe
//        this.adresse = adresse
//        this.age = age
//    }

    /*
    fun displayStudent() {
        println("Nom: $name")
        println("Code: $code")
        println("Sexe: $sexe")
        println("Adresse: $adresse")
        println("Âge: $age")
    }
     */

)
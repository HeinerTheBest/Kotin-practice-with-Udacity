package com.mobileapps.introtokotlin

class Employee(var person: Person,var employeId : String, var wage : Double ) : Person(person.firstName,person.lastName,person.age)
{
    constructor(firstName : String, lastName : String, age : Int, employeId: String,wage: Double) : this(Person(firstName,lastName,age),employeId,wage)

}
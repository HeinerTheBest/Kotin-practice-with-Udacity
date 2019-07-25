package com.mobileapps.introtokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val employeeList by lazy { createEmployeeList() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = EmployeeRecyclerViewAdapter(createEmployeeList())
        rvEmployee.layoutManager = LinearLayoutManager(this)
        rvEmployee.adapter       = adapter
    }



    private fun createEmployeeList() : ArrayList<Employee>
    {
        val returnList = ArrayList<Employee>()



        returnList.add(Employee(Person("Heiner","Bauza",31),"TheBest",999.00))//With second constructor
        returnList.add(Employee(Person("Spyder","Man",19),"SpyderMan",4.00))

        returnList.add(Employee("Iron","Man",42,"Iron",99999999999.00))  //With primary constructor

        val person = Person("Brittany","Toney",32)
        returnList.add(Employee(person,"moneyhunterb****",-500.00))


        return returnList
    }

}

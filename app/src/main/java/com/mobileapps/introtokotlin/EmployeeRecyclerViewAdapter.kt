package com.mobileapps.introtokotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.employee_item.view.*

class EmployeeRecyclerViewAdapter(val employeeList : ArrayList<Employee>) : RecyclerView.Adapter<EmployeeRecyclerViewAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.employee_item,parent,false))

    override fun getItemCount()= employeeList.size


    //Bad way
    /*override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val employee = employeeList[position]
        holder.tvFirstName.text  = employee.firstName
        holder.tvLastName.text   = employee.lastName
        holder.tvAge.text        = employee.age.toString()
        holder.tvEmployerId.text = employee.employeId
        holder.tvWage.text       = employee.wage.toString()
    }*/
    //Right Way
    override fun onBindViewHolder(holder: ViewHolder, position: Int)
         = holder.setValues(employeeList[position])

    //Bad Way
    /*class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val tvFirstName  = itemView.tvFirstName
        val tvLastName   = itemView.tvLastName
        val tvAge        = itemView.tvAge
        val tvEmployerId = itemView.tvEmployeeId
        val tvWage       = itemView.tvEmployeeWage
    }*/
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun setValues(employee : Employee)
        {
            itemView.tvFirstName.text  = employee.firstName
            itemView.tvLastName.text   = employee.lastName
            itemView.tvAge.text        = employee.age.toString()
            itemView.tvEmployeeId.text = employee.employeId
            itemView.tvEmployeeWage.text       = employee.wage.toString()
            //If we want to implement onClick Listenner
            itemView.setOnClickListener{ itemView
                .context
                .startActivity(Intent(it.context, MainActivity::class.java))}
        }
    }
}
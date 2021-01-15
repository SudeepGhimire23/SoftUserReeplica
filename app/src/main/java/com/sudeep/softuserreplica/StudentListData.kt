package com.sudeep.softuserreplica

import com.sudeep.softuserreplica.model.Student

class StudentListData private constructor(){
    var mylist =ArrayList<Student>()

    fun list(): ArrayList<Student>{
        return mylist
    }

    companion object {
        private val data = StudentListData()
        fun get(): StudentListData {
            return data
        }
    }
}
package com.sudeep.softuserreplica

import com.sudeep.softuserreplica.model.Student

interface Communicator {
    fun passData(lstStd: ArrayList<Student>)
}
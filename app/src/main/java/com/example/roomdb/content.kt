package com.example.roomdb

object content {
    private var dataList= ArrayList<dataModel>()
    fun getList():ArrayList<dataModel>{
        dataList.add(dataModel("Lovis","Sharma","22"))
        return dataList
    }
}
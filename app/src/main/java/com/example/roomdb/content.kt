package com.example.roomdb

object content {
    private var dataList= ArrayList<dataModel>()
    fun getList():ArrayList<dataModel>{
        dataList.add(dataModel("Lovis","Sharma","22"))
        return dataList
    }
    fun deleteListData(){
        dataList.clear()
    }
    fun addData(array:Array<String>?){
        dataList.add(dataModel(array!!.get(0),array.get(1),array.get(2)))
    }
}
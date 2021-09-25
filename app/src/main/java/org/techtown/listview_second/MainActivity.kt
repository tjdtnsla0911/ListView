package org.techtown.listview_second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_Item = mutableListOf<ListViewModel>()
        //for문으로 데이터 존나넣자
        for(i in 1..20){
            list_Item.add(ListViewModel(i.toString(),"텍스트2값dddddddddddddddddddddddddddddddddddd : "+i.toString()))
        }



        //ListView가져오는거
        val listView = findViewById<ListView>(R.id.mainListView)
        //어댑터를 위해
        val ListViewadapter = ListviewList(list_Item)
        
        //연결해버림
        listView.adapter = ListViewadapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Log.e("setOnItemClickListener ","l = "+l.toString())
            Toast.makeText(this,"선택하신것은 = "+list_Item[i],Toast.LENGTH_SHORT).show()
        }
        
    }
}
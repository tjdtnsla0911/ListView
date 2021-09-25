package org.techtown.listview_second

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

//ListView에 들어갈 Item들 + List
class ListviewList(var List : MutableList<ListViewModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(p0: Int): Any {
        return List[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        Log.e("##### getView","getView에옴")
        var convertView = p1
        if(convertView == null){
            Log.e("##### getView","getView if null 에옴")
            //inflate에서 맨처음에받는건 XmlPullParser or Int이다
            convertView = LayoutInflater.from(p2?.context).inflate(R.layout.listview_item,p2,false)
        }

        var title = convertView!!.findViewById<TextView>(R.id.listViewItemText)
        var title2 = convertView!!.findViewById<TextView>(R.id.listViewItemText2)

        Log.e("##### getView","title = "+title?.text)
        title.text = List[p0].text1
        title2.text = List[p0].text2

        return convertView!!
    }
}
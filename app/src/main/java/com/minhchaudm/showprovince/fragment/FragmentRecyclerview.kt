package com.minhchaudm.showprovince.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.minhchaudm.showprovince.R
import com.minhchaudm.showprovince.adapter.AdapterProvince
import com.minhchaudm.showprovince.model.Province
import io.realm.Realm
import io.realm.annotations.RealmClass
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.fragment_recyclerview.*
import kotlinx.android.synthetic.main.fragment_recyclerview.view.*
import kotlinx.android.synthetic.main.item_row.*

class FragmentRecyclerview: Fragment() {
    private lateinit var rootView: View
    private lateinit var arrayList: ArrayList<Province>
    //private lateinit var realm: Realm
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       // realm = Realm.getDefaultInstance()
        rootView = inflater.inflate(R.layout.fragment_recyclerview,container,false)
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rootView.recycler_view.setHasFixedSize(true)
        val layoutManager: LinearLayoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        rootView.recycler_view.layoutManager = layoutManager
        arrayList = ArrayList()
        arrayList.add(Province(R.drawable.imagequangngai,"Quang Ngai","",500))
        arrayList.add(Province(R.drawable.imagebinhdinh,"Binh Dinh","",500))
        arrayList.add(Province(R.drawable.imagethaibinh,"Thai Binh","",500))
        arrayList.add(Province(R.drawable.imagethanhhoa,"Thanh Hoa","",500))
        arrayList.add(Province(R.drawable.imagequangnam,"Quang Nam","",500))
        arrayList.add(Province(R.drawable.imagequangtri,"Quang Tri","",500))
        arrayList.add(Province(R.drawable.imagequangbinh,"Quang Binh","",500))
//        realm.beginTransaction()
//        realm.executeTransaction{
//            arrayList
//        }
//        realm.commitTransaction()

      //  var result = realm.where(Province::class.java).findAll()
        var adapter = AdapterProvince(rootView.context,arrayList)
        rootView.recycler_view.adapter = adapter
        changeColor()
        rootView.bt_about.setOnClickListener {
            Toast.makeText(rootView.context,"This is app show Province",Toast.LENGTH_LONG).show().toString()
        }


    }
    var changer: Boolean = false
    private fun setColor(){
        val res = resources
        val color: Int = res.getColor(R.color.recyclerview)
        recycler_view.setBackgroundColor(color)
        changer = true
    }
    fun changeColor(){
        rootView.bt_changerColor.setOnClickListener {
        if (!changer){
            setColor()
        }else{
            val res = resources
            val color: Int = res.getColor(R.color.colordefaultRecy)
            recycler_view.setBackgroundColor(color)
            changer=false
        }

        }
    }
    companion object{
        fun newInstance() = FragmentRecyclerview()
    }
}
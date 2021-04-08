package com.minhchaudm.showprovince.model

import io.realm.RealmObject
import io.realm.annotations.RealmClass


class Province(_image: Int,_name: String,_description: String,_population: Int) {
    private var image: Int
    private var name: String
    private var description: String
    private var population: Int

    init {
        this.image = _image
        this.name = _name
        this.description = _description
        this.population = _population
    }
    fun setImage(_image: Int){
        this.image = _image
    }
    fun getImage():Int{
        return this.image
    }
    fun setName(_name: String){
        this.name = _name
    }
    fun getName(): String{
        return this.name
    }
    fun setDescription(_description: String){
        this.description = _description
    }
    fun getDescription():String{
        return this.description
    }
    fun setPopulation(_population: Int){
        this.population = _population
    }
    fun getPopulation():Int{
        return this.population
    }
}
 package com.example.androidarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.androidarchitecture.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
     private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

     lateinit var viewModal: MainViewModal
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(binding.root)

//         lifecycle.addObserver(Observer())

         viewModal = ViewModelProvider(this).get(MainViewModal::class.java)
//         viewModal = ViewModelProvider(this, MainViewModalFactor(1)).get(MainViewModal::class.java)

         increase()

     }
     fun setText(){
         binding.textViewCount.text = viewModal.count.toString()
     }

     fun increase(){
         binding.buttonIncrement.setOnClickListener {

             viewModal.increment()
             setText()
         }
     }
 }
package com.selimcinar.twelvefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun firstFragment(view:View){
        //Fragman yöneticisi oluşturuldu
        val fragmentManager = supportFragmentManager
        //Fragmanla ilgili işlemler başlıyor
        val fragmentTransaction = fragmentManager.beginTransaction()
        //Boş fragmandan yeni obje oluştu
        val firstFragment = BlankFragment()
        //İlk fragmana geçiş kodu yazıldı
        fragmentTransaction.replace(R.id.frameLayout,firstFragment).commit()
        //add direkt üzerine ekler  diğer fragmanı silmez
        //replace diğerini kaldırır öyle ekler
    }
    fun secondFragment(view: View){
        val fragmentManager=supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = BlankFragment2()
        fragmentTransaction.replace(R.id.frameLayout,secondFragment).commit()
    }
}
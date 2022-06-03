package com.example.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*println("Hoşgeldiniz")
        //Run blocking işlemleri
        runBlocking {
            //Bu blok içinde artık bir coroutin başlatmış oluyoruz. Bir diğer başlatma işlemi ise launch metdounu kullanmaktır.
            launch {
                delay(5500)
                //Delay kullanmamızın sebebi işlemi uzun tutmak için. Yani şöyle
                //Normalde diyelim internetten veri çekiyoruz ve 5 saniye sürüyor. Şuan internetten veri çekmiyoruz ama simüle ediyoruz.
                println("Mr Selim, Hoşgeldiniz.")
            }

        }
        println("Güle Güle")
        Buraya kadar ki işlemde run blocking hem kendi kodunu hemde kendinden sonra ki kodu geciktirdiğini gördük.*/


        /*println("Welcome")
        GlobalScope.launch {
            delay(5500)
            println("Mr. Selim You are welcome")
        }
        println("bye bye")*/
        //Global scope kullandığımızda ise sadece kod bloğu içindeki kodu geciktirdi.


    }
}
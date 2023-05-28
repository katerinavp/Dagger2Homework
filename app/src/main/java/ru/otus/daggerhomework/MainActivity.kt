package ru.otus.daggerhomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var mainActivityComponent: MainActivityComponent.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (this.application as App).getAppComponent()
            .mainActivityComponent()
            .create(this@MainActivity)
            .inject(this)

        

//        (application as App).getAppComponent()
//            .inject(this)
//
//        mainActivityComponent
//            .activity(this)
//            .build()


    }
}
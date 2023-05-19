package ru.otus.daggerhomework.component

import android.app.Activity
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import ru.otus.daggerhomework.MainActivity
import javax.inject.Singleton

/**
 *
 */
//@FeatureScope
@Subcomponent(
    modules = [],
)
interface MainActivityComponent {

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun activity(context: Activity): Builder  //  прописываем те методы которые даггер должен прокинуть в билдерюб чтобы в рантайме прокидывать объекты какие либо в момент создания графа

        fun build(): MainActivityComponent
    }
}

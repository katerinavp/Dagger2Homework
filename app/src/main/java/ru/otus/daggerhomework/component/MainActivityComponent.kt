package ru.otus.daggerhomework.component

import android.app.Activity
import dagger.BindsInstance
import dagger.Module
import dagger.Subcomponent
import ru.otus.daggerhomework.MainActivity

/**
 *
 */
//@FeatureScope
@Subcomponent(
    modules = [MainActivityModule::class],
)
interface MainActivityComponent {

//    @Subcomponent.Builder
//    interface Builder {
//        @BindsInstance
//        fun activity(context: Activity): Builder  //  прописываем те методы которые даггер должен прокинуть в билдер чтобы в рантайме прокидывать объекты какие либо в момент создания графа
//
//        fun build(): MainActivityComponent
//    }

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance context: Activity): MainActivityComponent
    }

    fun inject(activity: MainActivity)
}

@Module
interface MainActivityModule{

}

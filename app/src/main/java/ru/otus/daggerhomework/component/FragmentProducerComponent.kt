package ru.otus.daggerhomework.component

import android.app.Activity
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import dagger.Subcomponent
import ru.otus.daggerhomework.ColorGenerator
import ru.otus.daggerhomework.ColorGeneratorImpl
import ru.otus.daggerhomework.FragmentProducer
import ru.otus.daggerhomework.ViewModelProducerFactory

/**
 *
 */
//@FeatureScope
@Subcomponent(
    modules = [FragmentProducerModule::class]
//    dependencies = [ApplicationComponent::class]
)

//@Singleton
interface FragmentProducerComponent {

    fun inject(fragmentProducer: FragmentProducer)

    //создаем фабрику вс абкомпоненте
    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance context: Activity): FragmentProducerComponent
    }

}

@Module
interface FragmentProducerModule {

    @Binds
    fun getColorGenerator(colorGenerator: ColorGeneratorImpl): ColorGenerator


    @Binds
    fun bindFactory(viewModelProducerFactory: ViewModelProducerFactory): ViewModelProvider.Factory
}
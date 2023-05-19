package ru.otus.daggerhomework.component

import android.app.Activity
import android.content.Context
import dagger.BindsInstance
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import ru.otus.daggerhomework.ColorGenerator
import ru.otus.daggerhomework.ColorGeneratorImpl
import ru.otus.daggerhomework.FragmentProducer
import javax.inject.Singleton

/**
 *
 */
//@FeatureScope
@Subcomponent(
    modules = [FragmentProducerModule::class],
//    dependencies = [ApplicationComponent::class]
)

//@Singleton
interface FragmentProducerComponent {

    fun inject(fragmentProducer: FragmentProducer)

    //создаем фабрику вс абкомпоненте
    @Subcomponent.Factory
    interface Factory {
        fun create(
        ): FragmentProducerComponent
    }

}

@Module
class FragmentProducerModule {

    @Provides
    fun getColorGenerator(): ColorGenerator {
        return ColorGeneratorImpl()
    }
}
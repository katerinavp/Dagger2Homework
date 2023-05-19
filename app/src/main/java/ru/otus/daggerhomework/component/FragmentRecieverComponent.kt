package ru.otus.daggerhomework.component

import android.content.Context
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Subcomponent
import ru.otus.daggerhomework.ColorGenerator
import ru.otus.daggerhomework.FragmentProducer
import ru.otus.daggerhomework.FragmentReceiver
import ru.otus.daggerhomework.ViewModelProducer
import ru.otus.daggerhomework.ViewModelProducerFactory
import ru.otus.daggerhomework.ViewModelReceiverFactory

import javax.inject.Singleton

/**
 *
 */
@Subcomponent(
    modules = [FragmentReceiverModule::class],
//    dependencies = [ApplicationComponent::class]
)

//@Singleton
interface FragmentRecieverComponent {

    //    fun inject(fragmentProducer: FragmentProducer)
    //создаем фабрику вс абкомпоненте
    @Subcomponent.Factory
    interface Factory {
        fun create(): FragmentRecieverComponent
    }

    fun inject(fragmentProducer: FragmentReceiver)

}

@Module
interface FragmentReceiverModule {
}
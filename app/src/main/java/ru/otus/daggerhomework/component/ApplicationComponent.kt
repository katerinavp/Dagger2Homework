package ru.otus.daggerhomework.component

import android.content.Context

import dagger.BindsInstance
import dagger.Component
import dagger.Module
import ru.otus.daggerhomework.MainActivity
import javax.inject.Singleton

/**
 * Основной компонент dagger 2 для инъекции зависимостей
 */


@Singleton
@Component(modules = [SubcomponentModule::class])
interface ApplicationComponent {

//    fun mainActivity(): MainActivityComponent.Builder

    fun mainActivityComponent(): MainActivityComponent.Factory
    fun fragmentProducerComponent(): FragmentProducerComponent.Factory
    fun fragmentRecieverComponent(): FragmentRecieverComponent.Factory

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder  //  прописываем те методы которые даггер должен прокинуть в билдер, чтобы в рантайме прокидывать объекты какие либо в момент создания графа

        fun build(): ApplicationComponent
    }

    fun inject(mainActivity: MainActivity)
}


@Module(subcomponents = [FragmentProducerComponent::class, FragmentRecieverComponent::class])
interface SubcomponentModule


package ru.otus.daggerhomework.component

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import dagger.Subcomponent
import ru.otus.daggerhomework.FragmentReceiver
import ru.otus.daggerhomework.ViewModelReceiverFactory
import javax.inject.Named

/**
 *
 */
@Subcomponent(
    modules = [FragmentReceiverModule::class],
//    dependencies = [ApplicationComponent::class]
)

//@Singleton
interface FragmentRecieverComponent {

    //fun inject(fragmentProducer: FragmentProducer)
    //создаем фабрику в сабкомпоненте
    @Subcomponent.Factory
    interface Factory {
        fun create(@Named("appContext") @BindsInstance context: Context): FragmentRecieverComponent
    }

    fun inject(fragmentProducer: FragmentReceiver)

}

@Module
interface FragmentReceiverModule {
    @Binds
    fun bindFactory(viewModelReceiverFactory: ViewModelReceiverFactory): ViewModelProvider.Factory
}
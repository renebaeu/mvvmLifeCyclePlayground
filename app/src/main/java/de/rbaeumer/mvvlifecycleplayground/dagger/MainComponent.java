package de.rbaeumer.mvvlifecycleplayground.dagger;

import javax.inject.Singleton;

import dagger.Component;
import de.rbaeumer.mvvlifecycleplayground.MyFragment;

@Singleton
@Component(modules = {
MainModule.class
})

public
interface MainComponent {

    void inject( MyFragment myFragment);
}

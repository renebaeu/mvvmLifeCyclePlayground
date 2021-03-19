package de.rbaeumer.mvvlifecycleplayground.dagger

import androidx.fragment.app.FragmentActivity
import java.lang.NullPointerException

object DaggerReferenceContainer {

    var component: MainComponent? = null

    fun initDi(activity: FragmentActivity) {
            component = DaggerMainComponent.builder()
                .mainModule(MainModule(activity))
                .build()
    }
}
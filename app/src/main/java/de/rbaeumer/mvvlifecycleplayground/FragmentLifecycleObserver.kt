package de.rbaeumer.mvvlifecycleplayground

import android.os.Bundle
import androidx.annotation.CallSuper

interface FragmentLifecycleObserver {

    fun onCreate(arguments: Bundle?, savedInstanceState: Bundle?) {}
    fun onCreateView(arguments: Bundle?, savedInstanceState: Bundle?){}
    fun onViewCreated(arguments: Bundle?, savedInstanceState: Bundle?){}
    fun onStart(){}
    fun onResume(){}
    fun onPause(){}
    fun onStop(){}
    fun onDestroyView(){}
    fun onDestroy(){}
    fun onSaveInstanceState(outState: Bundle) {}

}

package de.rbaeumer.mvvlifecycleplayground

import android.os.Bundle

class FragmentLifecycleManager {

    private val fragmentLifecycleObservers = mutableListOf<FragmentLifecycleObserver>()

    fun add(observer: FragmentLifecycleObserver) {
        fragmentLifecycleObservers.add(observer)
    }

    fun remove(observer: FragmentLifecycleObserver) {
        fragmentLifecycleObservers.remove(observer)
    }

    fun onCreate(arguments: Bundle?, savedInstanceState: Bundle?) {
        fragmentLifecycleObservers.forEach{
            it.onCreate(arguments, savedInstanceState)
        }
    }

    fun onCreateView(arguments: Bundle?, savedInstanceState: Bundle?) {
        fragmentLifecycleObservers.forEach{
            it.onCreateView(arguments, savedInstanceState)
        }
    }

    fun onViewCreated(arguments: Bundle?, savedInstanceState: Bundle?) {
        fragmentLifecycleObservers.forEach { it.onViewCreated(arguments, savedInstanceState) }
    }

    fun onStart() {
        fragmentLifecycleObservers.forEach { it.onStart() }
    }

    fun onResume() {
        fragmentLifecycleObservers.forEach { it.onResume() }
    }

    fun onPause() {
        fragmentLifecycleObservers.forEach { it.onPause() }
    }
    fun onStop() {
        fragmentLifecycleObservers.forEach { it.onStop() }
    }

    fun onDestroyView() {
        fragmentLifecycleObservers.forEach { it.onDestroyView() }
    }

    fun onDestroy() {
        fragmentLifecycleObservers.forEach { it.onDestroy() }
        fragmentLifecycleObservers.clear()
    }

    fun clear() {
        fragmentLifecycleObservers.clear()
    }

    fun onSaveInstanceState(outState: Bundle) {
        fragmentLifecycleObservers.forEach { it.onSaveInstanceState(outState) }
    }

}
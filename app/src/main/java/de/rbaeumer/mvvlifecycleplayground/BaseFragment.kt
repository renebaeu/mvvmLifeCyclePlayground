package de.rbaeumer.mvvlifecycleplayground

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {

    private val fragmentLifecycleManager = FragmentLifecycleManager()

    fun addFragmentLifeCycleObserver(observer: FragmentLifecycleObserver) {
        fragmentLifecycleManager.add(observer)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        fragmentLifecycleManager.onCreate(arguments, savedInstanceState)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        fragmentLifecycleManager.onCreateView(arguments, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentLifecycleManager.onViewCreated(arguments, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        fragmentLifecycleManager.onStart()
    }

    override fun onResume() {
        super.onResume()
        fragmentLifecycleManager.onResume()
    }

    override fun onPause() {
        fragmentLifecycleManager.onPause()
        super.onPause()
    }

    override fun onStop() {
        fragmentLifecycleManager.onStop()
        super.onStop()
    }

    override fun onDestroyView() {
        fragmentLifecycleManager.onDestroyView()
        super.onDestroyView()
    }

    override fun onDestroy() {
        fragmentLifecycleManager.onDestroy()
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        fragmentLifecycleManager.onSaveInstanceState(outState)
        super.onSaveInstanceState(outState)
    }

}
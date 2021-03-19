package de.rbaeumer.mvvlifecycleplayground

import android.os.Bundle
import javax.inject.Inject

class ViewController @Inject constructor(val viewModel: MainViewModel) : FragmentLifecycleObserver {

    override fun onCreate(arguments: Bundle?, savedInstanceState: Bundle?) {
        listOfNotNull(savedInstanceState, arguments)
            .firstOrNull()
            ?.let{
            it.getString(MyFragment.TEST_STRING_BUNDLE_KEY)
                ?.let { _string ->
                    viewModel.text.set(_string)
                }
            }
    }

    override fun onCreateView(arguments: Bundle?, savedInstanceState: Bundle?) {

    }

    override fun onViewCreated(arguments: Bundle?, savedInstanceState: Bundle?) {

    }

    override fun onStart() {

    }

    override fun onResume() {

    }

    override fun onPause() {

    }

    override fun onStop() {

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(MyFragment.TEST_STRING_BUNDLE_KEY, viewModel.text.get())
    }

    override fun onDestroyView() {

    }

    override fun onDestroy() {

    }



}

package de.rbaeumer.mvvlifecycleplayground

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import de.rbaeumer.mvvlifecycleplayground.dagger.DaggerReferenceContainer
import de.rbaeumer.mvvlifecycleplayground.databinding.MainFragmentBinding
import javax.inject.Inject

class MyFragment : BaseFragment() {

    @Inject
    lateinit var controller: ViewController

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerReferenceContainer.component?.inject(this)
        addFragmentLifeCycleObserver(controller)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return MainFragmentBinding.inflate(inflater)
            .also { it.controller = controller }
            .root
    }


    companion object {
        const val TEST_STRING_BUNDLE_KEY = "TEST_STRING_BUNDLE_KEY"
    }
}
package de.rbaeumer.mvvlifecycleplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.rbaeumer.mvvlifecycleplayground.dagger.DaggerReferenceContainer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerReferenceContainer.initDi(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (savedInstanceState == null) {

            val myFragment = MyFragment()
                .also {
                    it.arguments = Bundle()
                        .also { _bundle ->
                            _bundle.putString(MyFragment.TEST_STRING_BUNDLE_KEY, "Initialer Test String")
                        }
                }

            supportFragmentManager.beginTransaction()
                .replace(R.id.container, myFragment)
                .commitNow()
        }

    }
}
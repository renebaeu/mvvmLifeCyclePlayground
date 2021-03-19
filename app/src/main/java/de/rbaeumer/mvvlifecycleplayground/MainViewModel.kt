package de.rbaeumer.mvvlifecycleplayground

import androidx.databinding.ObservableField
import androidx.lifecycle.*
import javax.inject.Inject
import kotlin.random.Random

class MainViewModel @Inject constructor() {
    val text = ObservableField<String>()
}
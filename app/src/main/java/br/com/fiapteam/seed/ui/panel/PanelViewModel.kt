package br.com.fiapteam.seed.ui.panel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PanelViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is panel Fragment"
    }
    val text: LiveData<String> = _text
}
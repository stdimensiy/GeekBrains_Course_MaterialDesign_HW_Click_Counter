package ru.vdv.myapp.clickcounter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.vdv.myapp.clickcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var _vb: ActivityMainBinding? = null
    private val vb get() = _vb!!
    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)

        vb.btnCounter1.setOnClickListener { presenter.counterOneClick() }
        vb.btnCounter2.setOnClickListener { presenter.counterTwoClick() }
        vb.btnCounter3.setOnClickListener { presenter.counterThreeClick() }
    }

    override fun setButtonOneText(text: String) {
        vb.btnCounter1.text = text
    }

    override fun setButtonTwoText(text: String) {
        vb.btnCounter2.text = text
    }

    override fun setButtonThreeText(text: String) {
        vb.btnCounter3.text = text
    }
}
package com.example.business.friedrich.kuzan.kotlinmoxy

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter

class MainActivity : MvpAppCompatActivity(), IHelloWorldView {

    @InjectPresenter
    lateinit var mPresenter: HelloWorldPresenter

    lateinit var mText: TextView
    lateinit var mButton: Button

    override fun showMessage(message: Int) {
        mText.setText(message)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mText = findViewById(R.id.text)
        mButton = findViewById(R.id.button)
        mButton.setOnClickListener {
            mPresenter.show()
        }
    }
}

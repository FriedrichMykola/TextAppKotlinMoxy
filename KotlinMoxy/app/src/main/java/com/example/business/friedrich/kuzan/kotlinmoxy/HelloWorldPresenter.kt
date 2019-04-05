package com.example.business.friedrich.kuzan.kotlinmoxy

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter

@InjectViewState
class HelloWorldPresenter : MvpPresenter<IHelloWorldView>() {
    fun show() = viewState.showMessage(R.string.message)
}
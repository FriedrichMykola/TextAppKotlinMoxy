package com.example.business.friedrich.kuzan.kotlinmoxy

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(value = AddToEndStrategy::class)
interface IHelloWorldView : MvpView {
    fun showMessage(message: Int)
}
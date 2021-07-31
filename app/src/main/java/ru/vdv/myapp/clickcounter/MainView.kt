package ru.vdv.myapp.clickcounter

interface MainView {
    fun setButtonText(index: Int, text: String)
    fun setButtonOneText(text: String)
    fun setButtonTwoText(text: String)
    fun setButtonThreeText(text: String)
}
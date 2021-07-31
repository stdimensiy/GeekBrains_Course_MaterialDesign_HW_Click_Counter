package ru.vdv.myapp.clickcounter

import moxy.MvpPresenter

class MainPresenter(private val model: Model) : MvpPresenter<MainView>() {

    /**
     * Метод слоя Presenter
     * командует модели изменить значение счетчика (по индексу счетчика)
     * командует view методом setButtonOneText отобразить новые данные на текст кнопки.
     */
    fun counterOneClick() {
        val nextValue = model.next(0)
        viewState.setButtonOneText(nextValue.toString())
    }

    /**
     * Метод слоя Presenter
     * командует модели изменить значение счетчика (по индексу счетчика)
     * командует view методом setButtonTwoText отобразить новые данные на текст кнопки.
     */
    fun counterTwoClick() {
        val nextValue = model.next(1)
        viewState.setButtonTwoText(nextValue.toString())
    }

    /**
     * Метод слоя Presenter
     * командует модели изменить значение счетчика (по индексу счетчика)
     * командует view методом setButtonThreeText отобразить новые данные на текст кнопки.
     */
    fun counterThreeClick() {
        val nextValue = model.next(2)
        viewState.setButtonThreeText(nextValue.toString())
    }
}
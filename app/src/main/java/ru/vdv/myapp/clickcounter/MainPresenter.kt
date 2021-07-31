package ru.vdv.myapp.clickcounter

class MainPresenter(private val view: MainView) {
    private val model = Model()

    /**
     * Метод слоя Presenter
     * командует модели изменить значение счетчика (по индексу счетчика)
     * командует view методом setButtonOneText отобразить новые данные на текст кнопки.
     */
    fun counterOneClick() {
        val nextValue = model.next(0)
        view.setButtonOneText(nextValue.toString())
    }

    /**
     * Метод слоя Presenter
     * командует модели изменить значение счетчика (по индексу счетчика)
     * командует view методом setButtonTwoText отобразить новые данные на текст кнопки.
     */
    fun counterTwoClick() {
        val nextValue = model.next(1)
        view.setButtonTwoText(nextValue.toString())
    }

    /**
     * Метод слоя Presenter
     * командует модели изменить значение счетчика (по индексу счетчика)
     * командует view методом setButtonThreeText отобразить новые данные на текст кнопки.
     */
    fun counterThreeClick() {
        val nextValue = model.next(2)
        view.setButtonThreeText(nextValue.toString())
    }
}
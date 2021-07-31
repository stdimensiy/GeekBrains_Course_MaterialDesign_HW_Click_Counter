package ru.vdv.myapp.clickcounter

class MainPresenter(val view: MainView) {
    val model = Model()

    fun counterClick(id: Int) {
        when (id) {
            R.id.btn_counter1 -> {
                val nextValue = model.next(0)
                view.setButtonOneText(nextValue.toString())
            }
            R.id.btn_counter2 -> {
                val nextValue = model.next(1)
                view.setButtonTwoText(nextValue.toString())
            }
            R.id.btn_counter3 -> {
                val nextValue = model.next(2)
                view.setButtonThreeText(nextValue.toString())
            }
        }
    }

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
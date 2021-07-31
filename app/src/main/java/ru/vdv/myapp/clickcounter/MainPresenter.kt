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
}
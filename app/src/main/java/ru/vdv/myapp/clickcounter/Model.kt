package ru.vdv.myapp.clickcounter

class Model {
    val counters = mutableListOf<Int>(0, 0, 0)

    /**
     * Метод возвращает текущее значение счетчика
     * @param index (Int) идентификатор счетчика (индекс позиции счетчика в коллекции)
     * @return текущее значение счетчика (Int)
     */
    fun getCurrent(index: Int): Int {
        return counters[index]
    }

    /**
     * Метод присваивает счетчику новое (следующее) значение
     * @param index (Int) идентификатор счетчика (индекс позиции счетчика в коллекции)
     * @return новое значение счетчика (Int)
     */
    fun next(index: Int): Int {
        counters[index]++
        return getCurrent(index)
    }

    /**
     * Метод устанавливает значение счетчика равным передаваемому параметру
     * @param index (Int) идентификатор счетчика (индекс позиции счетчика в коллекции)
     * @param value (Int) устанавливаемое значение счетчика
     */
    fun set(index: Int, value: Int) {
        counters[index] = value
    }
}
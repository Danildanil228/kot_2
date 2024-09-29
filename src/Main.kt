import kotlin.random.Random
fun Array():IntArray {
    return IntArray(31) {Random.nextInt(10000, 100000)}
}
fun main() {
    val ranArray = Array()
    println("Введите s (не меньше 10.000)")
    val s = readLine()?.toInt() ?:0
    val count = ranArray.count { it > s }
    println("Количество дней когда стоимость больше $s: $count")
    println("Сгенерированный массив "+ranArray.joinToString(", "))

}
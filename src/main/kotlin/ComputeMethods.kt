import java.util.Random
import kotlin.math.sqrt

class ComputeMethods() {
    fun fToC(degreeF: Double): Double {
        var tempC = (5.0 / 9.0) * (degreeF - 32)

        return tempC
    }

    fun hypotenuse(a: Int, b: Int): Double {
        val c: Double = sqrt((a * a + b * b).toDouble())

        return c
    }

    fun roll(): Int {
        val dice1 = Random().nextInt(1, 6)
        val dice2 = Random().nextInt(1, 6)
        val dice: Int = dice1 + dice2

        return dice
    }
}
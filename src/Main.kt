import java.util.Scanner
import kotlin.math.abs

fun main() {
    val scanner = Scanner(System.`in`)

    val firstQueenPosition = Array(2) { scanner.nextInt() }
    val secondQueenPosition = Array(2) { scanner.nextInt() }
    // First value in arrays is X axis, second is Y.
    if (
        firstQueenPosition[0] == secondQueenPosition[0] ||
        firstQueenPosition[1] == secondQueenPosition[1] ||
        (abs(firstQueenPosition[0] - secondQueenPosition[0]) == abs(firstQueenPosition[1] - secondQueenPosition[1]))) {
        println("YES")
    } else {
        println("NO")
    }
}

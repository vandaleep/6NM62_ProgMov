import kotlin.math.pow;
import kotlin.math.sqrt;

fun main() {
	var a = 1.0
	var b = 5.0
	var c = 6.0
	
	val x1 = (-b+sqrt(b.pow(2)-4*a*c)) / (2*a);
	val x2 = (-b-sqrt(b.pow(2)-4*a*c)) / (2*a);
	
	println(x1);
	println(x2);
}

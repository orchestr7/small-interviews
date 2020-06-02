// functional style
case class Employee(val name: String, val surname: String, val sentDailyReport: Boolean, val averageMark: Double)

object Main extends App {
    // find 10 employees that sent daily reports and have averageMark more than 4.0
    // a) in alphabetical order
    // b) save initial order
	
    val list = List(Employee("name", "surname", true, 2.5))
    println(list)
}

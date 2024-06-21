

object DataStructures{
  def main(args: Array[String]): Unit = {
    val fruits: List[String] = List("apple","oranges","watermelon","grapes","guava")
    println(fruits.head)
    println(fruits.last)

    //Empty list declaration

    val emptyList: List[Nothing] = List()
    println(emptyList)

    //List decalration
    val List2 = 10::20::30::40::Nil

    //Create a list buffer
    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities += "Trivandram"
    cities += ("BBSR","Pune")
    cities += ("Random")
    cities -= "Trivandram"

    println(cities)
    cities.toList
    print(cities)

    //Array Datatype
  // fruits.foreach(println)
    println(fruits.mkString(","))

    //decalre an empty array
    val arr_1 = new Array[String](10)
    val arr_2 = Array.ofDim[Int](2,2)

    arr_2(0)(0) = 213
    arr_2(0)(1) = 125
    arr_2(1)(0) = 911
    arr_2(1)(1) = 213

    //set

    val set_1 : Set[String] = Set()
    val tuple_2 = (1,3)

    val myMap = Map("x" -> 24, "y" -> 25, "z" -> 26)
    println(myMap("x"))

    lazy val temp:Int = 100
    println(temp)
  }
}

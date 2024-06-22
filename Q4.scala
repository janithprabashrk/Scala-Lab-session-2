object MovieTheaterProfit {
  def main(args: Array[String]): Unit = {

    val basePrice = 15
    val baseAttendance = 120
    val priceChange = 5
    val attendanceChange = 20
    val fixedCost = 500
    val attendanceCost = 3

    def attendees(price: Int): Int = baseAttendance + (basePrice - price) / priceChange * attendanceChange

    def revenue(price: Int): Int = attendees(price) * price

    def cost(price: Int): Int = fixedCost + attendees(price) * attendanceCost

    def profit(price: Int): Int = revenue(price) - cost(price)

    var bestPrice = basePrice
    var maxProfit = profit(basePrice)

    for (price <- 5 to 25 by 5) {
      val currentProfit = profit(price)
      if (currentProfit > maxProfit) {
        bestPrice = price
        maxProfit = currentProfit
      }
    }

    println("The best ticket price is Rs : " +bestPrice + "with a maximum profit of Rs : " + maxProfit)
  }
}

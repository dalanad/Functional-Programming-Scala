/* 
1. The temperature is 35C; convert this temperature into Fahrenheit.
ºF = ºC * 1.8000 + 32.00
*/
def celsiusToFahrenheit(x:Double) : Double = x * 1.8000 + 32.00
println("Temprature In Fahrenheit := " + celsiusToFahrenheit(35))

/* 
2.The volume of a sphere with radius r is 4/3 Pi r3.
  What is the volume of a sphere with radius 5?
*/
def volumeOfSphere(r:Float) : Float = (4/3)  * (22/7) * r * r * r
println("Volume Of Sphere of radius 5 :="+ volumeOfSphere(5))

/*
3. Suppose the cover price of a book is Rs. 24.95, but bookstores get a 40% discount. 
Shipping costs Rs. 3 for the first 50 copy and 75 cents for each additional copy. 
What is the total wholesale cost for 60 copies?
*/
def totalWholesaleCost( price:Double, copies:Int) : Double = {
    val priceAfterDiscount = (( price / 100 ) * 60) * copies
    val baseShippingCost = 3.00
    if(copies > 50){
        priceAfterDiscount + baseShippingCost + (copies - 50) * 0.75
    } else {
        priceAfterDiscount + baseShippingCost
    }
}
println("Total wholesale cost for 60 copies :- " + totalWholesaleCost(24.95 , 60))

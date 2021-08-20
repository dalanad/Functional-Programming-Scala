// 19000332
object FunctionsAndData extends App {
  // Question 01 / 02
  class Rational(x: Int, y: Int) {
    def numerator  = x
    def denominator = y

    def neg = new Rational(-this.numerator , this.denominator)

    def +(r: Rational) =
        new Rational(this.numerator  * r.denominator + r.numerator  * this.denominator, denominator * r.denominator)

    def -(r: Rational) = this + r.neg
  }

  print("Negative of 1/2 =  ")
  val number = new Rational(1, 2)
  val minus = number.neg
  println(minus.numerator+"/"+minus.denominator)

  print("Substraction: x - y - z =  ")
  val x = new Rational(3, 4)
  val y = new Rational(5, 4)
  val z = new Rational(2, 7)
  println((x - y - z).numerator +"/"+(x - y - z).denominator )

  // Question 03
  class Account(n: Int, b: Double) {
    val ac_no: Int = n
    var bal: Double = b
    override def toString =  ac_no + "=> Rs. " + bal 
    def withdraw(a: Double) = { this.bal = this.bal - a }
    def deposit(a: Double) = { this.bal = this.bal + a }
    def transfer(a: Account, b: Double) = { this.withdraw(b); a.deposit(b) }
    def addInterest(): Double = {
      if (this.bal > 0) {
        return bal * 1.05
      } else {
        return bal * 1.1
      }
    }
  }

  val AC_A = new Account( 345524, 5000)
  val AC_B = new Account( 234553, 2000)

  println("Current Balance")
  println(AC_A)
  println(AC_B)
  println("Transferring Rs. 1500 from AC "+AC_A.ac_no +" to "+AC_B.ac_no)
  AC_A.transfer(AC_B, 1500)
  println(AC_A)
  println(AC_B)

// Question 04
  var bank: List[Account] = List(
    new Account( 1, -3500),
    new Account( 2, -3200),
    new Account( 3, -7500),
    new Account( 4, 100),
    new Account( 5, 94500)
  )

  val overdraft = (b: List[Account]) => b.filter(x => x.bal < 0)

  val bal = (b: List[Account]) =>
    b.map(x => x.bal).reduce((x, y) => x + y)

  val interest = (b: List[Account]) => b.map(x => x.addInterest())

  println("Negative Balances = Rs. " + overdraft(bank))
  println("Sum of all accounts = Rs. " + bal(bank))
  println("Balances with interst = Rs. "+interest(bank))
}

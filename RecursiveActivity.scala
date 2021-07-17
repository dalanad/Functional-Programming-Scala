object RecursiveActivity extends App {
  /* QUESTION 01 */
  def prime(x: Int, i: Int = 2): Boolean = x match {
    case x if x <= 2     => if (x == 2) true else false
    case x if x % i == 0 => false
    case x if i * i > x  => true
    case _               => prime(x, i + 1)
  }
  println("\nQ1 - prime")
  println("prime(5) = " + prime(5))
  println("prime(8) = " + prime(8))

  /* QUESTION 2 */
  def primeSeq(n: Int): Unit = n match {
    case 0 => {}
    case _ => {
      primeSeq(n - 1)
      if (prime(n)) { print(n + ", ") };
    }
  }
  println("\nQ2 - primeSeq")
  print("primeSeq(10) = ")
  primeSeq(10)
  print("\nprimeSeq(30) = ")
  primeSeq(30)

  /* QUESTION 3 */
  def sum(n: Int): Int = n match {
    case 1 => 1;
    case _ => n + sum(n - 1);
  }
  println("\n\nQ3 - sum")
  println("sum(5) = " + sum(5))

  /* QUESTION 4 */
  def is_even(n: Int): Boolean = n match {
    case 0 => true
    case _ => is_odd(n - 1)
  }

  def is_odd(n: Int): Boolean = !(is_even(n));

  println("\nQ4 - odd / even");
  println("is_even(10) = " + is_even(10));
  println("is_even(9) = " + is_even(9));
  println("is_odd(7) = " + is_odd(7));
  println("is_odd(4) = " + is_odd(4));

  /* QUESTION 5 */
  def even_sum(n: Int): Int = n match {
    case 1               => 1;
    case 0               => 0;
    case n if n % 2 == 1 => even_sum(n + 1)
    case _               => n - 2 + even_sum(n - 2)
  }
  println("\nQ5 - even_sum")
  println("even_sum(9) = " + even_sum(9))
  println("even_sum(10) = " + even_sum(10))

  /* QUESTION 6 */
  def fib(n: Int): Int = n match {
    case 0 => 0;
    case 1 => 1;
    case n => fib(n - 1) + fib(n - 2);
  }

  def fib_sequence(num: Int): Unit = {
    if (num > 0) fib_sequence(num - 1)
    print(fib(num) + ", ")
  }

  println("\nQ6 - fibonacci sequence")
  println("fib_sequence(15) = ")
  fib_sequence(15)
  println()

}

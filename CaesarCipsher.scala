object CaesarCipher extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val shift = 3

  def encrypt(str: String): String = {
    str
      .toCharArray()
      .map(c => c.toUpper)
      .map(c => {
        val x = alphabet.indexOf(c)
        if (x == -1) c else alphabet((x + shift) % alphabet.size) 
      })
      .mkString("")
  }

  def decrypt(str: String): String = {
    str
      .toCharArray()
      .map(c => c.toUpper)
      .map(c => {
        val x = alphabet.indexOf(c)
        if (x == -1)  c else alphabet(wrap(x - shift))           
      })
      .mkString("")
  }


  def wrap(n : Int ) = {
      if (n >= 0)
          n % alphabet.size;
      else
          (alphabet.size + n).abs % alphabet.size;
  }

  var en = encrypt("DALANA PASINDU DHARMATHILAKE")
  println("encrypt('DALANA PASINDU DHARMATHILAKE') = " + en)
  println("decrypt('" + en + "') = " + decrypt(en))

}

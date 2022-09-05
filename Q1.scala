object Q1 extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXZ"

  val Encrpyt = (character: Char, key: Int, a: String) =>
    a((a.indexOf(character.toUpper) + key) % a.size)
  val Decrpyt = (character: Char, key: Int, a: String) =>
    a((a.indexOf(character.toUpper) - key) % a.size)
  val cipher =
    (algo: (Char, Int, String) => Char, s: String, key: Int, a: String) =>
      s.map(algo(_, key, a))

  val ct = cipher(Encrpyt, "A", 5, alphabet)
  println(ct)

  val pt = cipher(Decrpyt, ct, 5, alphabet)
  println(pt)

}

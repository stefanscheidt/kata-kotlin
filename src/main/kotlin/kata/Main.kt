package kata

fun main(args: Array<String>) {
  val greeting = if (args.isEmpty()) hello() else hello(args.joinToString())
  println(greeting)
}

fun hello(name: String = "World"): String = "Hello, $name!"

import java.text.SimpleDateFormat
import java.util.Calendar

import scala.annotation.tailrec

def Fib(n: Int) : Int = {
  if(n == 0) 0
  else if (n == 1) 1
  else
    return Fib(n - 1) + Fib(n - 2)
}
println(Calendar.getInstance.getTime)
Fib(50)
println(Calendar.getInstance.getTime)
def fib3( n : Int) : Int = {

  @tailrec
  def fib_tail( n: Int, a:Int, b:Int): Int = n match {
    case 0 => a
    case _ => fib_tail( n-1, b, a+b )
  }
  return fib_tail( n, 0, 1)
}
println(Calendar.getInstance.getTime)
fib3(50)
println(Calendar.getInstance.getTime)
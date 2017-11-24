import scala.annotation.tailrec

def factorial(n: BigDecimal): BigDecimal = if (n == 0) 1 else n * factorial(n - 1)
factorial(6000)

//@tailrec
def factorialNonTail(n: BigDecimal): BigDecimal = {
  if(n != 0) n * factorialNonTail(n - 1)
  else 1
};

factorialNonTail(6000)
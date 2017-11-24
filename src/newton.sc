def abs(x: Double) = if (x > 0) x else -x

def isGoodEnough(guess: Double, x: Double) = abs(guess * guess - x) / x < 0.0000001

def improve(guess: Double, x: Double) = (guess + x / guess) / 2

def newtonsMethod(guess: Double, x: Double): Double = {
  def tailFuncWithPattern(isge : Boolean) : Double = isge match{
    case true =>  guess
    case false => newtonsMethod(improve(guess, x), x)
  }

//  val tailFuncWithPattern: PartialFunction[Boolean, Double] = {
//    case true => guess
//    case false => newtonsMethod(improve(guess, x), x)
//  }


  return tailFuncWithPattern(isGoodEnough(guess, x))
}

def squareRoot(x: Double): Double = newtonsMethod(1, x)

//tests
print(squareRoot(1e-10) + "\n")
print(squareRoot(15625) + "\n")
print(squareRoot(1e55) + "\n")
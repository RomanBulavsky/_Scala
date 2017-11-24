//vs

trait Expr
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr

//object Number {
//  def apply(n: Int) = new Number(n)
//}

object Sum {
  def apply(e1: Expr, e2: Expr) = new Sum(e1, e2)
}

def eval(e: Expr): Int = e match { // see match
  case Number(n) => n
  case Sum(e1, e2) => eval(e1) + eval(e2)
}

var z = eval(Number(12))

/*trait Expr {
  def isNumber: Boolean
  def isSum: Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr
}

class Number(n: Int) extends Expr {
  def isNumber: Boolean = true
  def isNum: Boolean = false
  def numValue: Int = n
  def leftOp: Expr = throw new Error("Number.leftOp")
  def rightOp: Expr = throw new Error("Number.rightOp")

  override def isSum = ???
}

class Sum(e1: Expr, e2: Expr) extends Expr {
  def isNumber: Boolean = false
  def isSum: Boolean = true
  def numValue: Int = throw new Error("Sum.numValue")
  def leftOp: Expr = e1
  def rightOp: Expr = e2
}

def eval(e: Expr): Int = {
  if (e.isNumber) e.numValue
  else if (e.isSum) eval(e.leftOp) + eval(e.rightOp)
  else throw new Error("Unknownt expression" + e)
}

var z = eval(new Number(12))*/


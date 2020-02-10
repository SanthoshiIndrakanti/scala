// Databricks notebook source
// val , var
val variable1: String = "hello world!"

// COMMAND ----------

var variable1_var : String = "hello worlddddddsss 2"
variable1_var


// COMMAND ----------

var valuu1 = "hello"

// COMMAND ----------

val variable1 = "hey"
variable1 = "hey" + "world!"

// COMMAND ----------

var value2 = "hey"
value2 = "hey" + "world!"

// COMMAND ----------

val var_byte : Byte = 126
var_byte + 3
val val_int : Int = 2


// COMMAND ----------

print(f"hello, $val_int")


// COMMAND ----------

// switch statement
var n: Int =4
n match{
  case 1 => print("1")
  case 2 => print("2")
  case 3 => print("Holla found value 3")
  case _ =>print("Not found")
}

// COMMAND ----------

var a=2
if(a==2){
  print("value 2")
}
else{
  print("no value")
}

// COMMAND ----------

for ( i <- 1 to 4){
  println(i)
}

// COMMAND ----------

var wh = 4
while(wh >= 0)
{
  println(f"wh,$wh")
  wh= wh-1
}

// COMMAND ----------

/* function def <name>(argument : <Type>)Return datatype Int :{

 commands
}
*/
def squareInt(x : Int): Int = {
  // squaring the given value
  x * x 
}
// calling a function
squareInt(2)

// COMMAND ----------

def Nodivisor(x : Float, y: Float): Float = {
  // Dividing two numbers
  x/y
 }
//calling a function
Nodivisor(3,4)

// COMMAND ----------

def Table(x : Int): Unit = {
  for ( i <- 1 to 10) {
    z=x*i
  println(f"$x * $i= $z")
  }
 }
// calling function
Table(2)

// COMMAND ----------

def para(x: Double, y: Double): Double = {
   x+y
 }
  def addNumber(variable1: Double, variable2: Double,func: (Double,Double) => Double)={
  func(variable1,variable2)
 }

//calling a function
addNumber(86,98,para)

// COMMAND ----------

// working with tupes
val tup = ("hello","goyal",4)
tup._1

// COMMAND ----------

var list1 = List("tushar","goyal")
list1.head

// COMMAND ----------

var dict = 1 -> "hello"
dict._1

// COMMAND ----------

var list1=List("santhoshi")
var list2=List("Indrakanti")
list1  ++ list2

// COMMAND ----------

var newlist = List(1,2,3,4,5)
newlist.filter( (x:Int) => x<5 )
newlist.filter( (x:Int) => x!=3)

// COMMAND ----------

var liststring = List("hey","hello")
liststring.map( (x:String) => x.reverse)

// COMMAND ----------

var newlist = List(1,2,3,4,5)
newlist.reduce( (x:Int, y:Int) => x+y )

// COMMAND ----------

newlist(4)

// COMMAND ----------

var list6 = List("hey","santhu","class", "is","going on")
list6(0).map( (x:String) => (x,1) )

// COMMAND ----------

var ss : Byte = 124
ss.toString

// Scala_SBT_Assignment

class Calculator{

  // Method for addition
  def add(firstNumber:Int, secondNumber:Int):Int = firstNumber + secondNumber

  // Method for subtraction
  def subtract(firstNumber:Int, secondNumber:Int):Int = firstNumber - secondNumber

  // Method for Multiplication
  def multiply(firstNumber:Int, secondNumber:Int):Long = firstNumber * secondNumber

  // Method for Division
  def divide(dividend:Int , divisor:Int):Double = {
    var result = 0
    if(divisor != 0){
      result = dividend/divisor
    }
    else{
      print("divisor can not be 0")
    }
    result
  }


  //Method for find the power of any number
  def power(value:Int , power:Int):Long = {
    var result = 1
    var temp = power
    while(temp > 0){
      result = result*value
      temp = temp - 1
    }
    result
  }

  //Method for find Absolute number
  def absolute(value: Int):Int = Math.abs(value)


  // Method for find maximum number
  def max(firstValue:Int,secondValue:Int):Int={
    var result = 0

    if(firstValue > secondValue){
      result = firstValue
    }
    else{
      result = secondValue
    }

    result
  }

  //Method for find Minimum number
  def min(firstValue:Int,secondValue:Int):Int={
    var result = 0

    if(firstValue < secondValue){
      result = firstValue
    }
    else{
      result = secondValue
    }

    result
  }

}


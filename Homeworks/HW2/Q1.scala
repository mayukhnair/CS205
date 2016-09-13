object Q1{
	def fact(n:Int):Int = {
		if (n==0) 1
		else n*fact((n-1):Int)	
	}

	def main(args: Array[String]): Unit= 
	{
		println("Please enter an integer")
		var number = readInt
		var result = fact(number)
		println(result)
	}
}


object Q7 {
	def fastPower(base:Int, power:Int):Int = {
		power match {
			case 0 => 1
			case power if (power%2==0) => fastPower(base, power/2) * fastPower(base, power/2)
			case _ => base*fastPower(base,power-1)
		}
	}
	def main(args: Array[String]): Unit= 
	{
		println("Enter base value")
		var baseInput = readInt
		println("Enter power value")
		var powerInput = readInt
		var result = fastPower(baseInput,powerInput)
		println("Base = "+baseInput, " Power = "+powerInput, " Result = "+result)
}
}
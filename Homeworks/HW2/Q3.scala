object Q3{
	def sortInsert(inputlist: List[Int], inputnum: Int):List[Int]=
	inputlist match {
		case Nil => inputnum::inputlist
		case hd::rest if inputnum <= hd => inputnum::inputlist
		case hd::rest if hd < inputnum => hd::sortInsert(rest,inputnum)
	}
	def main(args: Array[String]): Unit= 
	{
		println("Sample list is (3, 7, 19, 24, 37, 55), inserting number 41: ", sortInsert(List(3, 7, 19, 24, 37, 55),41))
	}
}
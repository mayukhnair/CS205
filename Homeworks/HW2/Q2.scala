object Q2{
	def Split(masterlist: List[Int]):(List[Int], List[Int]) ={ 
		masterlist match{
			case Nil => (Nil,Nil)
			case hd::tail if masterlist.length == 1 => (List(hd),Nil)
			case hd::tail if masterlist.length > 1 => (hd::Split(tail.init)._1, Split(tail.init)._2:::List(masterlist.last))
		}
	}
	def main(args: Array[String]): Unit= 
		{
			println("The list (6,14,9,27,45,16) will be split as follows: " + Split(List(6,14,9,27,45,16)))
		}
}
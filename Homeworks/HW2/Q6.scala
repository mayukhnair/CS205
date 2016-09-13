object Q6
{
	def quickSort(inputlist:List[Int]):List[Int]
	inputlist match {
		case hd::rest => pivotSort(list,hd) 
		case Nil => Nil
	}	
def main(args: Array[String]): Unit= 
	{
		println("Unsorted list is (17, 1, 24, 35, 16, 29); sorted list is:" + quickSort(List(17, 1, 24, 35, 16, 29)))
	}
}
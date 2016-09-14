object Q6
{
	def pivotSort(inputlist:List[Int], inputnum:Int):List[Int]=
	{
		inputlist match {
			case head::rest if (head <= inputnum) => head::pivotSort(rest,inputnum)
			case Nil => List(inputnum)
			case head::rest if (head > inputnum) => pivotSort(rest,inputnum) ::: List(head)
		}
	}
	def quickSort(inputlist:List[Int]):List[Int]=
	{
		inputlist match {
			case hd::rest => pivotSort(inputlist,hd) 
			case Nil => Nil
		}
	}	
def main(args: Array[String]): Unit= 
	{
		println("Unsorted list is (17, 1, 24, 35, 16, 29); sorted list is:" + quickSort(List(17, 1, 24, 35, 16, 29)))
	}
}
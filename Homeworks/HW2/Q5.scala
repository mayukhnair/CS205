object Q5{
	def pivotSort(inputlist:List[Int], inputnum:Int):List[Int]=
	{
		inputlist match {
			case head::rest if (head <= inputnum) => head::pivotSort(rest,inputnum)
			case Nil => List(inputnum)
			case head::rest if (head > inputnum) => pivotSort(rest,inputnum) ::: List(head)
		}
		
	}
	def main(args:Array[String]):Unit=
	{
		println("Sample list is (24,3,41,16,72); inserting element 6:"+pivotSort(List(24,3,41,16,72),6))
	}
}
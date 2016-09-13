object Q4 {

def sortInsert(inputlist: List[Int], inputnum: Int):List[Int]=
	inputlist match {
		case Nil => inputnum::inputlist
		case hd::rest if inputnum <= hd => inputnum::inputlist
		case hd::rest if hd < inputnum => hd::sortInsert(rest,inputnum)
	}

def InsertionSort(inputlist:List[Int]):List[Int]=
{
	inputlist match {
		case Nil => Nil
		case hd::rest => {
			sortInsert(InsertionSort(rest),hd)
			}
		case _ => inputlist
	}
}

def main(args: Array[String]): Unit= 
	{
		println("Unsorted list is (17, 1, 24, 35, 16, 29); sorted list is:" + InsertionSort(List(17, 1, 24, 35, 16, 29)))
}
}

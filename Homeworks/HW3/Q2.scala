object Q2{

	def splitList(inputlist:List[Int]):(List[Int],List[Int])={
		
		var list1: List[Int] = List()
		var list2: List[Int] = List()
		var mainlist: List[Int] = inputlist

		while (mainlist!=Nil){
			list1=list1:+(mainlist.head)
			mainlist = mainlist.tail

		if(!(mainlist.isEmpty)){
			list2=mainlist.last::list2
			mainlist=mainlist.init
		}

		}

		(list1,list2)

	}

	def main(args: Array[String]):Unit={
		println(splitList(List(1,4,9,7,5,6)))
	}

	}


import scala.io.Source
object wordcount{
	def main(args:Array[String]){
	if(args.length!=1){
	System.err.println("Error")
	System.exit(1)
	}
var filename=args(0)
val wordC=scala.collection.mutable.Map[String,Int]()
for(line<-Source.fromFile(filename).getLines)
for(word<-line.split(" "))
wordC(word)=if(wordC.contains(word)) wordC(word)+1 else 1	
println(wordC)
for((k,v)<-wordC)
printf("word %s occurs %d times\n",k,v)
}
}
   
import scala.io.StdIn

object act82{
    
    val multiple = (n:Int) => {
        if(n%3==0 && n%5==0){
            println("Multiple of Both Three and Five")
        }else if (n%5 == 0){
            println("Multiple of Five")
        } else if( n%3==0 ){
            println("Multiple of Three")
        }else{
            println("Not a Multiple of Three or Five")
        }
    }

    def main(args: Array[String])={
        println("Enter an Integer: ")
        val int = scala.io.StdIn.readInt()
        multiple(int)
    }
}
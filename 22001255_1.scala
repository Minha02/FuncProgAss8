object act81{

    def Encryption(x: Char,shift:Int): Char={
        val base:Int = if (x.isUpper) 'A'.toInt else 'a'.toInt
        val range: Int = 26
        var shiftInt:Int = 0
        if((range - (x.toInt - base)) <= shift){
            shiftInt = base + shift - (range - (x.toInt - base))
        }else if(x.toInt == 32){
            shiftInt = x.toInt
        }else{
            shiftInt = x.toInt + shift 
        }
        val shiftChar:Char = shiftInt.toChar
        shiftChar
    }

    def CaeserCipherenc(txt: String,shift:Int):Unit={
        val ciphtxt:String = txt.map(x=> Encryption(x,shift));
        println(ciphtxt);
    }

    def Decryption(x: Char,shift:Int): Char={
        val base:Int = if (x.isUpper) 'A'.toInt+shift else 'a'.toInt+shift
        val range: Int = 26
        var shiftInt:Int = 0
        if((base - x.toInt ) <= shift && (base - x.toInt ) >0){
            shiftInt = x.toInt +(range - shift)
        }else if(x.toInt == 32){
            shiftInt = x.toInt
        }else{
            shiftInt = x.toInt - shift 
        }
        val shiftChar:Char = shiftInt.toChar       
        shiftChar
    }

    def CaeserCipherdec(txt:String,shift:Int):Unit ={
        val ciphtxt:String = txt.map(x=> Decryption(x,shift))
        println(ciphtxt)
    }

    def main(args: Array[String])={
        CaeserCipherenc("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z",4)
        CaeserCipherdec("E F G H I J K L M N O P Q R S T U V W X Y Z A B C D",4)
        CaeserCipherenc("a b c d e f g h i j k l m n o p q r s t u v w x y z",4)
        CaeserCipherdec("e f g h i j k l m n o p q r s t u v w x y z a b c d",4)
    }
}
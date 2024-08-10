object act81{

    def cipherletterenc1(x: Char,shift:Int): Char={
        var shiftx:Int = 0
        if(((x+shift)%26>=10 || (x+shift)%26<13) ||((x+shift)%26>=15 || (x+shift)%26<18) ){
            shiftx = x - (26-shift)
        } else{
            shiftx = x + shift
        }
        shiftx.toChar
    }

    def CaeserCipherenc(txt: String,shift:Int):Unit={
        val ciphtxt:String = txt.map(x=> cipherletterenc1(x,shift));
        println(ciphtxt);
    }

    def cipherletterdec(x: Char,shift:Int): Char={
        var shiftx:Int = 0
        if(((x+shift)%26>=10 || (x+shift)%26<13) ||((x+shift)%26>=15 || (x+shift)%26<18) ){
            shiftx = x +(26-shift)
        } else{
            shiftx = x - shift
        }
        shiftx.toChar
    }

    def CaeserCipherdec(txt:String,shift:Int):Unit ={
        val ciphtxt:String = txt.map(x=> cipherletterdec(x,shift))
        println(ciphtxt)
    }

    def main(args: Array[String])={
    
        CaeserCipherenc("XyZ",3)
        CaeserCipherdec("aBc",3)
    }
}
///void method
    fun myDisplay(str:String):Unit{

        println(str)
    }
//void method
    fun  myDisplay2(str:String){
        println(str)
    }
//return type method
    fun myDisplay3(x:Int, y:Int):Int{

        return x + y;
    }

    fun main(args: Array<String>){

        myDisplay("Void with Unit")
        myDisplay2("Void without Unit")
        println("Return Type Method : ${myDisplay3(5, 11)}")
        println("Function with if statement: ${myNewDisplay(10, 12)}")

    }


//function with conditions

    fun myNewDisplay(x: Int, y: Int):Int = if(x > y) { y }else{ x }
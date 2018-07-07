
    fun main(args: Array<String>){

        var myString:String
            myString = "My Name Is"

        var myobj = firstclass()

        myobj.getValue(myString)

        myobj.myLocalVariable = "LocalVariable Value" // assign value for another class variable
        myobj.getVal2()

        myobj.newVariable = "World"

        println("Hello ${myobj.newVariable}")

    }

    class firstclass{

        var myLocalVariable:String = ""
        var newVariable:String = ""
        fun getValue(value:String){
            println(value)
        }
        fun getVal2(){
            println(myLocalVariable)
        }

    }
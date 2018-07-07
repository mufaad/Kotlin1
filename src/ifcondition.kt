
    fun main(args: Array<String>){

        var a = 30
        var b = 20

        var MaxVal: Int

        if(a < b)
        {
            MaxVal = b
        }else{
            MaxVal = a
        }

        println(MaxVal)

        println("Assign if with a variable")

        var MaxValue:Int = if(a < b) {
                                            println("B is greater than A")
                                            b
                                        }else{
                                            println("A is greater than B")
                                            a
                                            }

        println(MaxValue)
    }
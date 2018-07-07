
    fun main(args: Array<String>)
    {
        for(i in 1..5){
            println(i)
        }

        for(i in 5 downTo 1){
            println(i)
        }
        println("WHILE")
        var x = 1;
        while(x <= 10)
        {
            println(x)
            x++
        }
        println("DO WHILE")

        do{
            println(x)
        }while (x <= 5)





        println("======")
        println("Add a label for a loop")

        myFirstLoop@ for(i in 1..3)
        {
            for(x in 1..3)
            {
                println("$i : $x")

                if(i == 2)
                {
                    break@myFirstLoop  //this will stopped the label loop,
                                      //if you use just the break only the child loop will break
                }
            }
        }
        //u can use the continue also same like break
    }
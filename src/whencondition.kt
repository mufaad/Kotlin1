

    fun main(args: Array<String>){
        var x = 15

        when(x){

            1 -> println("X is one")
            2-> {
                println("X value is two")
                println("X have an value")
                }
            3-> println("X value is 3")
            4, 5, 6 -> println("X have 4, 5 or 6")
            in 7..10 -> println("X have in between 7 to 10")
            !in 11..13 -> println("X dont have in between 11 to 13")
            else-> {
                        println("X have an unknown value")
                    }
        }


        //you can use the when for  a variable same like if
    }
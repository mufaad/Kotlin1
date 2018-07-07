
    fun main(args: Array<String>){

        var v1 = 10
        var v2 = 15

        println(v1.getGreaterValue(v2))
        println(v1 getGreaterValue v2) //infix function advantage//

    }
//infix function only can be used for one parameter functions.
    infix fun Int.getGreaterValue(v:Int):Int {

        if(this > v)
        {
            return this
        }else{
            return v
        }

    }
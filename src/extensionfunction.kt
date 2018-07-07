
    fun main(args:Array<String>){

        var s1 = "Hello";
        var s2 = " Welcome"
        var s3 = " To World"

        println(s1.addData(s2, s3))
    }

    //add a function(method) for a existing class
    fun String.addData(value1:String, value2:String):String{

        return this + value1 + value2
    }
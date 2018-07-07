
    fun main(args: Array<String>){

        var r1 = 1..5
        //output => 1, 2, 3, 4, 5

        var r2 = 5 downTo 1
        //output => 5, 4, 3, 2, 1

        var r3 = 5 downTo 1 step 2
        //output => 5, 3, 1

        var r4 = 'a'..'z'
        //output => a, b, c, d, ......, x, y, z

        var isPresend = 'b' in r4
        //output => true (because the value b is in r4)

        var coundDown = 10.downTo(1)
        //output 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

        var moveUp = 1.rangeTo(10)
        //output 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    }
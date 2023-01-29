fun main()
{
        println("Введите т3-х значное число")
        var a :Int = readLine().toString().toInt()
        var b = a%10
        var c = a/10 % 10
        var h = a/100 % 10
        println("$b and $c and $h")
        var sum = b+c+h
        println("сумма цифр числа = $sum")
        var pr = b*c*h
        println("их произведение = $pr")
}
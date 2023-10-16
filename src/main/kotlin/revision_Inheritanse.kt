fun main(){
    var obj=Child("Mostafa")
    println(obj.name)
}
open class Parent(var name:String){
    var age:Int=0
    //overriding method
    open fun printData()=println("$name $age")
}
class Child(name: String) :Parent(name){
    var job:String=""
    override fun printData()=println("${super.name} ${super.age} $job")
}
fun main(){
var obj=B()
    obj.setAge(20)
    println(obj.getAge())

    obj.SetAndGetAddress="Talkha"
    println(obj.SetAndGetAddress)


}
open class A(){//super
    protected var name:String=""//used in class A,b   //not used in main
    private var age:Int=0
    //set and get   way1
    fun setAge(newAge:Int){
        this.age=newAge
    }
    fun getAge():Int{
        return this.age
    }
    //set and get   way2
    private var address:String=""
    var SetAndGetAddress:String
        get()=this.address
        set(value) {
            this.address=value
        }

    private fun printA(){ //used only in class A  //not used in class B and main
        println("${this.name} $age")
    }
}
class B():A(){//sub class
    var job:String=""
    fun printB(){
        println("${super.name} ${this.job}")
    }
}
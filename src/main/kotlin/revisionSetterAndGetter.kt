fun main(){
    var obj=A1()
    obj.setName("Desha")
    println(obj.getName())
    obj.setAndGetValue=24
    println(obj.setAndGetValue)
}
class A1{
    private var name:String=""
    private var age:Int=0
    fun setName(newName:String)
    {
        this.name=newName
    }
    fun getName():String{
        return this.name
    }
    //set ,get   way 2
    var setAndGetValue:Int
        get()=this.age
        set(value){
            this.age=value
        }
}
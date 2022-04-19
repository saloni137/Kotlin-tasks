interface BeverageMethods {
    fun cleanPot()
    fun getMixture()
    fun addIngredients()
}
abstract class Beverage: BeverageMethods {
    fun addWater(){
        println("Adding hot water");
    }
    fun addMilk(){
        println("Adding hot milk");
    }
    fun addSugar(){
        println("Adding sugar");
    }
    fun getBevrage(){
        cleanPot()
        getMixture()
       	addIngredients()
    }
}

class coffee : Beverage(){
    override fun cleanPot(){
        println("Cleaning Coffee pot...")
    }
    override fun getMixture(){
        println("Your Coffee is getting ready")
        addWater()
        addMilk()
        addSugar()
    }
    override fun addIngredients(){
        println("Coffee Bag added");
        println("Your coffee is ready! Enjoy")
    }
}

class tea : Beverage(){
    override fun cleanPot(){
        println("Cleaning tea pot...")
    }
    override fun getMixture(){
        println("Your tea is getting ready")
        addWater()
        addMilk()
        addSugar()
    }
    override fun addIngredients(){
        println("Tea Bag added");
        println("Your tea is ready! Enjoy")
    }
}

fun main(args:Array<String>) {
   val type = args[0]
   val beverage: Beverage =  if(type == "1"){
       tea()
   }
   else {
       coffee()
   }
   beverage.getBevrage()
}

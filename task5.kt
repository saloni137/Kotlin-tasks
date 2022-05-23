interface Heater{
    fun on();
    fun off();
    fun isHeating();
}

interface Pump{
    fun pumping();
}

class electricHeater : Heater {
    override fun on(){
        println("Electric heater started..")
    }
    override fun off(){
        println("Electric heater stopped..")
    }
    override fun isHeating(){
        println("Heating in process")
    }
}

class waterPump : Pump {
    override fun pumping(){
        println("pumping in process")
    }
}

class coffeeMaker(){
    private val heater = electricHeater();
    private val pump = waterPump();
    fun brew(type:String){
        heater.on();
        heater.isHeating();
        pump.pumping();
        println("$type coffee is ready");
        heater.off();
    }
    
}
fun main(args: Array<String>) {
    val type = args[0];
    val coffee = coffeeMaker();
    coffee.brew(type);
}

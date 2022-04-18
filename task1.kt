fun main(args:Array<String>) {
    var trains = mapOf(
        "train1" to arrayListOf("train1","surat","mumbai","10AM"),
    	"train2" to arrayListOf("train2","mumbai","pune","12PM"),
        "train3" to arrayListOf("train3","lucknow","agra","2PM")
    );
    
    val type:String = args[0];
    val value:String = args[1];

    var output = mutableListOf<String>();
    
    for ((k, v) in trains) {
		when(type){
            "Name" -> if(k == value) output.add(k);
            "Source" -> if(v[1] == value) output.add(k);
            "Destination" ->if(v[2] == value) output.add(k);
            "DepartureTime" ->if(v[3] == value) output.add(k);
        }
	}
    
    println(output);
}

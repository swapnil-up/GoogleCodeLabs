fun main() {
    val Celsius=27.0
    val Kelvin=350.0
    val Fahrenheit=10.0

    val cToF=Celsius*9/5+32
    val kToC=Kelvin-273.15
    val fToK=(Fahrenheit-32)*5/9+273.15

    printFinalTemperature(Celsius,"Celsius","Fahrenheit"){cToF}
    printFinalTemperature(Kelvin,"Kelvin","Celsius"){kToC}
    printFinalTemperature(Fahrenheit,"Fahrenheit","Kelvin"){fToK}

}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

package PracticeKotlinFundamentals

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean,var isFolded:Boolean=false): Phone(isScreenLightOn){
    override fun switchOn(){
        if(isFolded) println("unfold first")
        else{
            isScreenLightOn=true
            println("welcome")
        }
    }
    fun checkFolded(){
        val folded=if(isFolded) "folded" else "not folded"
        println("The phone's screen is $folded")
    }
    fun fold(){
        isFolded=true
    }
    fun unfold(){
        isFolded=false
    }

}

fun main(){
    var p= Phone(true)
    var f= FoldablePhone(true,true)
    p.switchOn()
    f.switchOn()
}
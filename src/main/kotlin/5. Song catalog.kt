class Song(title:String, artist:String, yearPublished: String, playCount:Int){
    val title=title
    val artist=artist
    val yearPublished=yearPublished
    val playCount=playCount
    val popularity=popularity(playCount)

    fun displaySongInfo(){
        println("$title, performed by $artist, was released in $yearPublished.")
    }
    fun popularity(playCount:Int){
        if (playCount<1000){
            println("not popular")
        }
        else{
            println("popular")
        }
    }

}
fun main(){


    val s=Song("ThunderStruck","AC/DC","2002-12-12",1500)
    s.displaySongInfo()
}
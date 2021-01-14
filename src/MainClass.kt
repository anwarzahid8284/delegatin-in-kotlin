class FileDownloader(private val file:String):Downlaoder{
    override fun downloader() {
        println("$file of downlaoder class")
    }

}
class FilePlayer(private val file: String):Player{
    override fun player() {
        println("$file of player class")
    }
}

class MainClass(
    private val downloader:Downlaoder
    ,private val player: Player)
    :Downlaoder by downloader,Player by player
fun main(){
    val fileName="xyz.txt"
    val mainclass=MainClass(FileDownloader(fileName),FilePlayer(fileName))
    mainclass.downloader()
    mainclass.player()
}
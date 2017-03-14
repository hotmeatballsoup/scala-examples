package hotmeatballsoup.provingground.shared.config

import com.google.gson.Gson

import scala.io.Source
import net.liftweb.json._

/**
  * Takes a configFileUri (expects to be a JSON file) and turns it into a
  * {@link ProvingGroundConfig} instance.
  */
object ProvingGroundConfigurator {
  def loadConfigs(configFileUri : String) : ProvingGroundConfig = {
//    implicit val formats = net.liftweb.json.DefaultFormats
//    parse(Source.fromFile(configFileUri).mkString).extract[ProvingGroundConfig]
    val gson = new Gson()
    val text = Source.fromFile(configFileUri).mkString
    println(s"text = ${text}")
    gson.fromJson(text, classOf[ProvingGroundConfig])
  }
}

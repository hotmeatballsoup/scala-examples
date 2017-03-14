package hotmeatballsoup.provingground.shared.app

import com.jme3.app.SimpleApplication
import com.jme3.system.AppSettings
import org.slf4j.Logger

/**
  * Created by zac.harvey on 3/12/17.
  */
abstract class ProvingGround(implicit log : Logger, appSettings: AppSettings) extends SimpleApplication {
  override def simpleInitApp(): Unit = {
    init()
  }

  def init() : Unit
}

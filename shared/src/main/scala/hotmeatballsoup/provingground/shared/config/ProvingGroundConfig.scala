package hotmeatballsoup.provingground.shared.config

import hotmeatballsoup.provingground.shared.utils.RunMode

/**
  * Created by zac.harvey on 3/12/17.
  */
class ProvingGroundConfig(version : String, runMode : RunMode.Value) {
  def version() : String = { this.version }
  def runMode() : RunMode.Value = { this.runMode }
}

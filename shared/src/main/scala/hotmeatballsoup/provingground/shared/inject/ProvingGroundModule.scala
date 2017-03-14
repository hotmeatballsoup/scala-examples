package hotmeatballsoup.provingground.shared.inject

import com.google.inject.{AbstractModule, Provides}
import com.jme3.system.AppSettings
import hotmeatballsoup.provingground.shared.config.ProvingGroundConfig
import net.codingwell.scalaguice.ScalaModule

/**
  * Guice module for ProvingGround.
  */
abstract class ProvingGroundModule(pgConf : ProvingGroundConfig) extends AbstractModule with ScalaModule {
  override def configure(): Unit = {
//    bind[ProvingGround].toInstance(providesProvingGround(provideAppSettings()))
  }

//  def providesProvingGround(appSettings: AppSettings) : ProvingGround = {
//    val pg = new ProvingGround(appSettings)
//
//    // TODO: Either get ctor working or do pg.setSettings(appSettings)
//
//    pg.setShowSettings(false)
//
//    pg
//  }

  @Provides
  def provideAppSettings() : AppSettings = {
    val appSettings = new AppSettings(true)

    appSettings.setTitle("Proving Ground")

    // TODO: Figure out what this does (https://hub.jmonkeyengine.org/t/disable-the-options-popup-screen/13684/2)
    // TODO: Also figure out if these are client-specific or tier-agnostic
    appSettings.setSamples(4)
    appSettings.setVSync(true)

    appSettings
  }
}

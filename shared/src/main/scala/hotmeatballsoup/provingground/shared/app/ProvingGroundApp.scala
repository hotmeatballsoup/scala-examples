package hotmeatballsoup.provingground.shared.app

import com.google.inject.Guice
import com.jme3.system.JmeContext
import hotmeatballsoup.provingground.shared.config.ProvingGroundConfigurator
import hotmeatballsoup.provingground.shared.inject.ProvingGroundModule
import hotmeatballsoup.provingground.shared.utils.RunMode
import org.slf4j.LoggerFactory

/**
  * Driver to start {@link ProvingGround} as either a client or headless server
  * based on an external configuration file.
  */
object ProvingGroundApp extends App {
  println("Hello!")
//  val logger = LoggerFactory.getLogger(this.getClass)
//
//  logger.info("Loading configs...")
//  val pgConf = ProvingGroundConfigurator.loadConfigs("pg-test.json")//args(0)) TODO
//  logger.info(s"Configs loading and Proving Ground (${pgConf.runMode.toString.toLowerCase()} mode) v${pgConf.version} is starting...")
//
//  logger.info("Scanning classpath for a suitable Guice module to bootstrap with...")
//  val mode : String = if (pgConf.runMode eq RunMode.CLIENT_MODE) "Client" else "Server"
//  val moduleFQCN = s"hotmeatballsoup.provingground.${mode.toLowerCase()}.inject.ProvingGround${mode}Module"
//  logger.info(s"Looking for a Guice module named ${moduleFQCN}...")
//  val moduleClass = Class.forName(moduleFQCN)
//  logger.info(s"${moduleFQCN} was found...")
//  val module = Class.forName(moduleFQCN).newInstance().asInstanceOf[ProvingGroundModule]
//  logger.info(s"A new Guice module of type ${module.getClass} has been instantiated.")
//  // TODO: module.setConfig(pgConf)
//
//  logger.info("Beginning to bootstrap ourselves...")
//  val injector = Guice.createInjector(module)
//  val pg = injector.getInstance(classOf[ProvingGround])
//  val jmeContextType = injector.getInstance(classOf[JmeContext.Type])
//  logger.trace("Dependencies have been bootstrapped successfully...")
//
//  logger.info("Application is starting up...")
//  pg.start(jmeContextType)
}

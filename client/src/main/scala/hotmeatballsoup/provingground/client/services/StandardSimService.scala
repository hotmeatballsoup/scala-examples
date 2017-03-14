package hotmeatballsoup.provingground.client.services

import com.jme3.network.Client

/**
  * Created by zac.harvey on 3/13/17.
  */
class StandardSimService(simServiceClient : Client) extends SimService {
  override def connect(): Unit = {
    simServiceClient.start()
  }
}

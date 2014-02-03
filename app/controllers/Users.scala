package controllers

import play.api.mvc.{Action, Controller}
import play.api.libs.ws.WS
import play.api.libs.concurrent.Execution.Implicits._

object Users extends Controller {

  def showGeorgi  = Action.async {
    WS.url("https://api.github.com/users/georgiknox").get().map { response =>
      Ok(response.json)
    }
  }
}

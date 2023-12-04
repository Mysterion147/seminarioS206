package star_wars

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class Simulation extends Simulation {

  val teste = scenario("Teste para criar novo filme").exec(karateFeature("classpath:star_wars/star_wars.feature"))
  setUp(
    teste.inject(rampUsers(4) during (5 seconds)).protocols(protocol)
  )
}
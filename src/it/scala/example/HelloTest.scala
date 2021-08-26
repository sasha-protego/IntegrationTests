package example

import org.scalatest._
import org.scalatest.matchers._
import org.scalatestplus.selenium._
import org.openqa.selenium.WebDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver

class BlogSpec extends flatspec.AnyFlatSpec with should.Matchers with WebBrowser {

  implicit val webDriver: WebDriver = new HtmlUnitDriver

  val host = "http://www.google.com/"

  "The blog app home page" should "have the correct title" in {
    go to (host)
    pageTitle should be ("Google")
  }
}
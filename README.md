# IntegrationTests
To run clone repository start sbt and run `IntegrationTest / Test`

New integration tests can be added in 'src/it/scala/examples' directory. There is already very simple test in there. Tests are written using ScalaTest framework with Selenium driver.
AnyFlatSpec (most ressembling human language variant) is used to write tests.

ScalaTest selenium commands DSL documentation is [here](https://www.scalatest.org/plus/selenium)

package example
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import org.scalactic.TypeCheckedTripleEquals._

class HelloSpec extends munit.FunSuite {
  val ff = new Fixture[Int]("values") {
    override def apply(): Int = 5

    override def beforeEach(context: BeforeEach): Unit =  {
    }

    override def afterEach(context: AfterEach): Unit = {

    }
  }

  override def munitFixtures: Seq[Fixture[_]] = List(ff)

  test("should fail"){
    val foo = 5
    Future {
      Thread.sleep(3000)
      assert(ff() === foo)
    }
  }


  test("should also fail"){
    val bar = 5
    Future {
      Thread.sleep(3000)
      assert(ff() == bar)
    }
  }
}

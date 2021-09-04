package uol

import zio.{Chunk, ZIO}
import zio.test._
import zio.test.Assertion._

object HelloSpec extends DefaultRunnableSpec {
  val xx = Chunk(1,2,3) ++ Chunk(4,5,6)

  override def spec = suite("one") {
    test("t1") {
      assertM(ZIO.succeed(xx.toString()))(equalTo("Chunk(1,2,3,4,5,6)"))
    }
  }
}

package uol

import zio._

object Hello extends zio.App {
  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = {
    Console.printLine("hello").exitCode
  }
}
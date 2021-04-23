package utils

import scala.io.Source

object Files {
  def load(fileName: String): Seq[String] ={
    Source.fromFile(fileName).getLines().toSeq
//    Source.fromInputStream(getClass.getClassLoader.getResourceAsStream(fileName)).getLines().toSeq
  }
}

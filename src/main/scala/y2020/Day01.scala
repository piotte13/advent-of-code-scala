package y2020

object Day01 {
  /*
  --- Day 1: Report Repair ---

  The Elves in accounting just need you to fix your expense report (your puzzle input); apparently, something isn't quite adding up.

  Specifically, they need you to find the two entries that sum to 2020 and then multiply those two numbers together.

  For example, suppose your expense report contained the following:

  1721
  979
  366
  299
  675
  1456
  In this list, the two entries that sum to 2020 are 1721 and 299. Multiplying them together produces 1721 * 299 = 514579, so the correct answer is 514579.

  Of course, your expense report is much larger. Find the two entries that sum to 2020; what do you get if you multiply them together?
  * */
  def solvePuzzlePartOne(entries: Seq[Int]): Option[Int] = {
    entries
      .combinations(2)
      .find(_.sum == 2020)
      .map(_.product)
  }

  /*
  --- Part Two ---
  The Elves in accounting are thankful for your help; one of them even offers you a starfish coin they had left over from a past vacation. They offer you a second one if you can find three numbers in your expense report that meet the same criteria.

  Using the above example again, the three entries that sum to 2020 are 979, 366, and 675. Multiplying them together produces the answer, 241861950.

  In your expense report, what is the product of the three entries that sum to 2020?
  */
  def solvePuzzlePartTwo(entries: Seq[Int]): Option[Int] = {
    entries
      .combinations(3)
      .find(_.sum == 2020)
      .map(_.product)
  }

  def generalizedSolution(entries: Seq[Int], n: Int, sum: Int): Option[Int] = {
    entries
      .combinations(n)
      .find(_.sum == sum)
      .map(_.product)
  }
}

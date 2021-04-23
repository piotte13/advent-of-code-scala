package y2020

import utils.Files

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import org.scalatest.matchers.should.Matchers.be

class Day01Spec extends AnyFunSpec {
  describe("#test part1 implementation") {
    it("returns the expected int when valid input") {
      val entries = Seq(
        1721,
        979,
        366,
        299,
        675,
        1456
      )
      val expected = Some(514579)

      val actual = Day01.solvePuzzlePartOne(entries)

      actual should be(expected)
    }

    it("returns None int when impossible input") {
      val entries = Seq(
        979,
        366,
        299,
        675,
        1456
      )

      val actual = Day01.solvePuzzlePartOne(entries)

      actual should be(None)
    }

    it("returns the expected int from official entries") {
      val entries = Files.load("src/test/resources/y2020/day01.txt").map(_.toInt)
      val expected = Some(692916)

      val actual = Day01.solvePuzzlePartOne(entries)

      actual should be(expected)
    }
  }
  describe("#test part2 implementation") {
    it("returns the expected int when valid input") {
      val entries = Seq(
        1721,
        979,
        366,
        299,
        675,
        1456
      )
      val expected = Some(241861950)

      val actual = Day01.solvePuzzlePartTwo(entries)

      actual should be(expected)
    }

    it("returns None int when impossible input") {
      val entries = Seq(
        1721,
        366,
        299,
        675,
        1456
      )

      val actual = Day01.solvePuzzlePartTwo(entries)

      actual should be(None)
    }

    it("returns the expected int from official entries") {
      val entries = Files.load("src/test/resources/y2020/day01.txt").map(_.toInt)
      val expected = Some(692916)

      val actual = Day01.solvePuzzlePartTwo(entries)

      actual should be(expected)
    }
  }
}

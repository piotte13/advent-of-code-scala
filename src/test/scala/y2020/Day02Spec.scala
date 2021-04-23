package y2020

import utils.Files

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.{ be, convertToAnyShouldWrapper }

class Day02Spec extends AnyFunSpec {
  describe("#test part1 implementation") {
    it("returns the expected int when valid input") {
      val entries = Seq(
        "1-3 a: abcde",
        "1-3 b: cdefg",
        "2-9 c: ccccccccc"
      )
      val expected = 2

      val actual = Day02.solvePuzzlePartOne(entries)

      actual should be(expected)
    }

    it("returns the expected int from official entries") {
      val entries = Files.load("src/test/resources/y2020/day02.txt")
      val expected = 416

      val actual = Day02.solvePuzzlePartOne(entries)

      actual should be(expected)
    }
  }
  describe("#test part2 implementation") {
    it("returns the expected int when valid input") {
      val entries = Seq(
        "1-3 a: abcde",
        "1-3 b: cdefg",
        "2-9 c: ccccccccc"
      )
      val expected = 1

      val actual = Day02.solvePuzzlePartTwo(entries)

      actual should be(expected)
    }

    it("returns the expected int from official entries") {
      val entries = Files.load("src/test/resources/y2020/day02.txt")
      val expected = 688

      val actual = Day02.solvePuzzlePartTwo(entries)

      actual should be(expected)
    }
  }
}

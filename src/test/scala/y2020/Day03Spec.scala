package y2020

import utils.Files

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.{ be, convertToAnyShouldWrapper }

class Day03Spec extends AnyFunSpec {
  describe("#test part1 implementation") {
    it("returns the expected int when valid input") {
      val entries = Seq(
      "..##.........##.........##.........##.........##.........##.......",
      "#...#...#..#...#...#..#...#...#..#...#...#..#...#...#..#...#...#..",
      ".#....#..#..#....#..#..#....#..#..#....#..#..#....#..#..#....#..#.",
      "..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#",
      ".#...##..#..#...##..#..#...##..#..#...##..#..#...##..#..#...##..#.",
      "..#.##.......#.##.......#.##.......#.##.......#.##.......#.##.....",
      ".#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#",
      ".#........#.#........#.#........#.#........#.#........#.#........#",
      "#.##...#...#.##...#...#.##...#...#.##...#...#.##...#...#.##...#...",
      "#...##....##...##....##...##....##...##....##...##....##...##....#",
      ".#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#"
      )
      val expected = 7

      val actual = Day03.solvePuzzlePartOne(entries)

      actual should be(expected)
    }

    it("returns the expected int from official entries") {
      val entries = Files.load("src/test/resources/y2020/day03.txt")
      val expected = 250

      val actual = Day03.solvePuzzlePartOne(entries)

      actual should be(expected)
    }
  }
  describe("#test part2 implementation") {
    it("returns the expected int when valid input") {
      val entries = Seq(
        "..##.........##.........##.........##.........##.........##.......",
        "#...#...#..#...#...#..#...#...#..#...#...#..#...#...#..#...#...#..",
        ".#....#..#..#....#..#..#....#..#..#....#..#..#....#..#..#....#..#.",
        "..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#..#.#...#.#",
        ".#...##..#..#...##..#..#...##..#..#...##..#..#...##..#..#...##..#.",
        "..#.##.......#.##.......#.##.......#.##.......#.##.......#.##.....",
        ".#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#.#.#.#....#",
        ".#........#.#........#.#........#.#........#.#........#.#........#",
        "#.##...#...#.##...#...#.##...#...#.##...#...#.##...#...#.##...#...",
        "#...##....##...##....##...##....##...##....##...##....##...##....#",
        ".#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#.#..#...#.#"
      )
      val slopes = List(
        (1,1),
        (3,1),
        (5,1),
        (7,1),
        (1,2)
      )
      val expected = 336

      val actual = Day03.solvePuzzlePartTwo(entries, slopes)

      actual should be(expected)
    }

    it("returns the expected int from official entries") {
      val entries = Files.load("src/test/resources/y2020/day03.txt")
      val slopes = List(
        (1,1),
        (3,1),
        (5,1),
        (7,1),
        (1,2)
      )
      val expected = 1592662500

      val actual = Day03.solvePuzzlePartTwo(entries, slopes)

      actual should be(expected)
    }
  }
}

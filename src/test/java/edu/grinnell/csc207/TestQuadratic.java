package edu.grinnell.csc207;

import edu.grinnell.csc207.util.Quadratic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the Quadratic class.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 * @author Your Name Here
 */
public class TestQuadratic {
  /**
   * Quadratic expressions with only the a coefficient.
   */
  @Test
  public void testRootsOnlyA() {
    assertEquals(0, (new Quadratic(4, 0, 0)).smallerRoot(), 0.001,
        "The smaller root of 4x^2 is 0");
    assertEquals(0, (new Quadratic(4, 0, 0)).largerRoot(), 0.001,
        "The larger root of 4x^2 is 0");
  } // testRootsOnlyA()

  /**
   * Quadratic expressions with only the a and b coefficients.
   */
  @Test
  public void testRootsNoC() {
    assertEquals(0, (new Quadratic(1, -3, 0)).smallerRoot(), 0.001,
        "The smaller root of x^2 - 3x is 0");
  } // testRootsNoC()

    /**
   * Quadratic expressions with same roots
   */
  @Test
  public void testRootSame() {
    assertEquals(2, (new Quadratic(1, 4, 4)).smallerRoot(), 0.001,
        "The smaller root of x^2 + 4x + 4 is 2");
  } // testRootSame()

  /**
   * Quadratic expressions negative root
   */
  @Test
  public void testRootNeg() {
    assertEquals(-1, (new Quadratic(1, -4, -2)).smallerRoot(), 0.001,
        "The smaller root of x^2 - 4x -2 is -1");
  } // testRootNeg()

  /**
   * Quadratic expressions all zeros
   */
  @Test
  public void testRootZero() {
    assertEquals(0, (new Quadratic(0, 0, 0)).smallerRoot(), 0.001,
        "The smaller root of 0x^2 + 0x + 0 is 0");
  } // testRootZero()

} // class TestQuadratic

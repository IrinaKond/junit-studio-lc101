package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void wordWithBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void wordInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void wordAfterBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void emptyStringNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void onlyOneBracketBeforeWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void wrongOrderBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets( "Launch]Code["));
    }

    @Test
    public void onlyOneBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets( "["));
    }
    @Test
    public void wrongOrderTwoBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets( "]["));
    }
    @Test
    public void wrongOrderThreeBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets( "[Launch][Code"));
    }

    @Test
    public void rightOrderFourBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets( "[[Launch]Code]"));
    }
}

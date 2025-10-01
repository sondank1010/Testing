import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QualityTest {

    QualityAssessment qa = new QualityAssessment();

    //toan bo 25 test case theo file word
    @Test
    void testCase1() {
        assertEquals("Kém", qa.quality(0, 9.0f));
    }

    @Test
    void testCase2() {
        assertEquals("Kém", qa.quality(0.5f, 9.0f));
    }

    @Test
    void testCase3() {
        assertEquals("Khá", qa.quality(5.0f, 9.0f));
    }

    @Test
    void testCase4() {
        assertEquals("Tốt", qa.quality(9.5f, 9.0f));
    }

    @Test
    void testCase5() {
        assertEquals("Tốt", qa.quality(10.0f, 9.0f));
    }

    @Test
    void testCase6() {
        assertEquals("Kém", qa.quality(0f, 8.9f));
    }

    @Test
    void testCase7() {
        assertEquals("Kém", qa.quality(0.5f, 8.9f));
    }

    @Test
    void testCase8() {
        assertEquals("Khá", qa.quality(5.0f, 8.9f));
    }

    @Test
    void testCase9() {
        assertEquals("Tốt", qa.quality(9.5f, 8.9f));
    }

    @Test
    void testCase10() {
        assertEquals("Tốt", qa.quality(10.0f, 8.9f));
    }

    @Test
    void testCase11() {
        assertEquals("Kém", qa.quality(0f, 4.5f));
    }

    @Test
    void testCase12() {
        assertEquals("Kém", qa.quality(0.5f, 4.5f));
    }

    @Test
    void testCase13() {
        assertEquals("Trung Bình", qa.quality(5.0f, 4.5f));
    }

    @Test
    void testCase14() {
        assertEquals("Khá", qa.quality(9.5f, 4.5f));
    }

    @Test
    void testCase15() {
        assertEquals("Khá", qa.quality(10.0f, 4.5f));
    }

    @Test
    void testCase16() {
        assertEquals("Kém", qa.quality(0f, 0.1f));
    }

    @Test
    void testCase17() {
        assertEquals("Kém", qa.quality(0.5f, 0.1f));
    }

    @Test
    void testCase18() {
        assertEquals("Kém", qa.quality(5.0f, 0.1f));
    }

    @Test
    void testCase19() {
        assertEquals("Kém", qa.quality(9.5f, 0.1f));
    }

    @Test
    void testCase20() {
        assertEquals("Kém", qa.quality(10.0f, 0.1f));
    }

    @Test
    void testCase21() {
        assertEquals("Kém", qa.quality(0f, 0f));
    }

    @Test
    void testCase22() {
        assertEquals("Kém", qa.quality(0.5f, 0f));
    }

    @Test
    void testCase23() {
        assertEquals("Kém", qa.quality(5.0f, 0f));
    }

    @Test
    void testCase24() {
        assertEquals("Kém", qa.quality(9.5f, 0f));
    }

    @Test
    void testCase25() {
        assertEquals("Kém", qa.quality(10.0f, 0f));
    }
}


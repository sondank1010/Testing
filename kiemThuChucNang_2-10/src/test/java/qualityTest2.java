import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class qualityTest2 {

    QualityAssessment qa = new QualityAssessment();

    @Test
    void test1() {
        assertEquals("Kém", qa.quality(2.5f, 2.5f));
    }
    @Test
    void test2() {
        assertEquals("Kém", qa.quality(2.5f, 4.5f));
    }
    @Test
    void test3() {
        assertEquals("Kém", qa.quality(2.5f, 8.0f));
    }
    @Test
    void test4() {
        assertEquals("Kém", qa.quality(4.0f, 2.5f));
    }
    @Test
    void test5() {
        assertEquals("Trung Bình", qa.quality(4.0f, 4.5f));
    }
    @Test
    void test6() {
        assertEquals("Khá", qa.quality(4.0f, 8.0f));
    }
    @Test
    void test7() {
        assertEquals("Kém", qa.quality(7.0f, 2.5f));
    }
    @Test
    void test8() {
        assertEquals("Khá", qa.quality(7.0f, 4.5f));
    }
    @Test
    void test9() {
        assertEquals("Tốt", qa.quality(7.0f, 8.0f));
    }
}

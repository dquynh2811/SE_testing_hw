import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentEvaluationTest {

    @Test
    public void testInvalidInput_w3() {
        assertEquals("Input không hợp lệ", StudentEvaluation.evaluateStudent(5.0f, new String[]{"A", "d", "A"}));
        assertEquals("Input không hợp lệ", StudentEvaluation.evaluateStudent(-1.5f, new String[]{"A", "d", "A"}));
    }

    @Test
    public void testExcellentStudent_w3() {
        assertEquals("Sinh viên xuất sắc", StudentEvaluation.evaluateStudent(3.7f, new String[]{"A", "B", "A"}));
    }

    @Test
    public void testGoodStudent_w3() {
        assertEquals("Sinh viên giỏi", StudentEvaluation.evaluateStudent(3.3f, new String[]{"A", "B", "A"}));
    }

    @Test
    public void testAcademicWarning_w3() {
        assertEquals("Cảnh cáo học vụ", StudentEvaluation.evaluateStudent(1.5f, new String[]{"A", "d", "A"}));
        assertEquals("Cảnh cáo học vụ", StudentEvaluation.evaluateStudent(1.5f, new String[]{"B", "A", "A"}));
    }

    @Test
    public void testNoTitle_w3() {
        assertEquals("Không có danh hiệu", StudentEvaluation.evaluateStudent(2.7f, new String[]{"A", "B", "A"}));
        assertEquals("Không có danh hiệu", StudentEvaluation.evaluateStudent(2.7f, new String[]{"A", "d", "A"}));
        assertEquals("Không có danh hiệu", StudentEvaluation.evaluateStudent(3.7f, new String[]{"A", "B", "C"}));
        assertEquals("Không có danh hiệu", StudentEvaluation.evaluateStudent(3.3f, new String[]{"A", "d", "A"}));
    }

    @Test
    public void testInvalidInput_w4() {
        assertEquals("Input không hợp lệ", StudentEvaluation.evaluateStudent(5.0f, new String[]{"A", "d", "A"}));
    }

    @Test
    public void testExcellentStudent_w4() {
        assertEquals("Sinh viên xuất sắc", StudentEvaluation.evaluateStudent(3.7f, new String[]{"A", "B", "A"}));
    }

    @Test
    public void testGoodStudent_w4() {
        assertEquals("Sinh viên giỏi", StudentEvaluation.evaluateStudent(3.3f, new String[]{"A", "B", "A"}));
    }

    @Test
    public void testAcademicWarning_w4() {
        assertEquals("Cảnh cáo học vụ", StudentEvaluation.evaluateStudent(1.5f, new String[]{"B", "A", "A"}));
    }

    @Test
    public void testNoTitle_w4() {
        assertEquals("Không có danh hiệu", StudentEvaluation.evaluateStudent(2.7f, new String[]{"A", "d", "A"}));
    }
}

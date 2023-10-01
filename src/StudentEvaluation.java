public class StudentEvaluation {

    public static String evaluateStudent(float GPA, String[] grades) {
        if (GPA > 4.0 || GPA < 0) {
            return "Input không hợp lệ";
        }
        if (allGradesAbove(grades)) {
            if (GPA >= 3.6) {
                return "Sinh viên xuất sắc";
            } else if (GPA >= 3.2) {
                return "Sinh viên giỏi";
            }
        }
        if (GPA < 1.6) {
            return "Cảnh cáo học vụ";
        }
        return "Không có danh hiệu";
    }

    private static boolean allGradesAbove(String[] grades) {
        for (String g : grades) {
            g = g.toUpperCase();
            if ("F".equals(g) || "D".equals(g) || "D+".equals(g) || "C".equals(g)) {
                return false;
            }
        }
        return true;
    }
}
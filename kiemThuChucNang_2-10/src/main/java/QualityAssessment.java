public class QualityAssessment {
    public String quality(float x, float y) {
        if(x < 0 || y < 0 || x > 10 || y > 9) {
            throw new IllegalArgumentException("Invalid numbers");
        }

        String result = "";
        if(x < 3.0 || y < 3.5) {
            result =  "Kém";
        }
        else if(3.0 <= x && x <= 5.0) {
            if(3.5 <= y && y < 6.5) {
                result = "Trung Bình";
            } else if(6.5 <= y && y <= 9.0) {
                result = "Khá";
            }
        }
        else if(5.0 < x && x <= 10.0) { // sai o day ( <10 )
            if(3.5 <= y && y < 6.5) {
                result = "Khá";
            }
            else if(6.5 <= y && y <= 9.0) {
                result = "Tốt";
            }
        }
        return result;
    }
}

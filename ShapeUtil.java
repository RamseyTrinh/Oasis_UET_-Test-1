import java.util.List;

public class ShapeUtil {

    /**
     * info.
     */

    public String printInfo(List<GeometricObject> shapes) {
        String resultCi = "Circle:\n";
        String resultTri = "Triangle:\n";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).getInfo().contains("Circle")) {
                resultCi += shapes.get(i).getInfo();
            } else {
                resultTri += shapes.get(i).getInfo();
            }
        }
        return resultCi + resultTri;
    }
}

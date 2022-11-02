package p733.floodfill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest extends Solution {

    @Test
    public void test() {
        int[][] img = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] expectedImg = new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
        Assertions.assertTrue(isImgSame(expectedImg, floodFill(img, 1, 1, 2)));
    }

    private boolean isImgSame(int[][] img1, int[][] img2) {
        if (img1.length != img2.length) {
            return false;
        }
        for (int i = 0; i < img1.length; i++) {
            if (img1[i].length != img2[i].length) {
                return false;
            }
            for (int j = 0; j < img1[i].length; j++) {
                if (img1[i][j] != img2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

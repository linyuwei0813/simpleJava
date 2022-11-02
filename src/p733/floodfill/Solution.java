package p733.floodfill;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image == null || image.length == 0) {
            return image;
        }
        int originColor = image[sr][sc];
        if (image[sr][sc] != color) {
            dfsFill(image, sr, sc, color, originColor);
        }
        return image;
    }

    private void dfsFill(int[][] image, int sr, int sc, int color, int originColor) {
        if (!(sr >= 0 && sr < image.length && sc >= 0 && sc < image[sr].length) || image[sr][sc] == color) {
            return;
        }
        if (image[sr][sc] == originColor) {
            image[sr][sc] = color;
            dfsFill(image, sr - 1, sc, color, originColor);
            dfsFill(image, sr + 1, sc, color, originColor);
            dfsFill(image, sr, sc - 1, color, originColor);
            dfsFill(image, sr, sc + 1, color, originColor);
        }
    }
}

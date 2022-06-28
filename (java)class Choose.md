package test;

public class Choose {
    public static void main(String[] args) {
        float[] solu = new Choose().solveEquation(new float[]{3, 4, 7}, new float[]{2, -1, 1});
        for (float v : solu) {
            System.out.println(v);
        }
    }

    /**
     * 求解二元一次方程组
     * @param arr1
     * @param arr2
     * @return
     */
    public float[] solveEquation(float[] arr1,float[] arr2){
        float a = arr1[0];
        float b = arr2[0];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] *= b;
            arr2[i] *= a;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] -= arr2[i];
        }
        float y = arr1[2] / arr1[1];
        float x = (arr2[2] - arr2[1]*y) / b;
        return new float[]{x, y};
    }
}

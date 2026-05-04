package Arrays;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int leftmax [] = new int [height.length];
        int rightmax[] = new int [height.length];
        int wl;
        int tw;
        int ttw=0;
        int width=1;
        leftmax[0] = height[0];
        rightmax[rightmax.length-1] = height[height.length-1];
        for(int i=0; i<height.length-1; i++){
            if(height[i+1]<leftmax[i]){
                leftmax[i+1]=leftmax[i];
            }
            else{
                leftmax[i+1]=height[i+1];
            }
        }
        for (int j = height.length - 2; j >= 0; j--) {
            if (height[j] < rightmax[j + 1]) {
                 rightmax[j] = rightmax[j + 1];
            }
            else {
                 rightmax[j] = height[j];
            }
        }
        for(int k=0; k<height.length; k++){
            wl = Math.min(leftmax[k],rightmax[k]);
            tw = (wl-height[k])*width;
            ttw = ttw+tw;
        }
        return ttw;
    }
    public static void main(String[] args){
        int height [] = {4, 2, 0, 6, 3, 2, 5};
        int TrappedWater = trap(height);
        System.out.print("The trapped Water is:" +TrappedWater);
    }
}

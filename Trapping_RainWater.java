import java.util.*;
public class Trapping_RainWater{
    public static void WaterArea(int h[]){
        int maxLeftAux[] = new int[h.length];
        int maxL = Integer.MIN_VALUE;
        int maxRightAux[] = new int[h.length];
        int maxR = Integer.MIN_VALUE;

        //For maxL
        for(int i = 0; i < h.length; i++){
            for(int j = 0; j <= i ; j++){ // note:- the code will 1st compare max h with itself 1st, which is what we want
                if(h[j] > maxL){
                    maxL = h[j];  
                }
            }
            maxLeftAux[i] = maxL;
        }
        //For maxR
        for(int i = 0; i < h.length ; i++){
            for(int j = (h.length - 1) ; j >= i ; j--){
                if(h[j] > maxR){
                    maxR = h[j];
                }
            }
            maxRightAux[i] = maxR;
        }
        
        // now the formula area = SIGMA (waterLVL - height of bar) * width
        
        int areaSum = 0;
        int width = 1;
        for(int i = 0; i < h.length ; i++){
            areaSum += ((Math.min(maxLeftAux[i],maxRightAux[i])) - h[i]) * width;
        }
        System.out.println("The total trapped area of water is " + areaSum);
    
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        WaterArea(height);
    }

}
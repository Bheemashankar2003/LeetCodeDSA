package Arrays;

public class WaterContainer {
    
    public static int area(int [] water ){

        int right = 0;
        int left = water.length-1;
        int area= 0;
        int high = 0;

        while(right < left){
            if(water[right] > water[left]){
                int a = water[left]*(left-right);
                if(a > area){
                    area = a;
                }
                left--;
            }else{
                int b = water[right]*(left-right);
                if(b > area){
                    area = b;
                }
                right++;
                }
        }
        return area;
    }
    public static void main(String[] args) {
        
        int [] water = {7, 8, 2, 4, 6, 5, 7, 6};
        System.out.println(area(water));
    }
}

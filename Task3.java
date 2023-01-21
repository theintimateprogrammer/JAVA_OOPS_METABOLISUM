public class Task3{
    public static void main(String[] args){

        int nums[]={10,20,80,4,100,56,74,65,55,87,26,84,18,96};
        int max,min;

        max = nums[0];
        min = nums[0];

        for (int i : nums){

            if(max<i){
                max = i;
            }
            if(min>i){
                min = i;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
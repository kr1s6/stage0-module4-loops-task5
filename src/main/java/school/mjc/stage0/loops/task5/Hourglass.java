package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int middle = height/2;
        int temp = height;
        int space = 0;
        for(int i=0; i<height; i++){
            if(height % 2 == 0)
                if(i == middle +1){
                    temp = temp + 2;
                    space--;
                }
            for(int z=0; z < space; z++){
                System.out.print(" ");
            }
            for(int j=0; j<temp; j++){
                System.out.print(8);
            }
            for(int z=0; z < space; z++){
                System.out.print(" ");
            }
            if(height % 2 == 0) {
                if(i<middle && temp > 2){
                    temp = temp - 2;
                    space++;}
                else if(i>middle){
                    temp = temp + 2;
                    space--;}
            }
            else {
                if(i>=middle){
                    temp = temp + 2;
                    space--;}
                else{
                    temp = temp - 2;
                    space++;}
            }
            System.out.println();
        }

    }
}

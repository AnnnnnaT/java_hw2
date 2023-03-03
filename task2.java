// 2 . Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.util.logging.*; 
import java.util.Arrays;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) throws IOException {
    
        int[] arr = new int[]{2,3,4,51,32,41,2};
        System.out.println(Arrays.toString(arr));
        System.out.println();
           
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
       
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);     

        for (int i = arr.length -1  ; i >= 1; i--){
            for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                    logger.info(Arrays.toString(arr));
                }
        }
        System.out.println(Arrays.toString(arr));

     
        }
}
     
    
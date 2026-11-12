import java.util.Arrays;

import java.util.Arrays;
public class arraycinema {
    public static void main(String args[]) {
        //ito ay nag i-initializa ng mga bagay sa loob ng boxes of array natin
        String [][]cine = {{"Alice", "Bob", "Charlie"}, {"David", "Emma", "Frank"}};

        cine[0][1] = "Vacant";
        //ito ung pano mag bago ng bagay sa loob ng array natin

        System.out.print(cine[0][1]);
        //ito ung paraan kung pano mag access ng specifc na item sa array boxes natin

};
}
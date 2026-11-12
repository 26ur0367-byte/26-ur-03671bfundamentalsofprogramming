public class arraytemp {
    public static void main(String[] args) {
        double tempa[] = new double[5];
        //ito ung mag d-declare at mag i-initialize ng array na meron 5 elements

        tempa[0] = 32.5;
        tempa[1] = 34.0;
        tempa[2] = 31.8;
        tempa[3] = 33.2;
        tempa[4] = 35.1;
        //ito ung pano mag assign ng value sa mga index nila

        tempa[2] = 32.0;
        //ito ung pano mag update ng value sa mga array kahit na initialize na


        {
            System.out.println("Day 3 updated temperature: " + tempa[2]);
            //ito ung pano i-print ung updated value ng day 3
        }

    }
}

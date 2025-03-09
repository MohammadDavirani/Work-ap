package src.work_ap;


public class W_E5 {
    public static void main(String[] args)
    {

//        for(int i=0 ; i<10 ; i++)
//        {
//
//        }

        String[] cars ={"BMW","Benz","Mazda"};
        for(String i : cars) {
            System.out.format("%s ",i);
        }

        System.out.println();

        double[] floatingPointNumber = {1.2, 8.6, 11, 19.99};
        for(double i:floatingPointNumber)
        {
            System.out.format("%.4f ",i);
        }
    }
}

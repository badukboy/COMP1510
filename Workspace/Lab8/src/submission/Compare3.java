package submission;

public class Compare3 {
    public static String largest(String x, String y , String z) {
        String largest = x;
        if(x.compareTo(y) > 0 && x.compareTo(z) > 0) {
            largest = x;
        } else if (y.compareTo(x) > 0 && y.compareTo(z) >0) {
            largest = y;
        } else {
            largest = z;
        }
        //System.out.println(x.compareTo(y));
        return largest;
    }
}

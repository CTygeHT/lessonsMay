import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] x = {"1", "abc", "7.5", "aaa"};
        double[] y = new double[x.length];
        int k=0;
        for(String el:x){
            try{
                y[k]= Integer.parseInt(el);
                k++;
            } catch (NumberFormatException e){
                try{
                    y[k]= Double.parseDouble(el);
                    k++;
                } catch (NumberFormatException ignored){
                }
            }
        }
        System.out.println(Arrays.toString(y));

    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double[][] arr = new double[12][12];

        int k = 0;
        boolean check = true;
        int value = 11;

        String s = br.readLine();
        double calc = 0;
        for(int i = 0; i < arr.length; i++){
            for(k = 0; k < arr[i].length; k++){
                double a = Double.parseDouble(br.readLine());
                arr[i][k] = a;
            }
        }

        for(int i =11; i >= 0;i--){
            if(value == 5){
                check = false;
                value++;
            }
            for(k = 11; k > value; k--){
                calc = calc+ arr[k][i];
            }

            if(value > 5 && check == true ){
                value--;
            }
            if(check == false){
                value++;
            }
            if(k == 0){
                break;
            }
        }

         DecimalFormat decimal = new DecimalFormat("0.0");
    
        if(s.equals("S")){
            System.out.println(decimal.format(calc));
        }else if(s.equals("M")){
            calc = calc/3;
            System.out.println(decimal.format(calc)); 
        }

        
    }
}

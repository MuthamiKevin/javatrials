package code;
class Input{
    public static void main(String[]args){
       
   String[][] cars = new String[3][3];
   cars[0][0] = "camaro";
   cars[0][1] = "camaro";
   cars[0][2] = "camaro";
   cars[1][0] = "camaro";
   cars[1][1] = "camaro";
   cars[1][2] = "camaro";
   cars[2][0] = "camaro";
   cars[2][1] = "camaro";
   cars[2][2] = "camaro";

    for(int i=0; i<cars.length; i++){
        System.out.println();
        for(int j=0; j<cars[i].length; j++){

            System.out.print(cars[i][j]+" ");
        }

    }






   
    }
}
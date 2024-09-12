import java.util.Scanner;
public class MatricesAdditionAndSubstractionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        //user input matrix 1
        float matrix1 [][] = new float[rows][columns];
        for(int i=0; i<rows; i++) {
            System.out.println("Enter Row "+(i+1)+" of the 1st Matrix: ");
             for(int j=0; j<matrix1[i].length; j++) {
                matrix1[i][j] = scanner.nextFloat();
             }
             
             System.out.println();
        }
        // User input matrix 2
        float matrix2[][] = new float[rows][columns];
        float result[][] = new float[rows][columns];
        for(int i=0; i<rows; i++) {
            System.out.println("Enter Row "+(i+1)+" of the 2nd Matrix: ");
            for(int j=0; j<matrix2[i].length; j++) {
                matrix2[i][j] = scanner.nextFloat();
                
            }
            System.out.println();
        }
        System.out.print("Enter '+' for additon and '-' for substraction: ");
        char character = scanner.next().charAt(0);
        //Performs Addition
        switch(character) {
            case '+' : 
                System.out.println("The result of the addition of two matrices is: ");
                for(int i=0; i<rows; i++) {
                    for(int j=0; j<columns; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                        System.out.print(result[i][j]+" ");
                        
                    }
                    System.out.println();
                }
            break;
            case '-' : 
                System.out.println("The result of the substraction of two matrices is: ");
                for(int i=0; i<rows; i++) {
                    for(int j=0; j<columns; j++) {
                        result[i][j] = matrix1[i][j] - matrix2[i][j];
                        System.out.print(result[i][j]+" ");
                        
                    }
                    System.out.println();
                }    
            break;
            default : System.out.println("Invalid Character!");    
        }
        
        
    }
}


// By Tanishq Sharma
// IT 'B'

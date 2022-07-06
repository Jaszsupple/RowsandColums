
public class RandC {

	public static void main(String[] args) {

		int [] [] number2 = new int [4] [4];

		int rowsa =0;
		int columna= 0;
		int suma = 0;
		for ( rowsa = 0; rowsa < 4; rowsa++) {
			for(columna= 0; columna < 4 ; columna++) {
				number2 [rowsa] [columna] = rowsa*4 +columna+1;	
				if ((rowsa == columna) || (columna + rowsa == 3)) {
					suma += number2[rowsa][columna];					
				}
			}
		}
	
		for ( rowsa = 0; rowsa < 4; rowsa++) {
			for(columna= 0; columna < 4 ; columna++) {
				System.out.print(number2 [rowsa][columna] + "\t" );				
			}		
			System.out.println(" ");			
		}

		System.out.println("the sum is: " + suma);

		int [] [] number = new int [4] [4];

		int rows =0;
		int column= 0;
		int sum = 0;
		for ( rows = 0; rows < 4; rows++) {
			for(column= 0; column < 4 ; column++) {
				number [rows] [column] = rows*4 +column+1;	
				if ((rows == column) || (column + rows == 2)) {
					if ((rows <=2) && (column <=2)) {
						sum += number[rows][column];
					}
				}
			}
		}

		for ( rows = 0; rows < 3; rows++) {
			for(column= 0; column < 3; column++) {
				System.out.print(number [rows][column] + "\t" );				
			}		
			System.out.println(" ");			
		}

		System.out.println("the sum is: " + sum);

	}
}

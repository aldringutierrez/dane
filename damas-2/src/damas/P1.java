package damas;
import java.util.Arrays;
public class P1 {
	public static void main(String[] args) {
		//System.out.println("int[] A)");
		//	int[] A = new int[] { 3, 2, 3, 2, 3 };
		int[] A = new int[] {3,2,3,2,3,5,4,5,7,8,7,8,7,8,7,8 };
		int iParIni=0;
		int iParFin=0;
		int iImpIni=0;
		int iImpFin=0;
		int parAnt=A[0];
		int impAnt=A[1];
//		String[] slices = new String[10];
        int [][] slices= new int[10][10];
		int slicesIni=0;
		int slicesFin=0;
		int slicesCount=0;
		for (int i = 0; i < A.length; i++) {
			if (i%2==0) {
				//System.out.println("par : " + A[i]);
				if (parAnt==A[i]) {
				} else {
					parAnt=A[i];
					impAnt=A[i+1];
					iParFin=i;
					slicesFin=i+1;
//					System.out.println("break par "+" iParIni : "+iParIni+" iParIni : "+iParFin );
					System.out.println("break par slicesCount : "+slicesCount+" slicesIni : "+slicesIni+" slicesFin : "+slicesFin );
					slices[slicesCount++] = Arrays.copyOfRange(A,slicesIni,slicesFin);
					iParIni=i;
					slicesIni=i;
				} 
			} else {
				//System.out.println("impar : " + A[i]);
				if (impAnt==A[i]) {
				} else {
					parAnt=A[i];
					impAnt=A[i+1];
					slicesFin=i+1;
//					System.out.println("break impar "+" iImpIni : "+iImpIni+" iImpIni : "+iImpFin );
					System.out.println("break impar slicesCount : "+slicesCount+" slicesIni : "+slicesIni+" slicesFin : "+slicesFin );
					slices[slicesCount++] = Arrays.copyOfRange(A,slicesIni,slicesFin);
					slicesIni=i;
				}
			} 
		}
		//System.out.println("parIni : " + iParIni+" parFin : " + iParFin);
		//System.out.println("impIni : " + iImpIni+" impFin : " + iImpFin);
		//System.out.println("slices[1].length : " + slices[1].length);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < slices[i].length; j++) {
				System.out.println("slices["+i+"]["+j+"] : " + slices[i][j]);
				
			}
		}
	}
}


//System.out.println("impar : " + A[i]);


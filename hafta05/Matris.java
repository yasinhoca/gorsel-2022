package hafta05;

import java.util.Random;

public class Matris {
	
	static int[][] uret(int satir,int sutun){
		int[][] m = new int[satir][sutun];
		Random r = new Random();
		int i,j;
		
		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				m[i][j] = r.nextInt(50);
			}
		}
		
		return m;		
	}
	
	

}

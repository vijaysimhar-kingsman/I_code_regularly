package takeyouforward;

import java.util.Arrays;

public class column_row_zero_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][]= new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		int row =m.length;
		int col=m[0].length;
		int rows[] = new int [row];
		int cols[] = new int [col];
		Arrays.fill(rows,-1);
		Arrays.fill(cols, -1);
		
		for(int i=0;i<row;i++) {
			for(int j =0;j<col;j++) {
				if(m[i][j]==0) {
					rows[i]=0;
					cols[j]=0;
					
				}
			}
		}for(int i=0;i<row;i++) {
			for(int j =0;j<col;j++) {
				if(rows[i]==0||cols[j]==0){
					
					m[i][j]=0;
					System.out.printf(" %d ",m[i][j]);
					
				}else {
					System.out.printf(" %d ",m[i][j]);
				}
			}System.out.printf("\n");
		}
		

	}

}

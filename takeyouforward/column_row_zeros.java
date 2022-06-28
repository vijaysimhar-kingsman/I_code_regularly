package takeyouforward;

public class column_row_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][]= new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		int row =3;
		int col=4;
		
		
		for(int i=0;i<row;i++) {
			for(int j =0;j<col;j++) {
				if(m[i][j]==0) {
					int k,l;
					k=0;l=j;
					while(k<row) {
						if(m[k][l]!=0) {
							m[k][l]=-1;
							
						}k++;
					}
					k=i;l=0;
					while(l<col) {
						if(m[k][l]!=0) {
							m[k][l]=-1;
							
						}l++;
					}
				}
			}
		}for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(m[i][j]==-1) {
					m[i][j]=0;
					System.out.printf(" %d ",m[i][j]);
				}else {
					System.out.printf(" %d ",m[i][j]);
				}
			}System.out.printf("\n");
		}System.out.print(m);
		
		
		
		
	}

}

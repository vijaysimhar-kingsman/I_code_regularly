package others;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

public class Update {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int arr[]= new int[] {1,0,1,0,0,1};
		int n = arr.length;
		int arr2[]=new int[n];
		//System.out.println("n :"+n);
		//System.out.println("fine 1");
		for(int i=0;i<n;i++) {
			int j=i-2;
			int c=0;
			//System.out.println("i,j : "+i+" "+j);
			//System.out.println("fine 2");
			while(j<=i+2) {
			    //System.out.println("fine 22");
				if(j!=i) {
				    //System.out.println(j);
					if(j<0){ 
					    if(arr[n+j]!=arr[i]){
					        c++;
					    } 
					   j++;
					   continue; 
					}else if(j>=n){ 
					    //System.out.println(j%n);
					    if(arr[j%n]!=arr[i]){
					        c++;
					    } 
					   j++;
					   continue;   
					}
					if(arr[j]!=arr[i]){
					    c++;
					    
					}
				}j++;
				
			}//System.out.println();
			//System.out.println("c"+i+" "+c);
			if(c>=3) {
				if(arr[i]==0) {
				    arr2[i]=1;
				}
				else {
				    arr2[i]=0;
				}
			}else {
				arr2[i]=arr[i];
			}
			

		}
		//System.out.println("fine 3");

		for(int i=0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}

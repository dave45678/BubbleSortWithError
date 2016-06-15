
public class Bubblesort {
	public static void main(String[] args){
		int a[] = new int[4];
		a[0]=34;
		a[1]=29;
		a[2]=69;
		a[3]=33;
		int temp;
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				if (a[j]>a[j+1]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j]=temp;
				}
			}
		}		
		
		for (int i=0;i<4;i++){
			System.out.print(a[i]);
			System.out.println("");
		}	
	}

}

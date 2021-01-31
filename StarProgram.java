class StarProgram{
	public static void main(String[] args){
		for(int i=1; i<=40; i++){
			for(int j=40; j>=i; j--){
				System.out.print("");
			}
			for(int k=1; k<=i; k++){
				System.out.print("*");
			}
			for(int l=2; l<=i; l++){
				System.out.print("*");
			}
			
			System.out.println();
		}  
	}
}
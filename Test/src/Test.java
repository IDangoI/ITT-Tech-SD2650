
public class Test {
	
	public static void main (String[] args){

		int i;
		int j;
		for(i=0; i<6; i++){
			for(j=0;j<6;j++){
				System.out.println("ackerman ("+ i + " : "+ j +") is: "+ ack(i,j));
			}
		}
		
	}
	static int ack(int m, int n){
		int ans;
		if (m == 0){
			ans = n+1;
		}else if(n ==0){
			ans = ack (m-1,1);
		}else{
			ans = ack(m-1, ack(m,n-1));
		}
		return(ans);
	}
}

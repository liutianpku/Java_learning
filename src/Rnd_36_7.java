class Rnd_36_7
{
	public static void main(String[] args)
	{
		int [][]t = new int[3][];
		t[0] = new int [2];
		t[1] = new int [5];
		t[2] = new int [12];
		int a[] = new int[7];
		for( int i=0;i<a.length;i++)
		{
			one_num:
			while(true)
			{
				a[i] = (int)( Math.random()*36 ) +1;

				for( int j=0;j<i;j++ ){ 
					if( a[i]==a[j] ) continue one_num;
				}
				break;
			}
		}
		for( int num: a) System.out.print( num+" " ); 
		System.out.println();
	}
}

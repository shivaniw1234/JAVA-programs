///////////////******************************
public class Two_dArray {

	public static void main(String[] args) {
          
		int [][] twoarr = new int[3][4];
		int i,j;
		System.out.println(twoarr.length);
		for(i=0;i<twoarr.length;i++)
		{
			for(j=0;j<twoarr[i].length;j++)
			{
				twoarr [i][j]=i+j;
			}
		}
		display_twoarr(twoarr);
		
	}
	
	public static void display_twoarr(int [][] two)
	{
		int i,j;
		for(i=0;i<two.length;i++)
		{
			for(j=0;j<two[i].length;j++)
			{
				System.out.print(" "+two[i][j]);
			}
			System.out.println();
		}
	}
       system.out.println("Krishna Dope");
 }

/* Scanner sc = new Scanner(System.in)
 * int [][]twoarr=new int[3][];
 * for(int i=0;i<twoarr.length;i++)
 * {
 *   int m = sc.nextint();
 *   int twoarr[i]=new int[m];
 *   }
 *   
 *   if u want to take rows size from user then u have to follow this :
 *   sop("enter number of rows: ");
 *   int n = sc.nextInt();
 *   int twoarr[][] = new int[n][];
 *   * for(int i=0;i<twoarr.length;i++)
 * {
 *   sop("Enter no.of col for "+i+"th row");
 *   int m = sc.nextint();
 *   int twoarr[i]=new int[m];
 *   }
 *   
 *   */
/*
 public class twod_arr {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int twoarr[][]=new int[3][];
        for (int i = 0; i < twoarr.length; i++) 
        {
            for (int j = 0; j < twoarr[i].length; j++) 
            {
                int m=sc.nextInt();
                twoarr[i]=new int[m];
            }
        }
        display_twoarr(twoarr);
    }

    static void display_twoarr(int [][]two)
    {
        int i,j;
        for (i = 0; i < two.length; i++) 
        {
            for (j = 0; j < two[i].length; j++) 
            {
                System.out.print(two[i][j]+" ");
            }
            System.out.println();
        }
    }
}

 */

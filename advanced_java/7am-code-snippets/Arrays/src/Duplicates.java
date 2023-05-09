public class Duplicates {	
		public static void main(String[] args) {
			int arr[] = {10,10,2,2,3,3,3,3,3,3,4,5,10,2,34,12,33,4};
			int a[] = {};
			for(int i =0;i<arr.length;i++)
			{
			    for(int j =0;j<=i;j++)
			    {
			        if(arr[i] != a[i+1])
			        {
			
			            a[j] = arr[i];
			        }
			    }
			}
			for(int i =0;i<a.length;i++)
			{
			System.out.println(a[i] + " ");
			}
		}
}

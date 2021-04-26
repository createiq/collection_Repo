package com.createiq.tasks;

public class SecondLargetNum {
	
	public static void main(String[] args) 
	{
	
	int[] a= new int[]{20,10,55,82,15,42,2};
	int temp=0;
	System.out.println("this is orginal array:");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	
	for(int i=0;i<a.length;i++)
	{
		for( int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{	
			temp=a[i ];
			a[i]=a[j];
			a[j]=temp;
			}
		}
	
	}
	System.out.println("elements of array sorted in ascending order:");
	/*for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
	}
	*/
	for(int i:a)//for each loop
	{
		System.out.println(i+" ");
	
	}

	//Arrays.stream(a).filter(i->i%2==0).forEach(System.out::println);
	System.out.println("second largest number:"+a[a.length-2]);

	}

}

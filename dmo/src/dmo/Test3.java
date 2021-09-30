package dmo;

public class Test3 {


public static void main(String[] args) {
	
	int arr[] = {5,5,5};
	
	solution(arr);
}


public static int solution(int[] A) {
    // write your code in Java SE 8
	
	
	int mul=1;
	int r=0;

for(int i=A.length-1;i>=0;i--)
{
mul=A[i]*mul;

}


if(mul==30)
{
	r= 1;
}
else if(mul==-30)
{
	r= -1;
}
else
{
	r= 0;
}


return r;

}

}
#include <iostream>

using namespace std;

int abs(int x)
{
	if(x < 0 )
	{
		x = x * -1;
		
		return x;
	}
	
	return x;
}


int main()
{
	int a, b, c, d,mov=0;
	
	cin >> a >> b >> c >> d;
	
	while(true)
	{
		if((a+b)%2 != (c+d)%2)
		{
			mov -= 1;
			break;
		}
		if(abs(c-a)%2==0 && abs(d-b)%2==0 )
		{
			mov += 1;
			break;
		}
		
		else
		{
			d--;
			c--;
			mov +=1;
		}
	}
	cout << mov <<endl;
	
	return 0;
}

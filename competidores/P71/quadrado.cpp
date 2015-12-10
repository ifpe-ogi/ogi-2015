#include<iostream>
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
	int i;
	int vet[8];

	for(i=0;i<8;i++)
	{
		cin >> vet[i];
	}
		
	if(abs((vet[0]+vet[1])-(vet[2]+vet[3])) == ((vet[4]+vet[5])-(vet[6]+vet[7])))
	{
		cout << 'S' <<endl;
	}
	else
	{
		cout << 'N' <<endl;
	}
	
	return 0;
}

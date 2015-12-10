#include <iostream>
using namespace std;

int pow(int a, int b)
{
	int c = a;
	
	for(int i=b;i>1;i--)
	{
		a = a * c;
	}
	
	return a;
}
int main ()
{
	int pri, seg;
	
	int vet1[4];
	char vet2[2];
	
	cin >> vet1[0] >> vet2[0] >> vet1[1] >> vet1[2] >> vet2[1] >> vet1[3];
	
	switch(vet2[0])
	{
		case '+':
			pri = vet1[0] + vet1[1];
			break;
			
		case 'x':
			pri = vet1[0] * vet1[1];
			break;
		
		case '^':
			pri = pow(vet1[0], vet1[1]);
			break;	
	}

	switch(vet2[1])
	{
		case '+':
			seg = vet1[2] + vet1[3];
			break;

		case 'x':
			seg = vet1[2] * vet1[3];
			break;
		
		case '^':
			seg = pow(vet1[2], vet1[3]);
			break;	
	}
	
	if(pri > seg)
	{
		cout << ">"<<endl;
	}

	if(pri < seg)
	{
		cout << "<"<<endl;
	}
	
	if(pri == seg)
	{
		cout << "="<<endl;
	}
		
	return 0;
}

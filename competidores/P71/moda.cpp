#include <stdio.h>
using namespace std;

int main()
{

	int n,i,j, aux =0;
	
	while(scanf("%d", &n))
	{
		int vet[n];
	
		for(i=0;i<n;i++)
		{
			scanf("%d", &vet[i]);
			
			if(i >0)
			{
				for(j=0;j<i;j++)
				{
					if(vet[i] == vet[j])
					{
						vet[i] = -vet[i];  	
					}
				}
			}
			aux += vet[i];
		}
		
		printf("%d\n", aux);
		aux = 0;
	}
	
	return 0;
}

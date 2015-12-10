#include <stdio.h>

void quickSort(int valor[], int esq, int dir){
	
	int i, j, x, y;
	
	i = esq; j = dir; x = valor[(esq+dir)/2];
	
	while(i <=j){
	
		while(valor[i] < x && i < dir){
			i++;
		}

		while(valor[j] > x && j > esq){
			j--;
		}
		
		if(i <=j){
			
			y = valor[i];
			valor[i] = valor[j];
			valor[j] = y;
			i++;
			j--;
		}
		
	}
	
	if(i < dir) quickSort(valor, i, dir);
	
	if(j > esq) quickSort(valor, esq, j);
	
}


int main(){
	
	int n, i, j, a, cont = 0, soma=0, teste = 1;
	
	
	while(1){
	scanf("%d", &n);
	
	if(n == 0) break;
	
	int vetor[n];
	
	for(i = 0; i < n; i++) scanf("%d", &vetor[i]);
	
	quickSort(vetor, 0, n-1);
	
	for(i = 0; i < n; i++){
		
		a = vetor[i];
		if(i == (n - 1)) break;
		
		for(j = i+1; j < n; j++){
			
			if(vetor[j] == a) cont = cont - a - vetor[j];
	
		}
	
	}
	
	for(i = 0; i < n; i++) soma = soma + vetor[i];
	
	printf("Teste %d\n", teste);
	printf("%d\n\n", (soma + cont));
	soma = 0;
	cont = 0;
	teste++;	
	}
	
	return 0;
}

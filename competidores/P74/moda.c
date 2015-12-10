#include <stdio.h>
int dividir(int vetor[], int esq, int dir){
	int aux;
	int cont = esq;
	int i = 0;
	for(i=esq+1; i<=dir; i++){
		if(vetor[i]<vetor[esq]){
			cont++;
			aux=vetor[i];
			vetor[i]=vetor[cont];
			vetor[cont]=aux;
		}
	}
		aux=vetor[esq];
		vetor[esq]=vetor[cont];
		vetor[cont]=aux;
		return cont;
}
void quick(int vetor[], int esq, int dir){
	int pivo;
	if(esq<dir){
		pivo = dividir(vetor,esq,dir);
		quick(vetor,esq,pivo-1);
		quick(vetor,pivo+1,dir);
	}	
}
int main(){	
	int n = 0, i = 0, soma = 0, j = 0, cont = 1;
	while(scanf("%d",&n) != 0){
	int vetor[n];
	for(i=0; i<n; i++){
		scanf("%d",&vetor[i]);
	}
quick(vetor,0,n);
	for(i=0; i<n; i++){
		if(vetor[i]==vetor[i+1]){
			i++;
			i++;
		}
		soma = soma+vetor[i];
	}
		printf("%d\n",soma);
		soma = 0;
	}
	return 0;
}

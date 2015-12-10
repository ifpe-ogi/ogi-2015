#include <stdio.h>
#include <math.h>

int main(){
	
	int n1, n2, n3, n4, res1, res2,i=1;
	char op1, op2;	
		
	scanf("%d%c%d %d%c%d", &n1, &op1, &n2, &n3, &op2, &n4);
		
	if(op1 == '+') res1 = n1+n2;
	
	if(op1 == 'x') res1 = n1*n2;		
	
	if(op1 == '^') {
	
		res1 = n1;
		
		while(i < n2){
			res1 = res1*n1;	
			i++;
		}
		i=1;
	}
		
	if(op2 == '+') res2 = n3+n4;
		
	if(op2 == 'x') res2 = n3*n4;		
	
	if(op2 == '^') {
	
		res2 = n3;
		
		while(i < n4){
			res2 = res2*n3;	
			i++;
		}
		i=1;
	}
	
	if(res1 > res2){
		printf(">");
	}

	if(res1 = res2){
		printf("=");
	}
	
	if(res1 < res2){
		printf("<");
	}
	
	//printf("%d %d", res1, res2);
	
	return 0;

}

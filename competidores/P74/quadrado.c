#include <stdio.h>
int main(){
	int x1,x2,x3,x4,y1,y2,y3,y4,l1,l2,l3,l4,cont =0;
	scanf("%d %d %d %d %d %d %d %d",&x1,&y1,&x2,&y2,&x3,&y3,&x4,&y4);
		l1 = y1-x1;
		if(l1<0){
			l1 = l1*(-1);
		}
		l2 = y2-x2;
		if(l2<0){
			l2 = l2*(-1);
		}
		l3 = y3-x3;
		if(l3<0){
			l3 = l3*(-1);
		}
		l4 = y4-x4;
		if(l4<0){
			l4 = l4*(-1);
		}
		if(l1 == l2 || l1 == l3 || l1 == l4){
			cont++;
		}
		if(l2 == l1 || l2 == l3 || l2 == l4){
			cont++;
		}
		if(l3 == l1 || l3 == l2 || l3 == l4){
			cont++;
		}
		if(l4 == l1 || l4 == l2 || l4 == l3){
			cont++;
		}
		if(cont == 4){
			printf("S");
		}else{
			printf("N");
		}
		return 0;
}

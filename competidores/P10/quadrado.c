#include <stdio.h>

int main(){
	
	int x1, y1, x2, y2, x3, y3, x4, y4;
		
		scanf("%d %d %d %d %d %d %d %d", &x1, &y1, &x2, &y2, &x3, &y3, &x4, &y4);
		
		if(((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) == ((x3-x4)*(x3-x4) + (y3-y4)*(y3-y4)) && ((x1-x4)*(x1-x4) + (y1-y4)*(y1-y4)) == ((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2)))
		printf("S");
		
		else if(((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) == ((x1-x4)*(x1-x4) + (y1-y4)*(y1-y4)) && ((x3-x4)*(x3-x4) + (y3-y4)*(y3-y4)) == ((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2))) 
		printf("S");
		
		else if(((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) == ((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2)) && ((x3-x4)*(x3-x4) + (y3-y4)*(y3-y4)) == ((x1-x4)*(x1-x4) + (y1-y4)*(y1-y4)))
		printf("S");
		
		else printf("N");
		return 0;	
}

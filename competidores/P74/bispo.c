#include <stdio.h>
int main(){
	int x1,y1,x2,y2;
	scanf("%d %d %d %d",&x1,&y1,&x2,&y2);
    while(x1!=0 && y1 != 0 && x2 != 0 && y2 != 0){
	if(x1%2==0 && x2%2==0 || y1%2==0 && y2==0){
		printf("1");
	}
	if(x1%2==0 && x2%2!=0 || y1%2==0 && y2%2!=0){
		printf("2");
	}
	if(x1%2!=0 && x2%2==0 && y1%2!=0 && y2%2!=0 || x2%2!=0 && x1%2==0 && y1%2!=0 && y2%2!=0){
		printf("-1");
	}
    }
	return 0;
}

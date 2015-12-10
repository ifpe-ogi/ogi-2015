#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x1,y1,x2,y2,x3,y3,x4,y4;

        scanf("%d %d %d %d %d %d %d %d", &x1,&y1,&x2,&y2,&x3,&y3,&x4,&y4);


        if( (x1==x2) &&( x3==x4)&& ( (y1-y2)==(y3-y4) ) ){
            printf("S");
        } else if( (y2-y1==y3-y4)&&(x2-x1==x3-x4) ) {
            printf("S");
        }else{
            printf("N");
        }
    return 0;
}

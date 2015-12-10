#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x1,y1,x2,y2;

while(1){

        scanf("%d %d %d %d",&x1,&y1,&x2,&y2);
            if(x1==0 && y1==0 && x2==0 && y2==0){
                    break;
            }

        if( (x1+y1==y2) || (x2+y2==y1) || (x1+y1 ==x2+y2 ) || (x1-y1 ==x2-y2 )) {
            printf("1\n");
        }else if( (x1+y1)%2==0 && (x2+y2)%2!=0) {
            printf("-1\n");
        }
}
    return 0;
}

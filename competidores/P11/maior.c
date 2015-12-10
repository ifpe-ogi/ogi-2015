#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(){
   int n1,n2,n3,n4;
   double resp1=0,resp2=0;
   char op1,op2;

        scanf("%d %c %d %d %c %d",&n1, &op1, &n2, &n3, &op2, &n4);

        if(op1== 'x'){
            resp1=n1*n2;
        }
        if(op1== '+'){
            resp1=n1+n2;
        }
        if(op1== '^'){
            resp1=pow(n1,n2);
        }

        if(op2== 'x'){
            resp2=n3*n4;
        }
        if(op2== '+'){
            resp2=n3+n4;
        }
        if(op2== '^'){
            resp2=pow(n3,n4);
        }


        if(resp1<resp2){
            printf("<");
        }else if(resp1>resp2){
            printf(">");
        }else{
            printf("=");
        }
return 0;
}

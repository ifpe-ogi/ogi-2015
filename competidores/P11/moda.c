#include <stdio.h>
#include <stdlib.h>

int main(){

 int n,soma=0,i=0,j=0;



    while( scanf("%d", &n)!=0) {
        int v[n];
        for(i=0; i< n; i++){
            scanf("%d",&v[i]);
        }

        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(v[j]==v[i]){
                    v[j]=2000;
                    v[i]=2000;
                }
            }
        }

        for(i=0; i<n; i++){
            if(v[i]!=2000){
                soma+=v[i];
            }
        }

        printf("%d", soma);
            soma=0;

    }
    return 0;
}

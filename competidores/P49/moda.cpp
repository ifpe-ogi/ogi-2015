#include <iostream>
#include <cstdio>
#include <vector>
using namespace std;
void quick(int v[],int esquerda,int direita){
    int pivot = v[(esquerda+direita)/2];
    int i = esquerda;
    int j = direita;
    int aux;

    while(i <= j){
        while(v[i] < pivot)
            i++;
        while(v[j] > pivot)
            j--;
        if(i <= j){
            aux = v[i];
            v[i] = v[j];
            v[j] = aux;
            i++;
            j--;
        }
    };

    if(i < direita)
        quick(v,i,direita);
    if(j > esquerda)
        quick(v,esquerda,j);
}
int main(){
    int n;

    while(scanf("%d",&n) != 0){

        int v[n];
        int contador = 0;
        int moda = -99999;

        vector<int> remocao;
        vector<int> remover;

        for(int i = 0;i<n;i++){
            cin>>v[i];
        }

        quick(v,0,n-1);

        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(v[i] == v[j]){
                    ++contador;
                    remocao.push_back(i);
                    remocao.push_back(j);
                }
            }
            if(contador >= moda){
                moda = contador;
                remover.clear();

                for(int i = 0;i<remocao.size();i++){
                    remover.push_back(remocao[i]);
                }
            }
            contador = 0;
        }

        for(int i = 0;i<remover.size();i++){
            if(v[remover[i]] != -9999)
                v[remover[i]] = -9999;
        }

        int soma = 0;

        for(int i = 0;i<n;i++){
            if(v[i] > -1001 && v[i] < 1001)
                soma += v[i];
        }
        cout<<soma<<endl;
    }

    return 0;
}


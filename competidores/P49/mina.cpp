#include <iostream>
using namespace std;
int main(){
    int n;

    cin>>n;

    int matriz[n][n];
    int gerada[n][n];

    for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            cin>>matriz[i][j];
        }
    }
    for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            gerada[i][j] = 0;
        }
    }

    for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            if(i != 0 && j != 0){
                for(int x = 0;x<n;x++){
                    for(int y = 0;y<n;y++){
                        if(matriz[x][y] == 1 && x != i && y != j){
                            gerada[i][j]++;
                        }
                    }
                }
            }
        }
    }
     for(int i = 0;i<n;i++){
        for(int j = 0;j<n;j++){
            cout<<gerada[i][j]<<" ";
        }
        cout<<endl;
    }

    return 0;
}

#include <iostream>
using namespace std;
int main(){
    int x1,y1,x2,y2;

    while(true){
        cin>>x1>>y1>>x2>>y2;

        if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)
            break;

        if((x1-y1) == (x2-y2)){
            cout<<1<<endl;
        }else if((x1-y1) == 0 && (x2-y2) > 0){
            cout<<-1<<endl;
        }else if((x1-y1) == 0 && (x2-y2) > 0){
            cout<<-1<<endl;
        }else if(x1 == x2 && y2 == y1+1){
            cout<<-1<<endl;
        }else if(x1 == x2+1 && y2 == y1){
            cout<<-1<<endl;
        }else
            cout<<2<<endl;
    }

    return 0;
}

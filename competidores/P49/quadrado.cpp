#include <iostream>
#include <cmath>
using namespace std;
int main(){

    float d1,d2;

    int x1,y1,x2,y2,x3,y3,x4,y4;

    cin>>x1>>y1>>x2>>y2>>x3>>y3>>x4>>y4;

    float primeiro = pow(x1-x2,2);
    float segundo = pow(y1-y2,2);

    d1 = sqrt(primeiro+segundo);

    float terceiro = pow(x3-x4,2);
    float quarto = pow(y3-y4,2);

    d2 = sqrt(terceiro+quarto);

    if(d1 == d2)
        cout<<"S"<<endl;
    else
        cout<<"N"<<endl;

    return 0;
}

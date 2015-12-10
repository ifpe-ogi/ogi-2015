#include <iostream>
#include <cmath>
using namespace std;
int main(){

    long n1,n2,n3,n4;
    char op1,op2;
    float calc1,calc2;

    cin>>n1>>op1>>n2>>n3>>op2>>n4;

    if(op1 == '+'){
        calc1 = n1+n2;
        //cout<<calc1<<endl;
    }
    else if (op1 == 'x'){
        calc1 = n1 * n2;
        //cout<<calc1<<endl;
    }
    else if (op1 == '^'){
        //cout<<n1<<" "<<n2<<endl;
        calc1 = pow(n1,n2);
        //cout<<calc1<<endl;
    }

    if(op2 == '+'){
        calc2 = n3+n4;
        //cout<<calc2<<endl;
    }
    else if(op2 == 'x'){
        calc2 = n3 * n4;
        //cout<<calc2<<endl;
    }
    else if (op2 == '^'){
        //cout<<n3<<" "<<n4<<endl;
        calc2 = pow(n3,n4);
        //cout<<calc2<<endl;
    }

    if(calc1 > calc2)
        cout<<">"<<endl;
    else if (calc1 < calc2)
        cout<<"<"<<endl;
    else if (calc1 == calc2)
        cout<<"="<<endl;
    return 0;
}

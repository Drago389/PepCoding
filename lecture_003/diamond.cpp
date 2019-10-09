#include<iostream>

using namespace std;

    void diamond(int n){
        int nsp = n/2;
        int nst = 1;
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                cout<<" ";

            }
            for(int cst = 1;cst<=nst;cst++){
                cout<<"*";
            }
            if(r<=n/2){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }
            cout<<endl;
        
        }
    }
int main(int args,char** argv){
    int n;
    cin>>n;
    diamond(n);
    return 0;




    }









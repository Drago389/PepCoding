#include<iostream>
using namespace std;
int fact(int n){
    if(n<=1){
        return 1;
    }int res=fact(n-1);
    return res*n;
}



int main(int args, char** argv ){
    int n;
    cin>>n;
    cout<<fact(n)<<endl;
    return 0;

}
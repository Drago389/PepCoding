#include<iostream>
using namespace std;
int printDecreasing_returnType(int st,int end){
    if(st==end){
        cout<<st<<" ";
        return st-1;
    }
    int head = printDecreasing_returnType(st+1,end);
        cout<<head<<" ";

        return head-1;
    
}



int main(int args, char** argv ){
    int st,end;
    cin>>st>>end;
    //printIncre(st,end);
    printDecreasing_returnType(st,end);


}
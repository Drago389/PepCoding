#include<iostream>
using namespace std;
void printIncre(int st,int end){
    if(st==end+1){
        return;
    }
        cout<<st<<" ";
        printIncre(st+1,end);
    
}



int main(int args, char** argv ){
    int st,end;
    cin>>st>>end;
    printIncre(st,end);
    return 0;


}
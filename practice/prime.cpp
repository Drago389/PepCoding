#include<iostream>
using namespace std;
int main(int args,char** argv){

    int n , i;
    bool isPrime = true;
    cout <<"Enter a no:";
    cin >> n;
    for(i = 2;i<= n / 2; i++){
        if( n % i == 0){
            isPrime = false;
            break;


        }


    }
    if (isPrime)
        cout<<"this is a prime no:";
    else
        cout<<"this is not a prime no:";

     return 0;   



    
}
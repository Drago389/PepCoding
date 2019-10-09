#include<iostream>
#include<vector>
using namespace std;
int main(){

        
        
        vector<int> arr={1,23,124,234,54,6,8,89};
        int n = arr.size();
   for(int i=0;i<n;i++){
       for(int j=1;j<n-i;j++){
           if(arr[j-1]>arr[j]){
               swap(arr[j-1],arr[j]);
           }
       }
   } 
   for(int i=0;i<arr.size();i++)
   {
       cout<<arr[i]<<",";
   }
}
#include<iostream>
#include<vector>
using namespace std;
void input(vector<vector<int> > &v){
    for(int row = 0;row<v.size();row++){
        for(int col = 0;col<v[0].size();col++){
            cin>>v[row][col];
        }
    }
}
void display(vector<vector<int> > &v){
    for(int row = 0;row<v.size();row++){
        for(int col = 0;col<v[0].size();col++){
            cout<<v[row][col]<<" ";
        }
    }}
    void waveprint(vector<vector<int> > &v){
        for (int row = 0;row<v.size();row++){
            if(row%2==0){
                for (int col=v[0].size()-1;col>=0;col--){
                    cout<<v[row][col]<<" ";
                }
            }
            else{
                for(int col=0;col<v[0].size();col++){
                    cout<<v[row][col]<<" ";
                }
            }cout<<endl;
        }
    }
    int main(){
        int n,m;
        cin>>n>>m;
        vector<vector<int>> v(n,vector<int>(m,0));
        input(v);
        waveprint(v);
        return 0;
    }     
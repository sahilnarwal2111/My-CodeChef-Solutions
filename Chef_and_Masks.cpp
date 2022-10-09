#include<iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    for(int i = 0 ; i< t; i++){
        int x, y;
        cin>>x>>y;
        x = x*100;
        y = y * 10;
        if(x>y) cout<<"Cloth"<<endl;
        else if(x<y) cout<<"Disposable"<<endl;
        else cout<<"Cloth"<<endl;
    }
}

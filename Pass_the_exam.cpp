#include<iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    for(int i = 0 ; i< t; i++){
        int a,b,c;
        cin>>a>>b>>c;
        int total = a + b + c;
        if(total>=100 && a>=10 && b>=10 && c>=10){
            cout<<"Pass"<<endl;
        }
        else
        {
           cout<<"Fail"<<endl;
        }
        

    }

}

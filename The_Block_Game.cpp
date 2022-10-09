#include<iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    for(int i = 0 ; i< t; i++){
        string str;
        cin>>str;
        int flag =0;
        int n = str.length();
        for(int j=0 ; j<n;j++){
            if(str[j] == str[n-j]) flag =1;
            else {
                flag =0;
                break;
            }

        }
    }

}

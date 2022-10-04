#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int x,y,z;
	    int a,b,c;
	    cin>>x>>y>>z;
	    cin>>a>>b>>c;
	    if((x+y+z)>(a+b+c)){
	        cout<<"DRAGON"<<endl;
	    }
	    else if((x+y+z)<(a+b+c)){
	        cout<<"SLOTH"<<endl;
	    }
	    else if((x+y+z)==(a+b+c)){
	        if(x>a){
	            cout<<"DRAGON"<<endl;
	        }
	        else if(x<a){
	            cout<<"SLOTH"<<endl;
	        }
	        else if(x==a){
	            if(y>b){
	                cout<<"DRAGON"<<endl;
	            }
	            else if(y<b){
	                cout<<"SLOTH"<<endl;
	            }
	            else{
	                if(z>c){
	                    cout<<"DRAGON"<<endl;
	                }
	                else if(z<c){
	                    cout<<"SLOTH"<<endl;
	                }
	                else
	                cout<<"TIE"<<endl;
	            }
	        }
	        
	    }
	}
	return 0;
}

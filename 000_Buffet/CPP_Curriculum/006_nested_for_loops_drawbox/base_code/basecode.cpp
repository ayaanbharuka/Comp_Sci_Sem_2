// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int height = 0;
	int width = 0;
	char symbol;
	
	cout<<"please enter a width: ";
	cin>>width;
	cout<<"please enter a height: ";
	cin>>height;
	cout<<"please enter a symbol: ";
	cin>>symbol;
	
	for(int i = 0; i < height; i++){
		for(int j = 0; j < width; j++){
			cout<<symbol;
		}
		cout<<endl;
	}
}

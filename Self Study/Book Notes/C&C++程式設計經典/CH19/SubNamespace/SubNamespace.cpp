#include <cstdlib>
#include <iostream>

using namespace std;
namespace IBM{
	namespace Taiwan {           // 子命名空間 Taiwan
		class Notebook {

		};
	}
	namespace Japan {            // 子命名空間 Japan
		class Notebook {

		};
  	}
}

namespace Acer{
	class Notebook {
  	
	};
}

int main(int argc, char** argv) {
   IBM::Taiwan::Notebook A ;
   IBM::Japan::Notebook B ;
   Acer::Notebook C ; 
   system("PAUSE");
   return 0;
}

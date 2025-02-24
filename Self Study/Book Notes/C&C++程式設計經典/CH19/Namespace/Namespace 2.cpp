#include <cstdlib>
#include <iostream>

using namespace std;
// 定義 IBM 命名空間
namespace IBM	{
	class Notebook {

	};
}

// 定義 Compaq 命名空間
namespace Acer	{
	class Notebook  {

  };
}

int main(int argc, char** argv) {
	IBM::Notebook A;
	Acer::Notebook B;
    system("PAUSE");
    return 0;
}

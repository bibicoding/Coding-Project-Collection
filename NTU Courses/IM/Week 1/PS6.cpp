#include <iostream>
using namespace std;

int main() {

  int a = 0;
  int flag = 0;

  cin >> a;

  while (a != 1 || flag == 0) {
    flag = 1;
    if (a % 2 == 0) {
      a = a / 2;
    } else {
      a = a * 3 + 1;
    }
    if (a == 1) {
      cout << a;
      break;
    }
    cout << a << ",";
  }

  return 0;
}

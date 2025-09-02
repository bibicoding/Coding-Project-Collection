#include <iostream>
using namespace std;

int main() {

  int n = 0, t = 0, sum = 0, last = 0;
  cin >> n >> t;

  for (int i = 0; i < n; i++) {
    int theValue = 0;
    cin >> theValue;

    if (theValue == t) {
      break;
    }
    sum += theValue;
  }

  cout << sum;

  return 0;
}

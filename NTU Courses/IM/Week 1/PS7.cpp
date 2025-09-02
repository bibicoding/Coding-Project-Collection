#include <iostream>
using namespace std;

int main() {

  int a = 0, b = 0, c = 0, q = 0, maxProfit = 0;
  cin >> a >> b >> c;

  int p = (a + b * c) / (2 * b);

  q = a - b * p;

  maxProfit = (a - b * p) * (p - c);

  cout << p << "," << maxProfit;

  return 0;
}
